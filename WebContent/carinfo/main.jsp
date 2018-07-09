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
<jsp:useBean id="list" class="com.city.car.model.CarinfoModel" scope="request" />
 		 部门<select name="category">
             <c:forEach var="ccm" items="${categoryList}">
                <option value="${ccm.ccno}">${ccm.ccname}</option>
             </c:forEach>   
             </select>
	<a class="btn btn-default" href="toadd.action">增加</a> 
	<table class="table table-border ">
				   <thead>
				      <tr>
				        <th>车牌号</th>
				        <th>分类</th>
				        <th>车型号</th>
				        <th>座位数</th>
				         <th>颜色</th>
				        <th>操作</th>
				      </tr>
				   </thead>
				   <tbody>
				   <c:forEach var="cm" items="${carinfoList}">
				   	<tr>
				   	  <td>${cm.cid}</td>
				   	  <td>${cm.category.ccname}</td>
				   	  <td>${cm.cmodel }</td>
				   	  <td>${cm.cnum}</td>
				   	  <td>${cm.ccolor}</td>
				   	  
				   	  <td><a class="btn btn-default" href="tomodify.action?id=${cm.cid}">修改</a>
				   	   <a class="btn btn-default" href="todelete.action?id=${cm.cid}">删除</a> 
				   	   <a class="btn btn-default" href="toview.action?id=${cm.cid}">查看</a></td>
				   	</tr>
				   	</c:forEach>
				   
				   </tbody>
	</table>
 订单个数：${lcount}
总页数：${pagecount}
 <a href="tomain.action?page=1">首页</a>
 <a href="tomain.action?page=${page-1 }">上页 </a>
 <a href="tomain.action?page=${page+1 }">下页</a>
 <a href="tomain.action?page=${pagecount}"> 末页</a>
     
     
</form>
</body>
</html>