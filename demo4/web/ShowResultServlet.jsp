<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2024/4/17
  Time: 8:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>利用Servlet+JSP求两个数累加和</title>
</head>
<body>
    <%
        String sn1 = request.getParameter("num1");
        String sn2 = request.getParameter("num2");
        Integer s = (Integer) request.getAttribute("total");
    %>
    <p>
        <%=sn1 %>加到<%=sn2 %>的累加和值是
        <%=s %>
    </p>
</body>
</html>
