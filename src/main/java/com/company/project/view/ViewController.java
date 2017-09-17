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
@RequestMapping("/v")
public class ViewController {

    @RequestMapping("/phone")
    public String toPhone(){

        return "phone";
    }

    @RequestMapping(value = "/{n}/{nn}/{nnn}", method = RequestMethod.GET)
    public ModelAndView welcome(@PathVariable("n") String n,@PathVariable("nn") String nn,@PathVariable("nnn") String nnn) {
        System.out.println(" 跳转至  "+n+"/"+nn+"/"+nnn);
        ModelAndView model = new ModelAndView();
        model.setViewName(n+"/"+nn+"/"+nnn);
       // model.addObject("name", name);

        return model;

    }


}
