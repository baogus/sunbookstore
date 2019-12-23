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
<script type="text/javascript" src="jquery-3.2.1.js"></script>
<script>
$(function(){
	         $(".add").click(function(){
	         var t=$(this).parent().find('input[class*=text_box]');
	         t.val(parseInt(t.val())+1)
	         setTotal();
	     })
	     $(".min").click(function(){
	         var t=$(this).parent().find('input[class*=text_box]');
	         if (parseInt(t.val())>1) {
	         t.val(parseInt(t.val())-1)
	         if(parseInt(t.val())<0){
	        	 t.val(0);
	         	}
	         	setTotal();
	         }
	     })
	     function setTotal(){
	         var s=0;
	         $("#tab td").each(function(){
	         s+=parseInt($(this).find('input[class*=text_box]').val())*parseFloat($(this).find('span[class*=price]').text());
	     });
	         $("#total").html(s.toFixed(2));
	     }
	     setTotal();
	 
	     });
	     </script>

<style>

*{
	margin:0;
    padding:0;
	font-family:arial;
	color:#424242;
}
.nav{
	list-style:none;
	
}
a{
	
	text-decoration:none;
}
.nav .list-item{
	float:left;
	margin:0 10px;
	height:30px;
	line-height:30px;
	
}
.nav::after{
	content:"";
	display:block;
	clear:both;
	
}
.nav .list-item a{
	color:#f40;
	padding:0 5px;
	font-weight:bold;
	display:inline-block;
	border-radius:15px;
}
.nav .list-item a:hover{
	background-color:#f40;
	color:#fff;
	
	
}

</style>
</head>
<body>
<table>
 <c:forEach items="${bookids }" var="bookid">
 
    <tr>
       <td ><img width="200px" height="200px" src="${bookid.bimage }"></td>
       <td>
         <div>${bookid.bname }</div>
         <div>${bookid.bdesc}</div>
         <div>${bookid.bauthor}</div>
         <div>${bookid.bpub}</div>
         <div>${bookid.bprice}</div>
         <div>${bookid.bdiscount}</div>      
         
           <ul class = "nav">
              <li class = "list-item">
              <a href = "#">加入购物车</a></li>
              <li class = "list-item">
              <a href = "#">立即下单</a></li>
               <li class="list-item">
						<input class="min" name="" type="button" value="-" />    
						<input class="text_box" name="" type="text" value="1"/>    
						<input class="add" name="" type="button" value="+" />
	           </li>      
          </ul>
       </tr>
 
  </c:forEach>
</table> 
</body>
</html>