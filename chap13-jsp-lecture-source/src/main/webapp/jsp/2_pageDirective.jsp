<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2024-03-21
  Time: 오후 12:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Date" errorPage="errorPage.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Date date = new Date();
        System.out.println(date);
    %>

    <%
        String str = null;
        char ch = str.charAt(0);
    %>
</body>
</html>
