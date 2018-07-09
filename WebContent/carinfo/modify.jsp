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

<jsp:useBean id="list" class="com.city.car.model.CarinfoModel" scope="request" />
<form action="processmodify.action" method="post">
  
<s:textfield label="车牌号" name="cm.cid"></s:textfield><br/>
<s:select label="分类" name="cm.category.ccno" list="categoryList" listKey="ccno" listValue="ccname" /><br/>
<s:textfield label="车型号 " name="cm.cmodel"></s:textfield><br/>
<s:textfield label="座位数 " name="cm.cnum"></s:textfield><br/>
<s:textfield label="车颜色 " name="cm.ccolor"></s:textfield><br/>
<s:textfield label="购车日期 " name="cm.cdate"></s:textfield><br/>
<s:checkboxlist label="车险类型" name="insurances" list="insuranceList" listKey="sno" listValue="stype"/><br/>
<br/>
<input type="submit" value="修改" />
<a href="tomain.action"><input type="button" value="返回" /></a><br/>
</form>
</body>
</html>