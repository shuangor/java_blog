package com.winterchen.controller;

import com.github.pagehelper.PageHelper;
import com.winterchen.model.UserDomain;
import com.winterchen.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/8/16.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping("/add")
    public int addUser(@RequestBody UserDomain user){
        System.out.println("----user------");
        System.out.println(user.getUserName());
        System.out.println(user.getPassword());
        return userService.addUser(user);
    }

    @ResponseBody
    @PostMapping("/login")
    public Object login(@RequestBody UserDomain user) {
        System.out.println("--login-----");
        System.out.println(user.getUserName());
        System.out.println(user.getPassword());
        Map<String, String> map = new HashMap<String, String>();
        Boolean islogin = userService.loginUser(user.getUserName(), user.getPassword());
        String a;
        if (islogin == true) {
            a = "1";
        } else {
            a = "0";
        }
        map.put("stats", a);
        return map;
    }

    @GetMapping("/all")
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize){
        return userService.findAllUser(pageNum,pageSize);
    }
}
