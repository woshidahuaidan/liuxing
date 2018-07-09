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
<form action="processdelete.action" method="post">

车牌号<input type="text" name="cm.cid"  value="${cm.cid}" /><br/>
分类<input type="text" name="cm.category.ccname" value="${cm.category.ccname}" readonly="readonly" /><br/>
车型号<input type="text" name="cm.cmodel" value="${cm.cmodel}" readonly="readonly" /><br/>
座位数<input type="text" name="cm.cnum" value="${cm.cnum}" readonly="readonly" /><br/>
颜色<input type="text" name="cm.ccolor" value="${cm.ccolor}" readonly="readonly" /><br/>
购车日期<input type="text" name="cm.cdate" value="${cm.cdate}" readonly="readonly" /><br/>
<s:checkboxlist label="车险" name="insurances" list="insuranceList" listKey="sno" listValue="stype"/><br/>
<input type="submit" value="删除" />
<a href="/liuxing/carinfo/tomain"><input type="button" value="返回"></a><br/>
</form>
</body>
</html>