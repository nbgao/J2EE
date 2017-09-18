package com.springmvc.controller;


import com.springmvc.entity.TeacherInfo;
import com.springmvc.service.TeacherService;
import com.springmvc.util.Encryption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

import static com.springmvc.util.Encryption.MD5;


/**
 * Created by Pengbing on 2017/5/6.
 */

@Controller
public class mainController{

    @Autowired
    private TeacherService teacherService;

    //跳转到注册页面
    @RequestMapping(value = "/test5/register", method = RequestMethod.GET)
    public String toRegister(){
        return "Register";
    }

    //实现注册功能
    @RequestMapping(value = "/test5/register", method = RequestMethod.POST)
    public String insertTeacher(@ModelAttribute TeacherInfo teacherInfo, Model model){
        TeacherInfo record = new TeacherInfo();
        record.setTname(teacherInfo.getTname());
        List<TeacherInfo> list = teacherService.selectSelective(record);
        if(list.size() == 0){
            teacherInfo.setTpassword(MD5(teacherInfo.getTpassword()));
            if(teacherService.insert(teacherInfo) == 1)
                model.addAttribute("result",1);
            else
                model.addAttribute("result",0);
        }else{
            model.addAttribute("result",2);
        }

        return "Register";
    }


    //跳转到登录界面
    @RequestMapping(value = "/test5/login", method = RequestMethod.GET)
    public String toLogin(){
        return "Login";
    }

    //实现登录功能，将用户信息保存在session里
    @RequestMapping(value = "/test5/login", method = RequestMethod.POST)
    public String doLogin(HttpSession session,Model model,@ModelAttribute TeacherInfo teacherInfo){
        ArrayList<TeacherInfo> list;
        TeacherInfo record = new TeacherInfo();
        record.setTname(teacherInfo.getTname());
        list = teacherService.selectSelective(record);
        if(list.size() == 0){
            model.addAttribute("result","0");
        }else{
            record.setTpassword(MD5(teacherInfo.getTpassword()));
            list = teacherService.selectSelective(record);
            if(list.size() == 0)
                model.addAttribute("result","0");
            else{
                record = list.get(0);

                //将用户信息保存在session里面
                session.setAttribute("teacherInfo",record);

                model.addAttribute("result","2");
            }
        }
        return "Login";
    }

    //从中session获取把个人信息
    @RequestMapping(value = "/test5/teacherInfo", method = RequestMethod.GET)
    public String toInfo(Model model, HttpSession session){
        TeacherInfo teacherInfo = (TeacherInfo) session.getAttribute("teacherInfo");
        if(teacherInfo != null)
            model.addAttribute("teacherInfo",teacherInfo);
        return "teacherInfo";
    }

    //退出登录，注销用户
    @RequestMapping(value = "/test5/logout", method = RequestMethod.GET)
    public String logout(HttpSession session){
        session.invalidate();

        return "Login";
    }
}
