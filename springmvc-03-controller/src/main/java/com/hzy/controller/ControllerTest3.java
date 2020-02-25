package com.hzy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test3")
public class ControllerTest3 {

    @RequestMapping("/hello1")
    public String test1(Model model) {
        model.addAttribute("msg", "Test1");
        return "test";
    }
}
