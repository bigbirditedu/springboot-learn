<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<c:if test="${not empty errorCode}">
    <h1>错误码：${errorCode}</h1>
</c:if>

<c:if test="${not empty errorMsg}">
    <h1>错误信息：${errorMsg}</h1>
</c:if>
</body>
</html>