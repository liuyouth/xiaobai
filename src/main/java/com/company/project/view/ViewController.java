package com.company.project.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by MacBook on 2017/8/22.
 */
@Controller
public class ViewController {


    @RequestMapping("/admin/{name}")
    public String toPhone(@PathVariable("name") String name){
        String r = "admin/"+name;
        return r;
    }

    @RequestMapping("/upin")
    public String toUpin(){
        return "upin/index";
    }
    @RequestMapping("/cash")
    public String toCash(){
        return "cash/index";
    }
    @RequestMapping("/person")
    public String toPerson(){
        return "person/index";
    }
    @RequestMapping("/")
    public String toIndex(){
        return "index";
    }


}
