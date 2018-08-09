package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.core.TableResult;
import com.company.project.model.Account;
import com.company.project.service.AccountService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/")
public class PageController {


    @GetMapping("/page")
    public String list() {
        return "ftl/urlRecord_admin";

    }

    @GetMapping("/page/{model}")
    public String gotoModel(@PathVariable("model") String model) {
        return "/admin/"+model + "/index";


    }

    @GetMapping("/page/{model}/{page}")
    public String gotoModelPage(@PathVariable("model") String model, @PathVariable("page") String page) {
        return "/admin/"+model + "/" + page;

    }

    @GetMapping("/login")
    public String login() {
        return "login_two_columns";

    }


}
