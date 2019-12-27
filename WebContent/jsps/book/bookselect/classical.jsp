<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
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
    <tr>    
    <c:forEach items="${books }" var="book">
   <td>
    <div>
       <a href="<%=basePath%>FindbookBybidServlet?bid=${book.bid }" target="bottom" >
       <img width="200px" height="200px" src="${book.bimage }"></a> 
    </div>
    
    <div>
       <a href="FindbookBybidServlet?bid=${book.bid }" target="bottom">${book.bname } </a>          
    </div>
    <div>
         ${book.bauthor } 
    </div>
    <div>        
         <del><font color="gray">¥${book.bprice }</font></del>
         <font color="red" size="4">
         <fmt:formatNumber type="number" value="  ¥${book.bprice*book.bdiscount*0.1 }" pattern="0.00" maxFractionDigits="2"/></font>
         
   </div>    
   </td>  
  	 
   </c:forEach>		
    </tr> 	
			
</table>    　


</body>
</html>