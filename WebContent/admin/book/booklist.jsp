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
<form action="<c:url value='${base }FindLikeBookServlet'/>" style="background-color: #33FFAA; width: 300px;">
	<input class="search" type="text" placeholder="请输入查询内容"  name="string">
	<input class="input" type="image" src="<c:url value='${base }admin/img/search.png'/>">

</form>


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
              <img src="<c:url value='${base }admin/img/bname.png'/>" style="width: 66px; height: 77px">
            </th>
          <th>
        <img src="<c:url value='${base }admin/img/per.png'/>" style="width: 66px; height: 77px;">
          </th>
         <th>
              <img src="<c:url value='${base }admin/img/price.png'/>" style="width: 66px; height: 77px;">
          </th>
            <th>
              <img src="<c:url value='${base }admin/img/bdiscount.png'/>" style="width: 66px; height: 77px;">
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
           <th>
          <img src="<c:url value='${base }admin/img/shezhi.png'/>" style="width: 66px; height: 77px;">
           </th>
        </tr>
      <c:forEach items="${pb.beanList }" var="book"> 
        <tr align="center">
            <td>
              <img src="<c:url value='http://localhost:8080/${book.bimage }'/>" style="width: 66px; height: 77px">
            </td>
            <td>
       ${book.bname }
            </td>
            <td>
         ${book.bauthor }
            </td>
            <td>
             ${book.bprice }
           </td>
            <td>
             ${book.bdiscount }
           </td>
            <td>
          ${book.bcount }
            </td>
            <td>
          ${book.bdesc }
           </td>
              <td>
       ${book.bpub }
   
            </td>
             <td>
         <a href="<c:url value ='${base }DeleteBookById?bid=${book.bid }'/>">删除</a>
            </td>
        </tr>
 </c:forEach>
    </table>
    </form>
    
        第${pb.pc }页/共${pb.tp }页

<a href="<c:url value='${base }FindAllBookServlet?pc=1'/>" >首页</a>
<c:if test="${pb.pc > 1 }">
<a href="<c:url value='${base }FindAllBookServlet?pc=${pb.pc-1}'/> " >上一页</a>
</c:if>

<%-- 计算begin、end --%>
<c:choose>
	<%-- 如果总页数不足10页，那么把所有的页数都显示出来！ --%>
	<c:when test="${pb.tp <= 10 }">
		<c:set var="begin" value="1" />
		<c:set var="end" value="${pb.tp }" />
	</c:when>
	<c:otherwise>
		<%-- 当总页数>10时，通过公式计算出begin和end --%>
		<c:set var="begin" value="${pb.pc-5 }" />
		<c:set var="end" value="${pb.pc+4 }" />	
		<%-- 头溢出 --%>
		<c:if test="${begin < 1 }">
			<c:set var="begin" value="1" />
			<c:set var="end" value="10" />
		</c:if>	
		<%-- 尾溢出 --%>
		<c:if test="${end > pb.tp }">
			<c:set var="begin" value="${pb.tp - 9 }" />
			<c:set var="end" value="${pb.tp }" />
		</c:if>	
	</c:otherwise>
</c:choose>
<%-- 循环遍历页码列表 --%>
<c:forEach var="i" begin="${begin }" end="${end }">
	<c:choose>
		<c:when test="${i eq pb.pc }">
			[${i }]
		</c:when>
		<c:otherwise>
			<a href="<c:url value='${base }FindAllBookServlet?pc=${i}'/>" >[${i }]</a>	
		</c:otherwise>
	</c:choose>
	
</c:forEach>


<c:if test="${pb.pc < pb.tp }">
<a href="<c:url value='${base }FindAllBookServlet?pc=${pb.pc+1}'/>" >下一页</a>
</c:if>
<a href="<c:url value='${base }FindAllBookServlet?pc=${pb.tp}'/>" >尾页</a>
</body>
</html>