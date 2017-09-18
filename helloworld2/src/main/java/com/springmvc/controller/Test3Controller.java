package com.springmvc.controller;

import com.springmvc.entity.User;
import com.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * Created by Pengbing on 2017/4/23.
 */
@Controller
public class Test3Controller {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/test3/postUser",method=RequestMethod.GET)
    public String toUserPost(){
        return "userPost";
    }

    @RequestMapping(value="/test3/postUser",method=RequestMethod.POST)
    public String doUserPost(@ModelAttribute User user, Model model){
        user.setCreatetime(new Date());
        String result;
        if(userService.insert(user) == 1)
            result = "插入成功！";
        else
            result = "插入失败！";
        model.addAttribute("reuslt",result);
        return "userPost";
    }


    @RequestMapping(value="/test3/getAll",method=RequestMethod.GET)
    public String getAll(Model model){
        model.addAttribute("list",userService.selectAll());
        return "userList";
    }
}
