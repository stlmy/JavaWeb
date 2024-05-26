<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2024/4/17
  Time: 8:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>提交任意两个整数</title>
</head>
<body>
    <h1>按照要求，输入两个整数：</h1>
    <form method="post" action="ShowResultJavaBean.jsp">
        开始数据：<input type="text" name="num1" />
        开始数据：<input type="text" name="num2" />
        <input type="submit" value="计算" />
    </form>
</body>
</html>
