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
<title>添加用户</title>
<meta charset="UTF-8">
</head>
<body>


	<form action="" style="align:center;">
		<label><img src="<c:url value='${base }admin/img/per.png'/>">姓名: <input type="text" name="cname"></label><br>
		<label><img src="<c:url value='${base }admin/img/password.png'/>">密码: <input type="password" name="cpassword"></label><br>
		
		<label><input type="submit" value="修改" style="background-color: #77FFCC;width: 70px; align-content: center;"></label><br>
	</form>


</body>
</html>