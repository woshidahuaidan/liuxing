<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
     <%@ page import="java.sql.*" %>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
     
     <%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="../css/pintuer.css">
    <link rel="stylesheet" href="../css/admin.css">
    <script src="../js/jquery.js"></script>
    <script src="../js/pintuer.js"></script>  
<title>汽车分类信息</title>
	<jsp:include page="../include/aa.jsp"/>
</head>
<body>
<form action="processmain.action" method="post"   enctype="multipart/form-data">
<jsp:useBean id="list" class="com.city.car.model.DriverModel" scope="request" />
	<h1>驾驶人员信息</h1>
	<a class="btn btn-default" href="toadd.action">增加</a> 
	<table class="table table-border ">
				   <thead>
				      <tr>
				        <th>图片</th>
				        <th>编号</th>
				        <th>姓名</th>
				        <th>性别</th>
				        <th>年龄</th>
				        <th>电话</th>				 
				      </tr>
				   </thead>
				   <tbody>
				   <c:forEach var="dm" items="${driverList}">
				   	<tr>
				   	  <td><img src="showphoto?id=${dm.dno }" width="30" height="26" /></td>
				   	  <td>${dm.dno }</td>
				   	  <td>${dm.dname }</td>
				   	  <td>${dm.dsex}</td>
				   	  <td>${dm.age }</td>
				   	  <td>${dm.dtel }</td>
				   	  <td><a class="btn btn-default" href="tomodify.action?id=${dm.dno }">修改</a>
				   	   <a class="btn btn-default" href="todelete.action?id=${dm.dno }">删除</a> 
				   	   <a class="btn btn-default" href="toview.action?id=${dm.dno }">查看</a></td>
				   	</tr>
				   	</c:forEach>
				   
				   </tbody>
	</table>
 订单个数：${lcount}
页数：${pagecount}
 <a href="tomain.action?page=1">首页</a>
 <a href="tomain.action?page=${page-1 }">上页 </a>
 <a href="tomain.action?page=${page+1 }">下页</a>
 <a href="tomain.action?page=${pagecount}"> 末页</a>
     
     
</form>
</body>
</html>