package com.hzy.controller;

import com.hzy.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    // 访问方式：http://localhost:8080/u1?username=hello
    @GetMapping("/u1")
    //在前端接收的数据最好用上@RequestParam，证明这是前端接收的
    public String test1(@RequestParam("username") String name, Model model) {
        model.addAttribute("msg",name);//这就是把后台的数据返回到前端的最常有的方式
        return "test";
    }

    // 访问方式：http://localhost:8080/u2?id=123&name=hello
    // 这里传了id和name，这里我们接受的是User，他自动给我们封装了
    // 如果我们没有传参数，默认为空：User{id=0, name='null'}
    @RequestMapping("/u2")
    public String test2(User user,Model model) {
        model.addAttribute("msg",user);
        return "test";
    }
    // 用RestFul风格操作对象传参
    // 访问方式：http://localhost:8080/u3/123/hello
    @RequestMapping("/u3/{id}/{name}")
    public String test3(@PathVariable("id") int id,@PathVariable("name") String name, User user,Model model) {
        model.addAttribute("msg",user);
        return "test";
    }
}
