<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2024-03-21
  Time: 오후 2:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String menuName = (String) request.getAttribute("menuName");
        int amount = (int) request.getAttribute("amount");
        int orderPrice = (int) request.getAttribute("orderPrice");
    %>

    <h3>주문한 메뉴 : <%= menuName %></h3>
    <h3>주문한 수량 : <%= amount %>인분</h3>
    <h3>결제 금액 : <%= orderPrice %>원</h3>

<%--    <h3>주문한 메뉴 : ${ requestScope.menuName }</h3>--%>
</body>
</html>
