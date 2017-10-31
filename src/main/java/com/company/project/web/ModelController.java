package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.core.TableResult;
import com.company.project.model.Model;
import com.company.project.service.ModelService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/10/31.
*/
@RestController
@RequestMapping("/model")
public class ModelController {
    @Resource
    private ModelService modelService;

    @PostMapping("/add")
    public Result add(Model model) {
        modelService.save(model);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        modelService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Model model) {
        modelService.update(model);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Model model = modelService.findById(id);
        return ResultGenerator.genSuccessResult(model);
    }



    @GetMapping("/list")
    public TableResult list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer limit) {
        PageHelper.startPage(page, limit,true);
        List<Model> list = modelService.findAll();
        PageInfo<Model> pageInfo = new PageInfo<Model>(list);
        long total = pageInfo.getTotal(); //获取总记录数
        return new TableResult().setCode(0).setCount(total).setData(list);
    }
}
