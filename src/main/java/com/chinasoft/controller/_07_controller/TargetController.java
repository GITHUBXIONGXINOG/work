package com.chinasoft.controller._07_controller;

 
 
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public class TargetController {

@RequestMapping("/target")
public ModelAndView show() {
	System.out.println("目标资源执行...");
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.addObject("name","itcast");
	modelAndView.setViewName("index");
	return modelAndView;
	}	

}
