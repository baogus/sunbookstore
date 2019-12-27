<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
    <%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
<p>${msg }</p>
 <table> 
  <tr>
   <c:forEach items="${booknames }" var="bookname">     
   <td>
    <div>
       <a href="<%=basePath%>FindbookBybidServlet?bid=${bookname.bid }" target="bottom" >
       <img width="200px" height="200px" src="${bookname.bimage }">
       </a> 
    </div>
    
    <div>
       <a href="FindbookBybidServlet?bid=${bookname.bid }" target="bottom">${bookname.bname } </a>          
    </div>
    
    <div>
         ${bookname.bauthor } 
    </div>
    
    <div>
         ${bookname.bprice }
         ${bookname.bdiscount }
         <fmt:formatNumber type="number" value=" ${bookname.bprice*bookname.bdiscount*0.1 }" pattern="0.00" maxFractionDigits="2"/>
    </div>    
   </td> 
   </c:forEach>  
 </tr>
		
	
				
</table>    　

</body>
</html>