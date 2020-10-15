package com.chinasoft.controller._01_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerHello {
	
	@RequestMapping("hello.do")
	public ModelAndView hello(){
		System.out.println("hello  world!");
		return null;
		
	}
}
