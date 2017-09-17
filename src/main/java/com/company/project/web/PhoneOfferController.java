package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PhoneOffer;
import com.company.project.service.PhoneOfferService;
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
@RequestMapping("/phone/offer")
public class PhoneOfferController {
    @Resource
    private PhoneOfferService phoneOfferService;

    @PostMapping("/add")
    public Result add(PhoneOffer phoneOffer) {
        phoneOfferService.save(phoneOffer);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        phoneOfferService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(PhoneOffer phoneOffer) {
        phoneOfferService.update(phoneOffer);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        PhoneOffer phoneOffer = phoneOfferService.findById(id);
        return ResultGenerator.genSuccessResult(phoneOffer);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<PhoneOffer> list = phoneOfferService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
