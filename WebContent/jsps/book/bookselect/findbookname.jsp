<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>${msg }</p>
 <table width="100%"> 
   <c:forEach items="${booknames }" var="bookname">
    <tr>
      
   <td>

    <div>
       <a href="/sunbookstore/jsps/book/bookselect/booknameminute.jsp" target="bottom" >
       <img width="200px" height="200px" src="${bookname.bimage }">
       </a> 
    </div>
    
    <div>
       <a href="/sunbookstore/jsps/book/bookselect/booknameminute.jsp" target="bottom">${bookname.bname } </a>          
    </div>
    <div>
         ${bookname.bauthor } 
    </div>
    <div>
         ${bookname.bprice }
    </div>    
   </td>   
 </tr>
		
	</c:forEach>
				
</table>    　

</body>
</html>