package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.TableResult;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Upin;
import com.company.project.net.NetClient;
import com.company.project.net.TaobaoUtil;
import com.company.project.service.UpinService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
* Created by GitHub Id = liuyouth on 2017/11/19.
*/
@RestController
@RequestMapping("/upin")
public class UpinController {
    @Resource
    private UpinService upinService;

    private NetClient client = new NetClient().initWebClient();
    private TaobaoUtil taobaoUtil = new TaobaoUtil();
    @PostMapping("/add")
    public Result add(Upin upin, HttpServletRequest request) {
        String ip = NetClient.getIp2(request);
        //ip有时候获取不到
        if (!"".equals(ip))
            upin.setIpAddress(ip);
        //文案是否为空
        if (upin.getInfo() != null && !"".equals(upin.getInfo())) {
            String[] wordsArray = upin.getInfo().trim().split("\\s+");
            for(int i = wordsArray.length - 1; i >= 0 ; i--)
            {
                String regex1 = "http(.*)";
                Pattern pattern1 = Pattern.compile(regex1);
                Matcher m1 = pattern1.matcher(wordsArray[i]);
                int countAll1 = m1.groupCount();//
                while (m1.find()){
                    if (countAll1>0) {
                        System.out.println(m1.group(0));
                        upin.setUrl(m1.group(0));
                    } else {
                        System.out.println("非法网址");
                    }
                }
            }
            //设置默认分类
            if (upin.getTypeId()==null||0== upin.getTypeId()){
                upin.setTypeId(1);
            }
            //文案包含网址
            if (!"".equals(upin.getUrl())) {
                //联网获取属性
                try {
                    String d = client.get(upin.getUrl());
                    upin = taobaoUtil.getImg(upin, d);
//                d = client.getForWeb(upin.getFuligou());
//                upin = taobaoUtil.getFuligou(upin,d);

                } catch (IOException e) {
                    e.printStackTrace();
//            }catch (InterruptedException e){
//                e.printStackTrace();
                }

                upinService.save(upin);
                return ResultGenerator.genSuccessResult();
            }else{
                //文案不包含网址
                return ResultGenerator.genFailResult("分享文案错误,不包含网址");
            }
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
        List<Upin> list = upinService.findAll();
        PageInfo<Upin> pageInfo = new PageInfo<Upin>(list);
        long total = pageInfo.getTotal(); //获取总记录数
        return new TableResult().setCode(0).setCount(total).setData(list);
    }


    @PostMapping("/praise")
    public Result praise(@RequestParam Integer id) {
        Upin upin = upinService.findById(id);
        upin.setPraiseNum(upin.getPraiseNum()+1);
        upinService.update(upin);
        return ResultGenerator.genSuccessResult(upin);
    }
}
