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

<jsp:useBean id="list" class="com.city.car.model.UseCarModel" scope="request" />
<form action="processmodify.action" method="post">
订单编号<input type="text" name="um.uid"  value="${um.uid}"/><br/>
<s:select label="车牌号" name="um.carinfoNo.cid" list="carinfoList" listKey="cid" listValue="cmodel" /><br/>
<!--车牌号<input type="text"  name="um.carinfoNo.cmodel" value="${um.carinfoNo.cmodel}" /><br/> -->
 <s:select label="驾驶人员" name="um.driverNo.dno" list="driverList" listKey="dno" listValue="dname" /><br/>
<!--驾驶人员<input type="text" name="um.driverNo.dname" value="${um.driverNo.dname}"  /><br/>-->
开始日期<input type="text" name="um.udate" value="${um.udate}" /><br/>
归还日期<input type="text" name="um.backdate"  value="${um.backdate}"/><br/>
使用原因<input type="text"   name="um.reason" value="${um.reason}" /><br/>  

<input type="submit" value="修改" /><br/>
</form>
</body>
</html>