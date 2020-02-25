package com.hzy.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hzy.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController //加上这个注解，这个类中的所有方法就不会走视图解析器了
//@Controller
public class UserController {


    // @ResponseBody //加上这个注解，这个方法就不会走视图解析器了
    // 由于该类已经加@RestController，所以不用写@ResponseBody了
    // 访问：http://localhost:8080/t1?name=hzy&age=20&sex=man
    @RequestMapping("/t1")
    public String test1(User user) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        //将一个对象转化为JSON串
        String s = mapper.writeValueAsString(user);
        return s;
    }

    // 访问：http://localhost:8080/t2
    @RequestMapping("/t2")
    public String test2() throws JsonProcessingException {
        User user1 = new User("uphe",20,"man");
        User user2 = new User("uphe",20,"man");
        User user3 = new User("uphe",20,"man");
        List<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        ObjectMapper mapper = new ObjectMapper();
        //将一个集合转化为JSON串
        String s = mapper.writeValueAsString(list);
        return s;
    }

    // 访问：http://localhost:8080/t3
    @RequestMapping("/t3")
    public String test3() throws JsonProcessingException {
        User user1 = new User("hzy",20,"man");
        User user2 = new User("hzy",20,"man");
        List<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        //java对象转化为json串
        String s1 = JSON.toJSONString(user1);
        System.out.println(s1);
        String s2 = JSON.toJSONString(list);
        System.out.println(s2);

        //json串转化为java对象
        User user = JSON.parseObject(s1,User.class);
        System.out.println(user);

        return "hello";
    }
}
