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
<title>添加图书</title>
<link type="text/css" rel="stylesheet" href="<c:url value='${base }admin/css/updatebook.css'/>"/>
</head>
<body>
	<form action="" method="post" enctype="multipart/form-data" style="border: 2px solid #77FFEE; width: 410px; margin-left: 300px;" >
	<p align="center" style="color: #0066FF; font-style: oblique">添加图书</p>
		<label><img src="<c:url value='${base }admin/img/addbooks.png'/>">书&nbsp;名: <input type="text" name="bname" ></label><br>
		<label><img src="<c:url value='${base }admin/img/per.png'/>">作&nbsp;者: <input type="password" name="bauthor"></label><br>
		<label><img src="<c:url value='${base }admin/img/price.png'/>">价&nbsp;格: <input type="text" name="bprice"></label><br>
		<label><img src="<c:url value='${base }admin/img/bcount.png'/>">数&nbsp;量: <input type="text" name="bcount"></label><br>
		<label><img src="<c:url value='${base }admin/img/bpub.png'/>">出版社: <input type="text" name="bpub"></label><br>
		<label><img src="<c:url value='${base }admin/img/bpub.png'/>">类&nbsp;别: 
			<select style="width: 303px;height: 33px;">
				<option>马克思主义、列宁主义、毛泽东思想、邓小平理论</option>
				<option> 哲学、宗教</option>
				<option>社会科学总论</option>
				<option> 政治、法律</option>
				<option> 军事</option>
				<option>经济</option>
			
			</select>
		
		
		</label><br>
		<label><img src="<c:url value='${base }admin/img/bdesc.png'/>">简&nbsp;介: <br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<textarea cols="48" rows="8" align="center" name="bdesc"></textarea>
			</label><br>
		<label><img src="<c:url value='${base }admin/img/bimg.png'/>">图&nbsp;片: <input type="file" name="bimg"></label><br>
		<label><input type="submit" value="添加" style="background-color: #77FFCC;width: 70px; align-content: center;"></label><br>
	</form>

</body>
</html>