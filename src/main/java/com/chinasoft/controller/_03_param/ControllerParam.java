package com.chinasoft.controller._03_param;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/param")
public class ControllerParam {

	/**
	 * 第一种方式
	 * 		①方法的参数名的前台传递的参数名字要相同，顺序没有关系，可以不用传，但是会为null
	 * @param name
	 * @param password
	 * @return
	 */
	@RequestMapping("method01")
	public ModelAndView method01(@RequestParam("username")String name,String password){
		System.out.println("接收参数的第一种方式");
		System.out.println("name是："+name);
		System.out.println("password是："+password);
		return null;
		
	}
	
	@RequestMapping("method02")
	public ModelAndView method02(User user){
		System.out.println("接收参数的第二种方式");
		System.out.println(user.getName());
		System.out.println(user.getAge());
		return null;
		
	}
	
	@PostMapping("method03")
	public ModelAndView method03(User user){
		System.out.println("接收参数的第二种方式");
		System.out.println(user.getName());
		System.out.println(user.getAge());
		return null;
		
	}
}
