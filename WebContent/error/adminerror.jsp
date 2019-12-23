<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="req" value="${pageContext.request }"/>
<c:set var="base" value="${req.scheme}://${req.serverName}:${req.serverPort}${req.contextPath }/"/>
<!DOCTYPE html>
<html>
<head>
<base href="${base }">
<meta charset="UTF-8">
<title></title>
<style>
	h1{
		margin-left: 300px;
		margin-top: 200px;
	}
</style>
</head>
<body>
<%-- <img src="<c:url value='${base }admin/img/error1.jpg'/>"> --%>
<h1>${msg }<br>
请前往<a href="<c:url value='${base }admin/index.jsp'/>">主页</a>登录

</h1>
</body>
</html>