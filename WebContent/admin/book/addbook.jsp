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
<script type="text/javascript">
/* function select(){
  
        location.href="FindAllServlet?pc=1";
   
} */
</script>
</head>
<body>
<p>${msg1 }</p>
	<form action="<c:url value='${base }AddbookServlet'/>" method="post" enctype="multipart/form-data" style="border: 2px solid #77FFEE; width: 410px; margin-left: 300px;" >
	<p align="center" style="color: #0066FF; font-style: oblique">添加图书</p>
		<label><img src="<c:url value='${base }admin/img/addbooks.png'/>">书&nbsp;&nbsp;&nbsp;名: <input type="text" name="bname" value="${book.bname }"></label><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${errors.bname }<br>
		<label><img src="<c:url value='${base }admin/img/per.png'/>">作&nbsp;&nbsp;&nbsp;者: <input type="text" name="bauthor" value="${book.bauthor }"></label><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${errors.bauthor }<br>
		<label><img src="<c:url value='${base }admin/img/price.png'/>">价&nbsp;&nbsp;&nbsp;格: <input type="text" name="bprice" value="${book.bprice }"></label><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${errors.bprice }<br>
		<label><img src="<c:url value='${base }admin/img/bdiscount.png'/>">折&nbsp;&nbsp;&nbsp;扣: <input type="text" name="bdiscount" value="${book.bdiscount }"></label><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${errors.bdiscount }<br>
		<label><img src="<c:url value='${base }admin/img/bcount.png'/>">数&nbsp;&nbsp;&nbsp;量: <input type="text" name="bcount" value="${book.bcount }"></label><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${errors.bcount }<br>
		<label><img src="<c:url value='${base }admin/img/bpub.png'/>">出版社: <input type="text" name="bpub" value="${book.bpub }"></label><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${errors.bpub }<br>
		<label><img src="<c:url value='${base }admin/img/bpub.png'/>">类&nbsp;&nbsp;&nbsp;别: 
		<select style="width: 303px;height: 33px;"  name="cgname">
				<c:forEach items="${category }" var="category">
					<option value="${category.cgname }">${category.cgname }</option>
				</c:forEach>
			</select>
		</label><br>
		<label><img src="<c:url value='${base }admin/img/bdesc.png'/>">简&nbsp;&nbsp;&nbsp;介: <br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<textarea cols="48" rows="8" align="center" name="bdesc" value="${book.bdesc }"></textarea>
			</label><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${errors.bdesc }<br>
		<label><img src="<c:url value='${base }admin/img/bimg.png'/>">图&nbsp;&nbsp;&nbsp;片: <input type="file" name="bimage" value="${book.bimage }"></label><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${msg }${errors.bimage }<br>
		<label><input type="submit" value="添加书籍" style="background-color: #77FFCC;width: 70px; align-content: center;"></label><br>
	</form>

</body>
</html>