package com.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloMvcController {

	@RequestMapping("/mvc")
	//host:8080/hello/mvc
	public String helloMvc(){
		return "home"
	}
}
