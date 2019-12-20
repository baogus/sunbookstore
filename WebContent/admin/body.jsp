<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="req" value="${pageContext.request }"/>
<c:set var="base" value="${req.scheme}://${req.serverName}:${req.serverPort}${req.contextPath }/"/>
<!DOCTYPE html>
<html>
<base href="${base }">
<meta charset="UTF-8">
<title>body</title>
</head>
<body>
<img src="<c:url value='${base }admin/img/bg1.png'/>" style="width:1000px; height: 300px;">
</body>
</html>