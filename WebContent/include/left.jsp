<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
    <fmt:setBundle basename="com.city.car.message.message"/>
     <h1>操作系统菜单</h1>
            <div class="acc">
                <div>
                    <a class="one"  href="/liuxing/category/tomain" target="Conframe">用户管理</a>
                    <ul class="kid">
                        <li><b class="tip"></b><a target="Conframe" href="/liuxing/category/toadd.action">车辆分类信息管理</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="/ liuxing/carinfo/toadd.action">车辆信息管理</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="/liuxing/driverinfo/tomain">驾驶人员信息管理</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="/liuxing/insurance/tomain">保险信息管理管理</a></li>
                       
                    </ul>
                </div>
                <div>
                    <a class="one" href="/liuxing/driverinfo/tomain" target="Conframe">车队管理员</a>
                    <ul class="kid">
                        <li><b class="tip"></b><a target="Conframe" href="/liuxing/driverinfo/toadd.action">增加</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="/liuxing/driverinfo/modify.jsp">修改</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="/liuxing/driverinfo/delete.jsp">删除</a></li>
						 <li><b class="tip"></b><a target="Conframe" href="/liuxing/driverinfo/view.jsp">查看</a></li>
                    </ul>
                </div>
                <div>
                    <a class="one" href="/liuxing/carinfo/tomain" target="Conframe">车队领导管理员</a>
                    <ul class="kid">
                        <li><b class="tip"></b><a target="Conframe" href="/liuxing/carinfo/view.jsp">查询</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="/liuxing/carinfo/modify.jsp">修改</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="/liuxing/carinfo/delete.jsp">删除</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="/liuxing/carinfo/toadd.action">增加</a></li>
                       
                    </ul>
                </div>
               <!--  <div>
                    <a class="one" href="/liuxing/insurance/tomain" target="Conframe">保险信息管理</a>
                    <ul class="kid">
                        <li><b class="tip"></b><a target="Conframe" href="/liuxing/insurance/toadd.action">增加</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="/liuxing/insurance/modify.jsp">修改</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="/liuxing/insurance/delete.jsp">删除</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="/liuxing/insurance/view.jsp">查看</a></li>
                        
                    </ul>
                </div>
                <div>
                    <a class="one" href="/liuxing/use/tomain" target="Conframe">用车登记管理</a>
                    <ul class="kid">
                        <li><b class="tip"></b><a target="Conframe" href="/liuxing/use/view.jsp">查询</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="/liuxing/use/modify.jsp">修改</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="/liuxing/use/delete.jsp">删除</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="/liuxing/use/toadd.action">增加</a></li>
                    </ul>
                </div>
                <div>
                    <a class="one" href="/liuxing/address/tomain" target="Conframe">地址信息管理</a>
                    <ul class="kid">
                        <li><b class="tip"></b><a target="Conframe" href="/liuxing/address/view.jsp">查询</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="/liuxing/address/modify.jsp">修改</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="/liuxing/address/delete.jsp">删除</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="/liuxing/address/toadd.action">增加</a></li>
                    </ul>
                </div> -->
                <div id="datepicker"></div>
            </div>
    