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
<form action="<c:url value='${base }AddCategoryServlet'/>" style=" width: 300px;">
	<nobr>
	<p style="font-size: 15px;color: #0066FF ">添加分类：</p>
	<input class="search" type="text" placeholder="请输入分类名称" name="cgname" value="${cgnames }">
	<input   class="input" type="image" src="<c:url value='${base }admin/img/addbook.png'/>" ><p>${errors.error }</p>
</nobr>
</form>
<br>
<br>
 <form id="form1" runat="server">
   <p>${msg1.msg }</p>
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
   <c:forEach items="${pb.beanList }" var="category">
   		 
        <tr align="center">
            <td>
       ${category.cgid } 
            </td>
            <td>
   		${category.cgname }
            </td>
          
            <td>
                <a href="<c:url value='${base }DeleteCategoryServlet?cgid=${category.cgid }'/>" >删除</a>
            </td>
        </tr>  
   </c:forEach>
    </table>
    </form>
    第${pb.pc }页/共${pb.tp }页

<a href="<c:url value='${base }FindAllCategoryServlet?pc=1'/>" >首页</a>
<c:if test="${pb.pc > 1 }">
<a href="<c:url value='${base }FindAllCategoryServlet?pc=${pb.pc-1}'/> " >上一页</a>
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
			<a href="<c:url value='${base }FindAllCategoryServlet?pc=${i}'/>" >[${i }]</a>	
		</c:otherwise>
	</c:choose>
	
</c:forEach>


<c:if test="${pb.pc < pb.tp }">
<a href="<c:url value='${base }FindAllCategoryServlet?pc=${pb.pc+1}'/>" >下一页</a>
</c:if>
<a href="<c:url value='${base }FindAllCategoryServlet?pc=${pb.tp}'/>" >尾页</a>
</body>
</html>