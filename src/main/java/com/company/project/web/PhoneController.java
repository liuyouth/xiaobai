package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Phone;
import com.company.project.service.PhoneService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/08/22.
*/
@RestController
@RequestMapping("/phone")
public class PhoneController {
    @Resource
    private PhoneService phoneService;

    /**
     * 前台通过 ajax data：{xxxx}
     * @param phone
     * @return
     */
    @PostMapping("/addw")
    public Result addForWeb(Phone phone) {
        phoneService.save(phone);
        return ResultGenerator.genSuccessResult();
    }

    /**
     * android 通过 @Body
     * @param phone
     * @return
     */
    @PostMapping("/adda")
    public Result addForAndroid(@RequestBody Phone phone) {
        phoneService.save(phone);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        phoneService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Phone phone) {
        phoneService.update(phone);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Phone phone = phoneService.findById(id);
        return ResultGenerator.genSuccessResult(phone);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Phone> list = phoneService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
