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
	 * ��һ�ַ�ʽ
	 * 		�ٷ����Ĳ�������ǰ̨���ݵĲ�������Ҫ��ͬ��˳��û�й�ϵ�����Բ��ô������ǻ�Ϊnull
	 * @param name
	 * @param password
	 * @return
	 */
	@RequestMapping("method01")
	public ModelAndView method01(@RequestParam("username")String name,String password){
		System.out.println("���ղ����ĵ�һ�ַ�ʽ");
		System.out.println("name�ǣ�"+name);
		System.out.println("password�ǣ�"+password);
		return null;
		
	}
	
	@RequestMapping("method02")
	public ModelAndView method02(User user){
		System.out.println("���ղ����ĵڶ��ַ�ʽ");
		System.out.println(user.getName());
		System.out.println(user.getAge());
		return null;
		
	}
	
	@PostMapping("method03")
	public ModelAndView method03(User user){
		System.out.println("���ղ����ĵڶ��ַ�ʽ");
		System.out.println(user.getName());
		System.out.println(user.getAge());
		return null;
		
	}
}
