<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="req" value="${pageContext.request }"/>
<c:set var="base" value="${req.scheme}://${req.serverName}:${req.serverPort}${req.contextPath }/"/>
<!DOCTYPE html>
<html>
<head>
    <base href="${base }">
<style type="text/css">
	img {
	height:20px;
	width: 20px;
}
</style>
<meta charset="UTF-8">
<title>模拟管理员登录</title>
</head>
<body>
<form action="<c:url value='${base }LoginServlet'/>" style="margin-left: 400px;" method="post">
	<img src="<c:url value='${base }admin/img/per.png'/>">姓名: <input type="text" name="mname" value="${manager.mname }"><br>
		<img src="<c:url value='${base }admin/img/password.png'/> ">密码: <input type="password" name="mpassword" value="${manager.mpassword }"><br>
		<input type="submit" value="添加" style="background-color: #77FFCC;width: 70px; align-content: center;"><br>
	</form>
</body>
</html>