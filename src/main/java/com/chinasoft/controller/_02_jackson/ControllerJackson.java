package com.chinasoft.controller._02_jackson;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/json")
public class ControllerJackson {

	@RequestMapping("/method01")
	@ResponseBody
	public String  method01(){
		System.out.println("hello jackson");
		return "hello world!";
	}
	
	
	@RequestMapping("method02")
	@ResponseBody
	public User method02(){
		User user = new  User(1, "уехЩ", "2", new Date());
		return user;
	}
	
}
