<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="req" value="${pageContext.request }"/>
<c:set var="base" value="${req.scheme}://${req.serverName}:${req.serverPort}${req.contextPath }/"/>
<!DOCTYPE html>
<html>
<head>
    <base href="${base }">
<base target="top">
<meta charset="UTF-8">
 <link rel="stylesheet" href="<c:url value='${base }admin/css/top.css'/>" >
<title>顶部</title>

</head>
<body>
<div class="top" id="top">
	<p>欢迎光临<br>张三管理员先生</p>
	
	 	<form action="" >
	 		<input type="submit" value="退出登录" class="btn1">
	 	</form>
    
	
	
</div>

</body>
</html>