<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="req" value="${pageContext.request }"/>
<c:set var="base" value="${req.scheme}://${req.serverName}:${req.serverPort}${req.contextPath }/"/>
<!DOCTYPE html>
<html> 
<head runat="server">
<base href="${base }">
<meta charset="UTF-8">
<title>用户列表</title>
 <script type="text/javascript" src="<c:url value='${base }admin/jquery/jquery-3.2.1.js'/>"></script>
<link type="text/css" rel="stylesheet" href="<c:url value='${base }admin/css/table.css'/>"/>
 <script type="text/javascript" src="<c:url value='${base }admin/js/table.js'/>"></script>
<script>
function msg(){
	alert("删除成功！");
}

</script>
</head>
<body>
<div>
<form action="" style="background-color: #33FFAA; width: 300px;">
	<input class="search" type="text" placeholder="请输入查询内容">
	<input class="input" type="image" src="<c:url value='${base }admin/img/search.png'/>">

</form>

</div>
<br>
<br>
<br>
<br>
    <form id="form1" runat="server">
   
    <table width="100%" id="ListArea" border="0" class="t1" align="center" cellpadding="0"
        cellspacing="0">
        <tr align="center">
            <th>
              <img src="<c:url value='${base }admin/img/per.png'/>">  姓名
            </th>
            <th>
              <img src="<c:url value='${base }admin/img/sex.png'/>">  性别
            </th>
            <th>
               <img src="<c:url value='${base }admin/img/tel.png'/>"> 电话
            </th>
            <th>
             <img src="<c:url value='${base }admin/img/address.png'/>">   地址
            </th>
            <th>
             <img src="<c:url value='${base }admin/img/caozuo.png'/>">     操作
            </th>
        </tr>
        <tr align="center">
            <td>
                张三
            </td>
            <td>
                女
            </td>
            <td>
                14498723540
            </td>
            <td>
                宁夏回族自治区银川市西夏区北方民族大学
            </td>
            <td>
                <a href="" onclick="msg()">删除用户</a>
            </td>
        </tr>
        
    </table>
    </form>
</body>
</html>