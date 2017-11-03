package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.TableResult;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Model;
import com.company.project.service.ConfigService;
import com.company.project.service.ModelService;
import com.company.project.utils.DateUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
* Created by CodeGenerator on 2017/11/02.
*/
@RestController
@RequestMapping("/model")
public class ModelController {
    @Resource
    private ModelService modelService;
    @Resource
    private ConfigService configService;

    @PostMapping("/add")
    public Result add(Model model) {
        if (null==model.getCreateTime() || "".equals(model.getCreateTime())){
            model.setCreateTime(DateUtils.getDate());
        }
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

    @PostMapping("/list")
    public Result alist(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Model> list = modelService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @GetMapping("/list")
    public TableResult list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer limit) {
        PageHelper.startPage(page, limit,true);
        List<Model> list = modelService.findAllRely();
        List<Model> resultList =new ArrayList<>();
        for (Model m:list) {
            m.setColor(configService.findById(m.getColorId()));
            m.setMemory(configService.findById(m.getMemoryId()));
            m.setModel(configService.findById(m.getModelId()));
            m.setNetworkLock(configService.findById(m.getNetworkLockId()));
            m.setSupportNetwork(configService.findById(m.getNetworkLockId()));
            resultList.add(m);
        }

        PageInfo<Model> pageInfo = new PageInfo<Model>(resultList);
        long total = pageInfo.getTotal(); //获取总记录数
        return new TableResult().setCode(0).setCount(total).setData(resultList);
    }
}
