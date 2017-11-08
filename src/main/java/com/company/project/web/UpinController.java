package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.TableResult;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Upin;
import com.company.project.service.UpinService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import javax.annotation.Resource;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
* Created by GitHub Id = liuyouth on 2017/11/05.
*/
@RestController
@RequestMapping("/upin")
public class UpinController {
    @Resource
    private UpinService upinService;

    @PostMapping("/add")
    public Result add(Upin upin) {
        if (upin.getInfo() != null && !"".equals(upin.getInfo())) {
            String url = "";
            String regex = "￥http://(.*?)[//w////-/:](.*?)=(.*?)=......";
            Pattern pattern = Pattern.compile(regex);
            Matcher m = pattern.matcher(upin.getInfo());
            int countAll = m.groupCount();//
            while (m.find()){
////                for (int i = 0; i < countAll; i++) {
////                    System.out.println(m.group(i));
////                    url = url+m.group(i);
////                    upin.setUrl(url);
////                }
                if (countAll>0) {
                    upin.setUrl(m.group(0));
                } else {
                    System.out.println("非法网址");
                }
            }
            String regex1 = "http(.*)";
            Pattern pattern1 = Pattern.compile(regex1);
            Matcher m1 = pattern1.matcher(upin.getInfo());
            int countAll1 = m1.groupCount();//
            while (m1.find()){
////                for (int i = 0; i < countAll; i++) {
////                    System.out.println(m.group(i));
////                    url = url+m.group(i);
////                    upin.setUrl(url);
////                }
                if (countAll1>0) {
                    upin.setUrl(m1.group(0));
                } else {
                    System.out.println("非法网址");
                }
            }

            if (upin.getTypeId()==null||0== upin.getTypeId()){
                upin.setTypeId(1);
            }
            upinService.save(upin);
            return ResultGenerator.genSuccessResult();
            //  return ResultGenerator.genFailResult("分享文案为空");
        } else {
            return ResultGenerator.genFailResult("分享文案为空");
        }

    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        upinService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Upin upin) {
        upinService.update(upin);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Upin upin = upinService.findById(id);
        return ResultGenerator.genSuccessResult(upin);
    }

    @PostMapping("/list")
    public Result alist(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Upin> list = upinService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @GetMapping("/list")
    public TableResult list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer limit) {
        PageHelper.startPage(page, limit,true);
        List<Upin> list = upinService.findAllRely();
        PageInfo<Upin> pageInfo = new PageInfo<Upin>(list);
        long total = pageInfo.getTotal(); //获取总记录数
        return new TableResult().setCode(0).setCount(total).setData(list);
    }

}
