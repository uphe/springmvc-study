package com.hzy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RestFulController {
    // 传统的传参：http://localhost:8080/test1?a=1
    @RequestMapping("/test1")
    public String test1(int a, Model model) {
        model.addAttribute("msg", "结果为" + a);
        return "test";
    }
    // 传统的传参：http://localhost:8080/test2?x=2
    @RequestMapping("/test2")
    public String test2(@RequestParam("x") int a, Model model) {
        model.addAttribute("msg", "结果为" + a);
        return "test";
    }
    // RestFull传参：http://localhost:8080/test3/3
    @RequestMapping("/test3/{a}")
    public String test3(@PathVariable("a") int a, Model model) {
        model.addAttribute("msg", "结果为" + a);
        return "test";
    }
    // RestFull传参：http://localhost:8080/test4/4
    @RequestMapping("/test4/{x}")
    public String test4(@PathVariable("x") int a, Model model) {
        model.addAttribute("msg", "结果为" + a);
        return "test";
    }

}
