package org.roronoa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontController {

    @RequestMapping("/add")
    public ModelAndView home(@RequestParam("n1") int n1 , @RequestParam("n2") int n2){
        Integer result = n1 * n2;
        System.out.println(result);
        ModelAndView mv = new ModelAndView();

        mv.setViewName("display");
        mv.addObject("result",result);
        return mv;
    }
}
