package com.hzy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResultSpringMVC {
    @RequestMapping("/t1")
    public String test1(Model model) {
        //转发（默认的）
        model.addAttribute("msg","test1");
        return "test";
    }

    @RequestMapping("/t2")
    public String test2(Model model) {
        //重定向 (redirect)
        model.addAttribute("msg","test3");
        return "redirect:aa/aa.jsp";
    }
}
