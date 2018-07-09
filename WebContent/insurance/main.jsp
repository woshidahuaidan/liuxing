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
<title>车辆保险信息</title>
	<jsp:include page="../include/aa.jsp"/>
</head>
<body>
<form action="processmain.action" method="post"   enctype="multipart/form-data">
<jsp:useBean id="list" class="com.city.car.model.InsuranceModel" scope="request" />
<h1>保险信息</h1>
	<a class="btn btn-default" href="toadd.action">增加</a> 
	<table class="table table-border ">
				   <thead>
				      <tr>
				        <th>车险编号</th>
				        <th>车险类型</th>
				        <th>车险公司</th>
				        <th>投保金额</th>
				        <th>投保日期</th>		
				        <th>投保期限</th>	
				        <th>操作</th>		 
				      </tr>
				   </thead>
				   <tbody>
				   <c:forEach var="sm" items="${insuranceList}">
				   	<tr>
				   	  <td>${sm.sno }</td>
				   	  <td>${sm.stype }</td>
				   	  <td>${sm.sfirm}</td>
				   	  <td>${sm.smoney }</td>
				   	  <td>${sm.date }</td>
				   	   <td>${sm.stime }</td>
				   	  <td><a class="btn btn-default" href="tomodify.action?id=${sm.sno}">修改</a>
				   	   <a class="btn btn-default" href="todelete.action?id=${sm.sno}">删除</a> 
				   	   <a class="btn btn-default" href="toview.action?id=${sm.sno }">查看</a></td>
				   	</tr>
				   	</c:forEach>
				   
				   </tbody>
	</table>

     
</form>
</body>
</html>