<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
     <%@ page import="java.sql.*" %>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
      <%@ taglib uri="/struts-tags"  prefix="s" %>
     <%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <fmt:setBundle basename="com.city.car.message.message"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="../css/pintuer.css">
    <link rel="stylesheet" href="../css/admin.css">
    <script src="../js/jquery.js"></script>
    <script src="../js/pintuer.js"></script>  
<title>汽车分类信息</title>
	<jsp:include page="../include/aa.jsp"/>
</head>
<body>

<jsp:useBean id="list" class="com.city.car.model.DriverModel" scope="request" />
<form action="processdelete.action" method="post">
编号<input type="text" name="dm.dno"   value="${dm.dno}"  /><br/>
密码<input type="password" name="dm.password" value="${dm.password}" readonly="readonly" /><br/>
姓名<input type="text" name="dm.dname" value="${dm.dname}" readonly="readonly" /><br/>
性别<s:radio name="dm.dsex"  list="#{'男' :'男','女':'女'}"></s:radio><br/>
年龄<input type="text" name="dm.age"   value="${dm.age}" readonly="readonly" /><br/>
电话<input type="text" name="dm.dtel"   value="${dm.dtel}" readonly="readonly" /><br/>
图片<img src="showphoto?id=${dm.dno}" /><br/>

    <input type="submit" value="删除" />
    <a href="liuxing/driverinfo/tomain"><input type="button" value="返回" /></a><br/>
</form>
</body>
</html>