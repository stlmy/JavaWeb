<%@ page import="java.util.List" %>
<%@ page import="bean.BookBean" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>显示书目列表</title>
</head>
<body>
显示结果（使用EL和JSTL）<br>
<table border="1">
    <tr>
        <th>书号</th>
        <th>书名</th>
        <th>作者</th>
        <th>价格</th>
    </tr>
    <c:forEach var="book" items="${booklist}">
        <tr>
            <td>${book.bookid}</td>
            <td>${book.bookname}</td>
            <td>${book.author}</td>
            <td>${book.price}</td>
        </tr>
    </c:forEach>
</table>
<br>
显示结果（使用代码）<br>
<%
    List<BookBean> booklist = (List<BookBean>) request.getAttribute("booklist");
%>
<table border="1">
    <tr>
        <th>书号</th>
        <th>书名</th>
        <th>作者</th>
        <th>价格</th>
    </tr>
    <%
        for(BookBean book:booklist){
    %>
    <tr>
        <td><%=book.getBookid()%></td>
        <td><%=book.getBookname()%></td>
        <td><%=book.getAuthor()%></td>
        <td><%=book.getPrice()%></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>