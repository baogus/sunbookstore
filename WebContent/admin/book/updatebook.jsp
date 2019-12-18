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
<title>修改库存</title>
<link type="text/css" rel="stylesheet" href="<c:url value='${base }admin/css/updatebook.css'/>"/>
</head>
<body>

<form action="" method="post" enctype="multipart/form-data" style="border: 2px solid #77FFEE; width: 410px; margin-left: 300px" >
	<p align="center" style="color: #0066FF; font-style: oblique">修改图书信息</p>
		<label><img src="<c:url value='${base }admin/img/addbooks.png'/>">书&nbsp;&nbsp;&nbsp;名: <input type="text" name="bname" readonly="readonly" value=""></label><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>
		<label><img src="<c:url value='${base }admin/img/per.png'/>">作&nbsp;&nbsp;&nbsp;者: <input type="text" name="bauthor" readonly="readonly" value=""></label><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>
		<label><img src="<c:url value='${base }admin/img/price.png'/>">价&nbsp;&nbsp;&nbsp;格: <input type="text" name="bprice" readonly="readonly" value=""></label><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>
		<label><img src="<c:url value='${base }admin/img/bdiscount.png'/>">折&nbsp;&nbsp;&nbsp;扣: <input type="text" name="bdiscount" value="${book.bdiscount }"></label><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>
		<label><img src="<c:url value='${base }admin/img/bcount.png'/>">数&nbsp;&nbsp;&nbsp;量: <input type="text" name="bcount" value=""></label><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>
		<label><img src="<c:url value='${base }admin/img/bpub.png'/>">出版社:<input type="text" name="bpub" readonly="readonly" value=""></label><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>
		<label ><img src="<c:url value='${base }admin/img/bdesc.png'/>">简&nbsp;&nbsp;&nbsp;介: <br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<textarea cols="48" rows="8" align="center" name="bdesc" readonly="readonly" value=""></textarea>
			</label><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="image" src="<c:url value='${base }admin/img/button.png'/>" style="width: 95px; height: 67px;align:center;">
	</form>

</body>
</html>