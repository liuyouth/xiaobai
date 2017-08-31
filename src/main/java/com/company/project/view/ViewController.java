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

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public ModelAndView welcome(@PathVariable("name") String name) {

        ModelAndView model = new ModelAndView();
        model.setViewName(name);
       // model.addObject("name", name);

        return model;

    }


}
