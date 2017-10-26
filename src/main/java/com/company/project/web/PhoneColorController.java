package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.core.TableResult;
import com.company.project.model.PhoneColor;
import com.company.project.service.PhoneColorService;
import com.github.pagehelper.ISelect;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2017/09/17.
 */
@RestController
@RequestMapping("/phone/color")
public class PhoneColorController {
    @Resource
    private PhoneColorService phoneColorService;

    @PostMapping("/addw")
    public Result addw(PhoneColor phoneColor) {
        phoneColorService.save(phoneColor);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        phoneColorService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(PhoneColor phoneColor) {
        phoneColorService.update(phoneColor);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        PhoneColor phoneColor = phoneColorService.findById(id);
        return ResultGenerator.genSuccessResult(phoneColor);
    }

    @PostMapping("/list")
    public TableResult list(@RequestParam(defaultValue = "0") Integer page
            , @RequestParam(defaultValue = "0") Integer limit) {
        PageHelper.startPage(page, limit,true);
        List<PhoneColor> list = phoneColorService.findAll();
        PageInfo<PhoneColor> pageInfo = new PageInfo<PhoneColor>(list);
        long total = pageInfo.getTotal(); //获取总记录数
        //PageInfo pageInfo = new PageInfo(list);
        return new TableResult().setCode(0).setCount(total).setData(list);
    }
}
