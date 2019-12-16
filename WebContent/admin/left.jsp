<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="req" value="${pageContext.request }"/>
<c:set var="base" value="${req.scheme}://${req.serverName}:${req.serverPort}${req.contextPath }/"/>
<!DOCTYPE html>
<html>
<head>
    <base href="${base }">

    <!-- 引用jquery框架文件，这样脚本中就可以使用jquery了-->
<script type="text/javascript" src="<c:url value='${base }admin/jquery/jquery-3.2.1.js'/>"></script>
 <script type="text/javascript" src="<c:url value='${base }admin/js/select.js'/>"></script>
  <link rel="stylesheet" href="<c:url value='${base }admin/css/left.css'/>" >
<base target="body">
<meta charset="UTF-8">
<title>左边</title>
</head>

<body>
<div>		

	<div class="title" >
		<a style="color:blue;cursor:pointer;" >
			<img alt="" src="<c:url value='${base }admin/img/customer.png'/>" style="height:12%; width: 12%;">用户管理</a>
	</div>
               <ul class="menu" style="display: none;">
                	<li><a href="<c:url value='${base }FindAllCustomerServlet?pc=1'/>">用户列表</a></li>
                       
                  
           
                   		
                   
                   
               </ul>	
</div>
<br>
<br>
<div>
	<div class="title" >
		 <a style="color:blue;cursor:pointer;">
		 	<img alt="" src="<c:url value='${base }admin/img/book.png'/>" style="height:12%; width: 12%;">书籍管理</a>
	</div>
                <ul class="menu" style="display: none;">
                    <li><a href="<c:url value='${base }admin/book/booklist.jsp'/>">书籍列表</a></li>
                        <br>
                    <li><a href="<c:url value='${base }admin/book/addbook.jsp'/>">增加书籍</a></li>
                        <br>
                     <li><a href="<c:url value='${base }admin/book/updatebook.jsp'/>">修改库存</a></li>
                  
                   
                </ul>
</div>
<br>
<br>
	<div class="title" >
	
		<a style="color:blue;cursor:pointer;">
			<img alt="" src="<c:url value='${base }admin/img/category.png'/>" style="height:12%; width: 12%;">分类管理</a>
	</div>
                <ul  class="menu"  style="display: none;">
                    <li><a href="<c:url value='${base }FindAllCategoryServlet?pc=1'/>">分类列表</a></li>
  					
				</ul>
</div>
<br>
<br>

<div>		
	<div class="title" >
	
		<a style="color:blue;cursor:pointer;">
			<img alt="" src="<c:url value='${base }admin/img/shezhi.png'/>" style="height:12%; width: 12%;">系统设置</a>
	</div>
                <ul  class="menu"  style="display: none;">
                 
                    <li><a href="<c:url value='${base }admin/admin/updateadmin.jsp'/>">修改密码</a></li>
				</ul>
</div>

</body>
</html>