<%@page import="com.chinasoft.controller._01_controller.ControllerHello"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.chinasoft.test.UserTest"%>

<html>

  <head>

    <title>success.jsp页面</title>

  </head>

  <body>

<%

String referer = request.getHeader("Referer");

if(referer==null||referer.trim().length()==0||

!referer.equals("http://localhost:8080/work/loginTest/login.jsp")){

response.sendRedirect("login.jsp");

return;

}
request.setCharacterEncoding("utf-8");

response.setContentType("text/html;charset=utf-8");

%>  

<%=(String)request.getAttribute("usertxt")
%>


	<%
	UserTest te  = new UserTest();
	te.searchAllUser();
	te.addUser();
	te.searchAllUser();
	%>



   
 

  </body>

</html>