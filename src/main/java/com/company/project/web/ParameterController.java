package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.core.TableResult;
import com.company.project.model.Parameter;
import com.company.project.service.ParameterService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/10/31.
*/
@RestController
@RequestMapping("/parameter")
public class ParameterController {
    @Resource
    private ParameterService parameterService;

    @PostMapping("/add")
    public Result add(Parameter parameter) {
        parameterService.save(parameter);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        parameterService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Parameter parameter) {
        parameterService.update(parameter);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Parameter parameter = parameterService.findById(id);
        return ResultGenerator.genSuccessResult(parameter);
    }

    @PostMapping("/list")
    public Result alist(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Parameter> list = parameterService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @GetMapping("/list")
    public TableResult list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer limit) {
        PageHelper.startPage(page, limit,true);
        List<Parameter> list = parameterService.findAll();
        PageInfo<Parameter> pageInfo = new PageInfo<Parameter>(list);
        long total = pageInfo.getTotal(); //获取总记录数
        return new TableResult().setCode(0).setCount(total).setData(list);
    }
}
