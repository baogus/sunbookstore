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
<link type="text/css" rel="stylesheet" href="<c:url value='${base }admin/css/booklist.css'/>"/>
<title>图书列表</title>
<style type="text/css">
	
</style>
</head>
<body>
<form action="" style="background-color: #33FFAA; width: 300px;">
	<input class="search" type="text" placeholder="请输入查询内容">
	<input class="input" type="image" src="<c:url value='${base }admin/img/search.png'/>">

</form>

</div>
<br>
<br>
    <form id="form1" runat="server">
   
    <table width="100%" id="ListArea" border="1" style="border-color: #33FFDD" class="t1" align="center" cellpadding="0"
        cellspacing="0">
        <tr align="center">
            <th>
              <img src="<c:url value='${base }admin/img/addbooks.png'/>" style="width: 66px; height: 77px">
            </th>
          <th>
        <img src="<c:url value='${base }admin/img/per.png'/>" style="width: 66px; height: 77px;">
          </th>
         <th>
              <img src="<c:url value='${base }admin/img/price.png'/>" style="width: 66px; height: 77px;">
          </th>
           <th>
           <img src="<c:url value='${base }admin/img/bcount.png'/>" style="width: 66px; height: 77px;">
           </th>
           <th>
          <img src="<c:url value='${base }admin/img/bdesc.png'/>" style="width: 66px; height: 77px;">
          </th>
             <th>
          <img src="<c:url value='${base }admin/img/bpub.png'/>" style="width: 66px; height: 77px;">
           </th>
            </th>
           <th>
          <img src="<c:url value='${base }admin/img/shezhi.png'/>" style="width: 66px; height: 77px;">
           </th>
        </tr>
        
        
        
        <tr align="center">
            <td>
              <img src="<c:url value='${base }admin/img/sbook.jpg'/>" style="width: 66px; height: 77px">
            </td>
            <td>
        亚里斯
            </td>
            <td>
              23￥
           </td>
            <td>
           34
            </td>
            <td>
         哈哈哈哈哈法第三方
           </td>
              <td>
          供港出版社出版
            </td>
             <td>
         <a href="">删除</a>
            </td>
        </tr>
       <tr align="center">
            <td>
              <img src="<c:url value='${base }admin/img/sbook.jpg'/>" style="width: 66px; height: 77px">
            </td>
            <td>
        亚里斯
            </td>
            <td>
              23￥
           </td>
            <td>
           34
            </td>
            <td>
         哈哈哈哈哈法第三方
           </td>
              <td>
          供港出版社出版
            </td>
            <td>
         <a href="">删除</a>
            </td>
        </tr>
    </table>
    </form>
</body>
</html>