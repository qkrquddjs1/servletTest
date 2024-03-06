
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>메뉴 정보 </title>
</head>
<body>
    <h1>${ param.menuCode}번 메뉴의 정보</h1>
    <h4>메뉴명 : ${ selectedMenu.menuName}</h4>
    <h4>메뉴가격 : ${ selectedMenu.menuPrice}</h4>
    <h4>카테고리 : ${ selectedMenu.categoryCode} </h4>
    <h4>주문가능여부 : ${ selectedMenu.orderableStatus}</h4>

</body>
</html>
