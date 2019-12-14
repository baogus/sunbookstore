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
<title>分类列表</title>
  <script type="text/javascript" src="<c:url value='${base }admin/jquery/jquery-3.2.1.js'/>"></script>
<link type="text/css" rel="stylesheet" href="<c:url value='${base }admin/css/table.css'/>"/>
 <script type="text/javascript" src="<c:url value='${base }admin/js/table.js'/>"></script>

</head>
<body>
<h>${msg }</h>
<form action="<c:url value='${base }/AddCategoryServlet'/>" style=" width: 300px;">
	<nobr>
	<p style="font-size: 15px;color: #0066FF ">添加分类：</p>
	<input class="search" type="text" placeholder="请输入分类名称" name="cgname" value="${cgnames }">
	<input   class="input" type="image" src="<c:url value='${base }admin/img/addbook.png'/>" ><p>${errors.error }</p>
</nobr>
</form>

<br>
<br>
 <form id="form1" runat="server">
   
    <table width="100%" id="ListArea" border="0" class="t1" align="center" cellpadding="0"
        cellspacing="0">
        <tr align="center">
            <th>
              <img src="<c:url value='${base }admin/img/num.png'/>" >  分类编号
            </th>
            <th>
              <img src="<c:url value='${base }admin/img/bookc.png'/>" > 分类名称
            </th>
           
            <th>
             <img src="<c:url value='${base }admin/img/caozuo.png'/>" > 操作
            </th>
   <c:forEach items="${categories }" var="category">
   		 
        <tr align="center">
            <td>
       ${category.cgid }       
            </td>
            <td>
               ${category.cgname }
            </td>
          
            <td>
                <a href="" onclick="msg()">删除</a>
            </td>
        </tr>  
   </c:forEach>
    </table>
    </form>
</body>
</html>