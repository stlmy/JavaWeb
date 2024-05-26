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
    <title>利用javabean+jsp求两个数之间的累加和</title>
</head>
<body>
    <jsp:useBean id="add" class="bean.AddNumBean"></jsp:useBean>
    <jsp:setProperty name="add" property="*"></jsp:setProperty>
    <p>
        <%= add.getNum1()%> 加到 <%= add.getNum2()%>
        的累加和值是
        <%= add.sum()%>
    </p>
</body>
</html>
