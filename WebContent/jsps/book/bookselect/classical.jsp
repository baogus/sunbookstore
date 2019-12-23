
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
<!--  <table width="100%">
  <tr>
   <td>
    <div>
       <a href="xminute.jsp" target="bottom">
       <img src="images/xskdjs937.jpg" width="200" height="200" /> </a> 
    </div>
    
    <div>
       <a href="xminute.jsp" target="bottom">书名: </a>          
    </div>
    <div>
            作者：      
    </div>
    <div>
             价格：    
    </div>    
   </td>   
 </tr> -->
  <table width="100%"> 
   <c:forEach items="${books }" var="bookcategory">
    <tr>    
   <td>
    <div>
       <a href="<%=basePath%>FindbookBybidServlet?bid=${bookcategory.bid }" target="bottom" >
       <img width="200px" height="200px" src="${bookcategory.bimage }"></a> 
    </div>
    
    <div>
       <a href="FindbookBybidServlet?bid=${bookcategory.bid }" target="bottom">${bookcategory.bname } </a>          
    </div>
    <div>
         ${bookcategory.bauthor } 
    </div>
    <div>
         ${bookcategory.bprice }
    </div>    
   </td>   
    </tr>		
	</c:forEach>				
</table>    　


</body>
</html>