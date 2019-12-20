<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="req" value="${pageContext.request }"/>
<c:set var="base" value="${req.scheme}://${req.serverName}:${req.serverPort}${req.contextPath }/"/>
<!DOCTYPE html>
<html>
<head>
 <base href="${base }">
		<meta charset="utf-8">
		<title>关于</title>
			<style type="text/css">
				*{
					margin:0px;
					padding: auto;
				}
				body{
					background:#42A8C0;
				}
				.main{
					width:1000px;
					height:634px;
					margin:100px auto;
				}
				.war{
					width:325px;
					height:500px;
					background:aquamarine;
					border-radius:10px;
					box-shadow:0px 0px 5px #666;
					float:right;
					padding:20px 50px;
					margin: auto 300px;
				}
				p{
					color: #117A8B;
					font-size: 28px;
					margin: 50px auto;
				}
			</style>
		</head>
		<body onselectstart="return false">
			<div class="main">
				<div class="war">
					<p>本系统由陈斌领导下开发</p>
					<p>如有疑问请联系我们：1372147528</p>
				</div>
			</div>
		</body>
	</html>
