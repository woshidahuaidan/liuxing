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
<title>汽车分类信息</title>
	<jsp:include page="../include/aa.jsp"/>
</head>
<body>

<jsp:useBean id="list" class="com.city.car.model.CategoryModel" scope="request" />
<form action="processmodify.action" method="post">
<table class="table table-bordered table-hover m10" style="margin-left:10px;margin-top:3px;">
	 <tr>
        <td width="10%" class="tableleft STYLE1">编号</td>
        <td>
           <input type="text" name="ccm.ccno" value="${ccm.ccno}" />
        </td>
    </tr>
     <tr>
        <td class="tableleft STYLE1">名称</td>
        <td><input type="text" name="ccm.ccname" value="${ccm.ccname}"  /></td>
     </tr>
    <tr>
        <td class="tableleft"></td>
        <td>
            <input style="margin-left:5px;"type="submit" class="btn btn-primary" value="修改" > &nbsp;&nbsp;
            <a href="/liuxing/category/tomain"><input type="button" class="btn btn-success" name="backid" value="返回"></a>
        </td>
    </tr>
 </table>

</form>
</body>
</html>