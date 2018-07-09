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
<form action="processmain.action" method="post"  >
<jsp:useBean id="list" class="com.city.car.model.CategoryModel" scope="request" />
	<h2>车辆分类</h2>
	<a class="btn btn-default" href="toadd.action">增加</a> 
	<table class="table table-border ">
				   <thead>
				      <tr>
				        <th>分类编码</th>
				        <th>分类名称</th>
				        <th>操作</th>
				      </tr>
				   </thead>
				   <tbody>
				   <c:forEach var="ccm" items="${categorylist}">
				   	<tr>
				   	  <td>${ccm.ccno }</td>
				   	  <td>${ccm.ccname }</td>
				   	  <td><a class="btn btn-default" href="tomodify.action?ccno=${ccm.ccno}">修改</a>
				   	   <a class="btn btn-default" href="todelete.action?ccno=${ccm.ccno}">删除</a> 
				   	   <a class="btn btn-default" href="toview.action?ccno=${ccm.ccno}">查看</a></td>
				   	</tr>
				   	</c:forEach>
				   
				   </tbody>
	</table>
 
     
</form>
</body>
</html>