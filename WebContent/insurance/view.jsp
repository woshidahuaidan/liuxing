<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
     <%@ page import="java.sql.*" %>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
     
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
<title>车辆保险信息</title>
	<jsp:include page="../include/aa.jsp"/>
</head>
<body>

<jsp:useBean id="list" class="com.city.car.model.InsuranceModel" scope="request" />
<form action="processview.action" method="post">
车险编号<input type="text" name="sm.sno"   value="${sm.sno}" /><br/>
车险类型<input type="text" name="sm.stype"  value="${sm.stype}"  readonly="readonly" /><br/>
车险公司<input type="text" name="sm.sfirm"  value="${sm.sfirm}" readonly="readonly" /><br/>
投保金额<input type="text" name="sm.smoney"   value="${sm.smoney}" readonly="readonly" /><br/>
投保日期<input type="text" name="sm.date"   value="${sm.date}" readonly="readonly" /><br/>
投保期限<input type="text" name="sm.stime"   value="${sm.stime}" readonly="readonly" /><br/>

<a href="tomain.action"><input type="button" value="返回" /><br/></a>
</form>
</body>
</html>