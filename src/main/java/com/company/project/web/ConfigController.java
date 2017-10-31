package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.core.TableResult;
import com.company.project.model.Config;
import com.company.project.service.ConfigService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/10/31.
*/
@RestController
@RequestMapping("/config")
public class ConfigController {
    @Resource
    private ConfigService configService;

    @PostMapping("/add")
    public Result add(Config config) {
        configService.save(config);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        configService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Config config) {
        configService.update(config);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Config config = configService.findById(id);
        return ResultGenerator.genSuccessResult(config);
    }

    @PostMapping("/list")
    public Result alist(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Config> list = configService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @GetMapping("/list")
    public TableResult list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer limit) {
        PageHelper.startPage(page, limit,true);
        List<Config> list = configService.findAllRely();
        PageInfo<Config> pageInfo = new PageInfo<Config>(list);
        long total = pageInfo.getTotal(); //获取总记录数
        return new TableResult().setCode(0).setCount(total).setData(list);
    }
}
