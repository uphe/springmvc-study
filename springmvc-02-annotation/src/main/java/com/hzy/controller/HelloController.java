package com.hzy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String Hello(Model model) {
        model.addAttribute("msg", "Hello SpringMVC");
        //被试图解析器处理，拼接成/WEB-INF/jsp/hello.jsp
        return "hello";
    }
}
