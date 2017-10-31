package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.TableResult;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Business;
import com.company.project.service.BusinessService;
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
* Created by CodeGenerator on 2017/11/01.
*/
@RestController
@RequestMapping("/business")
public class BusinessController {
    @Resource
    private BusinessService businessService;

    @PostMapping("/add")
    public Result add(Business business) {
        businessService.save(business);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        businessService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Business business) {
        businessService.update(business);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Business business = businessService.findById(id);
        return ResultGenerator.genSuccessResult(business);
    }

    @PostMapping("/list")
    public Result alist(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Business> list = businessService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @GetMapping("/list")
    public TableResult list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer limit) {
        PageHelper.startPage(page, limit,true);
        List<Business> list = businessService.findAll();
        PageInfo<Business> pageInfo = new PageInfo<Business>(list);
        long total = pageInfo.getTotal(); //获取总记录数
        return new TableResult().setCode(0).setCount(total).setData(list);
    }
}
