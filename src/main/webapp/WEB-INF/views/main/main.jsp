
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>main</title>
</head>
<body>

    <h1>teb_menu 테이블에서 menu_code를 이용하여 메뉴 정보 조회 </h1>
    <form action="${pageContext.servletContext.contextPath}/menu/select">
        <label>조회할 메뉴코드 : </label>
        <input type="text" name="menuCode" id="menuCode">
        <button>조회하기</button>
    </form>

    <h1>menu 테이블에서 전체 메뉴 조회</h1>
    <button onclick="location.href='${pageContext.servletContext.contextPath}/menu/list'">
        메뉴 정보 전체 조회하기
    </button>

    <h1>menu 테이블에서 신규 메뉴 추가</h1>
    <form action="${ pageContext.servletContext.contextPath }/menu/insert" method="post">
        메뉴명 : <input type="text" name="menuName"><br>
        메뉴가격 : <input type="text" name="menuPrice"><br>
        카테고리 번호 : <input type="text" name="categoryCode"><br>
        주문가능 (Y/N): <input type="text" name="orderableStatus"><br>
        <button type="submit">등록하기</button>

    </form>

    <h1>menu 테이블에서 메뉴명 수정</h1>
    <form action="${ pageContext.servletContext.contextPath }/menu/update" method="post">
        메뉴코드 : <input type="text" name="menuCode"/>
        메뉴 이름 : <input type="text" name="menuName"/>
        <button type="submit">메뉴 변경</button>
    </form>


    <h1>menu 테이블에서 메뉴 정보 삭제</h1>
    <form action="${ pageContext.servletContext.contextPath }/menu/delete" method="post">
        메뉴코드 : <input type="text" name="menuCode"/>
        <button type="submit">메뉴 정보 삭제</button>
    </form>


</body>
</html>
