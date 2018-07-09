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

<jsp:useBean id="list" class="com.city.car.model.CarinfoModel" scope="request" />
<h3>车辆信息增加</h3>
<form action="processadd.action" method="post">
<table class="table table-bordered table-hover m10" style="margin-left:10px;margin-top:3px;">
	 <tr>
        <td width="10%" class="tableleft STYLE1">车牌号</td>
        <td>
           <input type="text" name="cm.cid"/>
        </td>
    </tr>
     <tr>
        <td class="tableleft STYLE1">车型号</td>
        <td><input type="text" name="cm.cmodel" /></td>
     </tr>
     <tr>
        <td class="tableleft STYLE1">座位数</td>
        <td><input type="text" name="cm.cnum" /></td>
     </tr>
     <tr>
        <td class="tableleft STYLE1">颜色</td>
        <td><input type="text" name="cm.ccolor"  /></td>
     </tr>
     <tr>
        <td class="tableleft STYLE1">购车日期</td>
        <td><input type="text" name="cm.cdate"  /></td>
     </tr>
     <tr>
        <td class="tableleft STYLE1">分类</td>
        <td><select name="cm.category.ccno">
				        <c:forEach var="ccm" items="${categoryList}">
				        	<option value="${ccm.ccno}">${ccm.ccname}</option>
				        </c:forEach>   
    		   </select></td>
     </tr>
     <tr>
        <td class="tableleft STYLE1">车险类型</td>
        <td><c:forEach var="sm" items="${insuranceList }">
			 			<input type="checkbox"  name="insurances" value="${sm.sno }">${sm.stype }
				</c:forEach></td>
     </tr> 
    <tr>
        <td class="tableleft"></td>
        <td>
            <input style="margin-left:5px;"type="submit" class="btn btn-primary" value="提交" > &nbsp;&nbsp;
            <a href="/liuxing/carinfo/tomain"><input type="button" class="btn btn-success" name="backid" value="返回"></a>
        </td>
    </tr>
 </table><!-- 
车牌号<input type="text" name="cm.cid" /><br/>
车型号<input type="text" name="cm.cmodel" /><br/>
座位数<input type="text" name="cm.cnum" /><br/>
颜色<input type="text" name="cm.ccolor" /><br/>
购车日期<input type="text" name="cm.cdate" /><br/>
分类<select name="cm.category.ccno">
        <c:forEach var="ccm" items="${categoryList}">
        	<option value="${ccm.ccno}">${ccm.ccname}</option>
        </c:forEach>   
    </select><br/>
车险类型<c:forEach var="sm" items="${insuranceList }">
			 <input type="checkbox"  name="insurances" value="${sm.sno }">${sm.stype }
					  </c:forEach><br/>
<input type="submit" value="提交" /><br/> -->
</form>
</body>
</html>