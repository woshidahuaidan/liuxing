<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<fmt:setBundle basename="com.city.car.message.message"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>企业汽车信息管理系统</title>

<link rel="stylesheet" type="text/css" href="../css/styles.css">

</head>
<body>


<div class="wrapper">

	<div class="container">
		<h1>企业汽车信息管理</h1>
		<form class="form" method="post" action="login.action">
			<input type="text"  name="dm.dno">
			<input type="password" name="dm.password"><br>
			<button type="submit" id="login-button" onclick="window.location.href='../user/index.jsp';"><strong>登陆</strong></button>
			
			<br>
		</form>
	</div>
	<ul class="bg-bubbles">
		<li></li>
		<li></li>
		
	</ul>
	
</div>
</body>
</html>