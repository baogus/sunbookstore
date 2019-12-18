<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

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
       <a href="xminute.jsp" target="bottom" width="200" height="200">${bookcategory.bimage } </a> 
    </div>
    
    <div>
       <a href="xminute.jsp" target="bottom">${bookcategory.bname } </a>          
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