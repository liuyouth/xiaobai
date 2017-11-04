package com.company.project.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by MacBook on 2017/8/22.
 */
@Controller
@RequestMapping("/upin")
public class UpinViewController {

    @RequestMapping("/admin")
    public String toPhone(){

        return "admin/upin_admin";
    }
    @RequestMapping("/type")
    public String toIndex(){

        return "admin/upinType_admin";
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
