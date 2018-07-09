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
<jsp:useBean id="list" class="com.city.car.model.UseCarModel" scope="request" />
 		
	<a class="btn btn-default" href="toadd.action">增加</a> 
	<table class="table table-border ">
				   <thead>
				      <tr>
				        <th>订单号</th>
				        <th>车牌号</th>
				        <th>驾驶人员</th>
				        <th>开始日期</th>
				        <th>归还日期</th>
				        <th>操作</th>
				      </tr>
				   </thead>
				   <tbody>
				   <c:forEach var="um" items="${useList}">
				   	<tr>
				   	  <td>${um.uid }</td>
					  <td>${um.carinfoNo.cid}</td>  
				   	  <td>${um.driverNo.dname }</td>
				   	  <td>${um.udate }</td>
				   	  <td>${um.backdate }</td>
				   	  <td><a class="btn btn-default" href="tomodify.action?id=${um.uid}">修改</a>
				   	   <a class="btn btn-default" href="todelete.action?id=${um.uid}">删除</a> 
				   	   <a class="btn btn-default" href="toview.action?id=${um.uid}">查看</a></td>
				   	</tr>
				   	</c:forEach>
				   
				   </tbody>
	</table>

     
     
</form>
</body>
</html>