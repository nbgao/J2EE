package com.springmvc.controller;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

/**
 * Created by Pengbing on 2017/4/16.
 */

@Controller
public class mainController {

    @RequestMapping("test/href1")
    public String test1(){
        return "test1";
    }


    @RequestMapping("test/href2")
    public String test2(Model model){
        Random random = new Random();
        model.addAttribute("data", random.nextInt(100));
        return "test2";
    }

    @RequestMapping("test/href3/data={chuan}")
    public String test3(@PathVariable("chuan")String data, Model model){
        model.addAttribute("data",data);
        return "test2";
    }

    //GET 传值方法
    @RequestMapping(value = "test/href4", method = RequestMethod.GET)
    public String test4(@RequestParam("t1") int begin,
                        @RequestParam("t2") int end,
                        Model model){
        Random random = new Random();
        model.addAttribute("data",begin + random.nextInt( end - begin));
        model.addAttribute("begin",begin);
        model.addAttribute("end",end);
        model.addAttribute("method","GET");
        return "test3";
    }

    //POST 传值方法
    @RequestMapping(value = "test/href4", method = RequestMethod.POST)
    public String test5(@RequestParam("t1") int begin,
                        @RequestParam("t2") int end,
                        Model model){
        Random random = new Random();
        model.addAttribute("data",begin + random.nextInt(end - begin));
        model.addAttribute("beign",begin);
        model.addAttribute("end",end);
        model.addAttribute("method","POST");
        return "test3";
    }
}
