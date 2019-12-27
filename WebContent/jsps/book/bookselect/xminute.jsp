<%@page import="sunbookstore.category.dao.CategoryDao"%>
<%@page import="sunbookstore.category.domin.Category"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>

<style type="text/css">
    .inc{
        float:left;
        margin-left:3%;
        margin-top:1%;
        width:16%;
        height:90%;
        background-color:rgba(160,128,255,0.8);
    }
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=basePath%>jsps/book/bookselect/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="<%=basePath%>jsps/book/bookselect/js/querybook.js"></script>
<link rel="stylesheet" type="text/css" href="<%=basePath%>jsps/book/bookselect/css/books.css"/>
<script type="text/javascript" src="jquery-3.2.1.js"></script>
</head>
<body style="background-color:white;width:1400px;margin:0 auto">


<div style="width:70%;height:886px;float:left;margin-left:15%;">
 <c:forEach items="${bookids }" var="bookid">
    <!-- 通用界面 -->
    <div style="width:100%;height:800px;float:left;margin-top:2%;background-color:white;">
        <div style="width:100%;height:48%;float:left;margin-top:2%;margin-left:2%;">
        
            <div style="width:30%;height:100%;background-color:white;float:left">
               
                <img alt="图书" src="${bookid.bimage }" style="width:100%;"/>
                
            </div>
           
            <div style="width:60%;margin-left:8%;height:100%;float:left">
                <h2 style="margin-left:2%;float:left;width:94%">${bookid.bname }(一本你不容错过的好书！)</h2>
                <p style="margin-left:2%;float:left;width:94%;height:30%;">详情：${bookid.bdesc}<a style="margin-left:2%;" href="./">点击</a>查看更多同类好书！</p>
                <h2 style="margin-left:2%;margin-top:1%;float:left;width:94%;color:rgba(200,0,0,0.8);
                        text-align:center;background-color:#FFEEDD;height:18%;line-height:200%;">
                        <% %>
                                                          惊爆价：<fmt:formatNumber type="number" value=" ${bookid.bprice*(bookid.bdiscount*0.1) }" pattern="0.00" maxFractionDigits="2"/>&nbsp;元&nbsp;&nbsp;&nbsp;&nbsp;
                    <font style="color:rgba(0,0,0,0.6);font-size:24px;"><del>原价：${bookid.bprice }&nbsp;元</del></font>
                </h2>
                 
                    
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
	           <li > <font style="margin-left:2%;margin-top:1%;float:left;width:94%;font-size:14px;">库存：${bookid.bsum }
	           </font></li>  
          </ul>
      
             <font style="margin-left:2%;margin-top:1%;float:left;font-size:16px;">月销量：${mothcount }</font>
            </div>
          
        </div>
        </c:forEach>
        <div style="width:96%;height:40%;float:left;margin-top:2%;margin-left:2%;">
            <div style="width:100%;height:15%;text-align:center;line-height:50px;background-color:#FFE6D9;float:left">
                <font color="#ddd" style="font-size:20px;">为您推荐热门书籍</font>
            </div>
            <div style="width:100%;height:85%;text-align:center;line-height:45px;background-color:white;float:left">
                <div class="inc" style="margin-left:4%">
                    <img alt="图书" src="${bookid.bname }" style="width:100%;height:100%"/>
                </div>
            </div>
            
        </div>
</div>



</body>
</html>