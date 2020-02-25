package com.hzy.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //模型和试图
        ModelAndView mv = new ModelAndView();
        //封装对象
        mv.addObject("msg","Hello SpringMVC");
        //封装要跳转的试图
        mv.setViewName("/WEB-INF/jsp/hello.jsp");
        return mv;
    }
}
