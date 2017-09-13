package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PhoneLog;
import com.company.project.service.PhoneLogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

import static com.company.project.utils.DateUtils.getDate;

/**
* Created by CodeGenerator on 2017/09/06.
*/
@RestController
@RequestMapping("/phone/log")
public class PhoneLogController {
    @Resource
    private PhoneLogService phoneLogService;



    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        phoneLogService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(PhoneLog phoneLog) {
        phoneLogService.update(phoneLog);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        PhoneLog phoneLog = phoneLogService.findById(id);
        return ResultGenerator.genSuccessResult(phoneLog);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<PhoneLog> list = phoneLogService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
    @PostMapping("/addw")
    public Result addw(PhoneLog phoneLog) {
        System.out.println(phoneLog.getPhone().getId());
        phoneLog.setCreateTime(getDate());
        phoneLogService.add(phoneLog);
        return ResultGenerator.genSuccessResult(phoneLog);
    }

}
