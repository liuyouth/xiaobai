package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.TableResult;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Person;
import com.company.project.service.PersonService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by GitHub Id = liuyouth on 2017/12/29.
*/
@RestController
@RequestMapping("/person")
public class PersonController {
    @Resource
    private PersonService personService;

    @PostMapping("/add")
    public Result add(Person person) {
        personService.save(person);
        return ResultGenerator.genSuccessResult();
    }



    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        personService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(@RequestBody Person person) {
        System.out.println(person.getPersonId());
        person.setPersonId(3);
        personService.update(person);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Person person = personService.findById(id);
        return ResultGenerator.genSuccessResult(person);
    }

    @PostMapping("/list")
    public Result alist(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Person> list = personService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @GetMapping("/list")
    public TableResult list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer limit) {
        PageHelper.startPage(page, limit,true);
        List<Person> list = personService.findAll();
        PageInfo<Person> pageInfo = new PageInfo<Person>(list);
        long total = pageInfo.getTotal(); //获取总记录数
        return new TableResult().setCode(0).setCount(total).setData(list);
    }
}
