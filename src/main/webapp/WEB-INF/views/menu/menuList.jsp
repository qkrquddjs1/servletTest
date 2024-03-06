<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2024-03-06
  Time: 오후 3:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>메뉴 목록 전체 조회</title>
</head>
<body>
    <h1>메뉴 목록 전체 조회</h1>
    <table>
        <tr>
            <th>메뉴번호</th>
            <th>메뉴이름</th>
            <th>메뉴가격</th>
            <th>카테고리번호</th>
            <th>주문가능여부</th>
        </tr>
        <c:forEach items="${ menuList}" var="menu">
            <tr>
                <td>${ menu.menuCode}</td>
                <td>${ menu.menuName}</td>
                <td>${ menu.menuPrice}</td>
                <td>${ menu.categoryCode}</td>
                <td>${ menu.orderableStatus}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
