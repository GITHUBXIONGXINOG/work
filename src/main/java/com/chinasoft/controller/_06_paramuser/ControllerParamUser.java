package com.chinasoft.controller._06_paramuser;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("/paramuser")
public class ControllerParamUser {
	
	@RequestMapping(value="/method09")
	@ResponseBody
	public String save9() throws IOException{
		login_User   user = new login_User();
		user.setUsername("zhang");
		user.setPassword("1234");
		//json转换工具
		ObjectMapper objectMapper = new ObjectMapper();
		String json = objectMapper.writeValueAsString(user);		
		 return json; 
//		 http://localhost:8080/work/paramuser/method09
		 
	}
	

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
	public ModelAndView method02(login_User user){
		System.out.println("接收参数的第二种方式");
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());

		return null;
		
	}
	
	@PostMapping("method03")
	public ModelAndView method03(login_User user){
		System.out.println("接收参数的第二种方式");
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
	
		return null;
		
	}
	
	@RequestMapping("method04")
	public ModelAndView method04(login_User user){
		System.out.println("接收参数的第4种方式");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/main");
		System.out.println(mav);
		return mav;
		
	}
	
 
	@RequestMapping(value="/method05")
	@ResponseBody
	public String save5() throws IOException{
		 return "{\"username\":\"zhangsan\",\"age\":18}"; 
//		 http://localhost:8080/work/paramuser/method05
	}
	
	@RequestMapping(value="/method06")
	@ResponseBody
	public login_User save6() throws IOException{
		login_User   user = new login_User();
		user.setUsername("zhang");
		user.setPassword("1234");
		return user;
	}
		
	 
}
