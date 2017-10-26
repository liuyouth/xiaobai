package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.core.TableResult;
import com.company.project.model.PhoneColor;
import com.company.project.model.PhoneModel;
import com.company.project.service.PhoneModelService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/09/23.
*/
@RestController
@RequestMapping("/phone/model")
public class PhoneModelController {
    @Resource
    private PhoneModelService phoneModelService;

    @PostMapping("/add")
    public Result add(PhoneModel phoneModel) {
        phoneModelService.save(phoneModel);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        phoneModelService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(PhoneModel phoneModel) {
        phoneModelService.update(phoneModel);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        PhoneModel phoneModel = phoneModelService.findById(id);
        return ResultGenerator.genSuccessResult(phoneModel);
    }


    @PostMapping("/list")
    public TableResult list(@RequestParam(defaultValue = "0") Integer page
            , @RequestParam(defaultValue = "0") Integer limit) {
        PageHelper.startPage(page, limit,true);
        List<PhoneModel> list = phoneModelService.findAll();
        PageInfo<PhoneModel> pageInfo = new PageInfo<PhoneModel>(list);
        long total = pageInfo.getTotal(); //获取总记录数
        //PageInfo pageInfo = new PageInfo(list);
        return new TableResult().setCode(0).setCount(total).setData(list);
    }
}
