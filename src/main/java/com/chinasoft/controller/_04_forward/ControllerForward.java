package com.chinasoft.controller._04_forward;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("forward")
public class ControllerForward {

	
	@RequestMapping("method01")
	public  ModelAndView method01(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("forward", "this is forward!");
		mav.setViewName("/WEB-INF/jsps/forward.jsp");
		return mav;
		
	}
	
	
	
	@RequestMapping("method02")
	public  String method02(Model model){
		model.addAttribute("forward", "this is  second  forward！");
		System.out.println("这个是转发的第二种方式");
		return "/WEB-INF/jsps/forward.jsp";
		
	}
	
	@RequestMapping("method05")
	public  String method05(Map map){
		map.put("forward", "this is  five  forward！");
		System.out.println("这个是转发的第五种方式");
		return "forward";
		
	}
	
}
