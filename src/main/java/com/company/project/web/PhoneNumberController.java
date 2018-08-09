package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.TableResult;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PhoneNumber;
import com.company.project.service.PhoneNumberService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import javax.annotation.Resource;
import java.util.List;

/**
* Created by GitHub Id = liuyouth on 2018/01/16.
*/
@RestController
@RequestMapping("/phone/number")
public class PhoneNumberController {
    @Resource
    private PhoneNumberService phoneNumberService;

    @PostMapping("/add")
    public Result add(PhoneNumber phoneNumber) {
        phoneNumberService.save(phoneNumber);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        phoneNumberService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(PhoneNumber phoneNumber) {
        phoneNumberService.update(phoneNumber);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        PhoneNumber phoneNumber = phoneNumberService.findById(id);
        return ResultGenerator.genSuccessResult(phoneNumber);
    }

    @PostMapping("/list")
    public Result alist(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<PhoneNumber> list = phoneNumberService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @GetMapping("/list")
    public TableResult list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer limit) {
        PageHelper.startPage(page, limit,true);
        List<PhoneNumber> list = phoneNumberService.findAll();
        PageInfo<PhoneNumber> pageInfo = new PageInfo<PhoneNumber>(list);
        long total = pageInfo.getTotal(); //获取总记录数
        return new TableResult().setCode(0).setCount(total).setData(list);
    }
}
