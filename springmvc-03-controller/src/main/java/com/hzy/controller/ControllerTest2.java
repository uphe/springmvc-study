package com.hzy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //加了该注解，说明这个类就是一个控制器了,可以被Spring接管
//该类中的所有方法如果返回值为String，并且有具体的页面可以跳转，那么就会被试图器解析
public class ControllerTest2 {

    @RequestMapping("/hello1")
    public String Test1 (Model model) {
        model.addAttribute("msg", "Test1");
        return "test";//这里被解析为/WEB-INF/jsp/test.jsp
    }

    //这里可以写多个，视图可以被复用
    @RequestMapping("/hello2")
    public String Test2 (Model model) {
        model.addAttribute("msg", "Test2");
        return "test";
    }

}
