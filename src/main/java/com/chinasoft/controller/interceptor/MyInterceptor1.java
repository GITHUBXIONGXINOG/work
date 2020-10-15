package com.chinasoft.controller.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor1  implements HandlerInterceptor{
	//在目标方法执行前执行
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
		 System.out.println("preHandle...");
		return false;
	}
	//在目标方法执行后 视图对象放回执行
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView)  {
		 System.out.println("postHandle...");
	}
	//在流程都执行完后执行
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
	 System.out.println("afterCompletion...");
	}

}
