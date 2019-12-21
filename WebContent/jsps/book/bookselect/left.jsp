<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="sunbookstore.category.domin.*" %>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
		<title>分类导航菜单</title>
		<style type="text/css">
			*{
				background: antiquewhite;
				color: #02B1CB;
			}
			a{
				text-decoration:none
			} 
			a:hover{
				text-decoration:none;
				color:orange;
				font-size:18px;
				
			}
		</style>
	</head>
	<body>       
　　　　　  <table> 
				<c:forEach items="${categories }" var="category">
					<tr>
					<td><a href="FindBookByCategoryServlet?cgid=${category.cgid }" target="bottom">${category.cgname }</a></td>
					</tr>
				
				</c:forEach>
				
		</table>    　
	</body>
</html>