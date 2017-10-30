package com.company.project.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by MacBook on 2017/8/22.
 */
@Controller
@RequestMapping("/admin")
public class AdminViewController {

    @RequestMapping("/phone")
    public String toPhone(){

        return "admin/phone";
    }
    @RequestMapping("/index")
    public String toIndex(){

        return "admin/index";
    }

    @RequestMapping("/table")
    public String totable(){

        return "admin/table_data_tables";
    }

    @RequestMapping("/phones")
    public String totables(){

        return "admin/phones";
    }


}
