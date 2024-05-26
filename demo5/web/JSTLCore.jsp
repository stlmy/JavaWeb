<%--
  Created by IntelliJ IDEA.
  User: 18936
  Date: 2024/5/8
  Time: 12:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>EL和JSTL综合练习</title>
</head>

<body>
    <c:if test="${empty requestScope.username}">
        <a href="JSTLCoreServlet">您好，请先登录</a>  <a href="#">免费注册</a>
    </c:if>
    <c:if test="${!empty requestScope.username}">
        <b>${username}</b>先生/女士，您好！<a href="JSTLCore.jsp">退出</a>
    </c:if>

    <br>
    <c:choose>
        <c:when test="${!empty orders}">
            <table border="1">
                <tr>
                    <th>ID</th>
                    <th>订单编号</th>
                    <th>邮寄地址</th>
                    <th>联系电话</th>
                    <th>操作</th>
                </tr>
                <c:forEach items="${orders}" var="order" varStatus="status">
                    <tr>
                        <td>${status.count}</td>
                        <td>${order.id}</td>
                        <td>${order.address}</td>
                        <td>${order.phone}</td>
                        <td><a href="#">修改</a> <a href="#">删除</a></td>
                    </tr>
                </c:forEach>
            </table>
        </c:when>
        <c:otherwise>
            <c:out value="${orders}">查询的订单orders集合为空</c:out>
        </c:otherwise>
    </c:choose>
</body>
</html>
