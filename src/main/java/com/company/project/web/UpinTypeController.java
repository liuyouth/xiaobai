package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.TableResult;
import com.company.project.core.ResultGenerator;
import com.company.project.model.UpinType;
import com.company.project.service.UpinTypeService;
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
* Created by GitHub Id = liuyouth on 2017/11/04.
*/
@RestController
@RequestMapping("/upin/type")
public class UpinTypeController {
    @Resource
    private UpinTypeService upinTypeService;

    @PostMapping("/add")
    public Result add(UpinType upinType) {
        upinTypeService.save(upinType);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        upinTypeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(UpinType upinType) {
        upinTypeService.update(upinType);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        UpinType upinType = upinTypeService.findById(id);
        return ResultGenerator.genSuccessResult(upinType);
    }

    @PostMapping("/list")
    public Result alist(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<UpinType> list = upinTypeService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @GetMapping("/list")
    public TableResult list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer limit) {
        PageHelper.startPage(page, limit,true);
        List<UpinType> list = upinTypeService.findAll();
        PageInfo<UpinType> pageInfo = new PageInfo<UpinType>(list);
        long total = pageInfo.getTotal(); //获取总记录数
        return new TableResult().setCode(0).setCount(total).setData(list);
    }
}
