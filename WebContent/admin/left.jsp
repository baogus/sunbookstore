<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.customer{
	height:20px;
    width:50px;
    position:absolute;
    background-image:url('img/customer.png');
   background-size: 100% 100%;
   	}
   	/* 去超链接的下划线 */
   	a{
   	text-decoration:none;
   	
   	}
</style>
    <!-- 引用jquery框架文件，这样脚本中就可以使用jquery了-->
<script type="text/javascript" src="jquery/jquery-3.2.1.js"></script>
 <script type="text/javascript">
     
        $(function(){

            //定义鼠标悬停事件
            $(".menu li a").hover(function(){
                $(this).addClass("hover");
            },function(){
                $(this).removeClass("hover");
            });
            //定义上滑事件
            $(".title").click(function(){
                var $ul=$(this).next("ul");
                $("dd").find("ul").slideUp();
                if ($ul.is(':visible')){
                    $(this).next('ul').slideUp();
                }else{
                    $(this).next('ul').slideDown();
                }
            });
        });       
        </script>   
<base target="body">
<meta charset="UTF-8">
<title>左边</title>
</head>

<body>
<div>		

	<div class="title" >
		<a style="color:blue;cursor:pointer;" >
			<img alt="" src="img/customer.png" style="height:12%; width: 12%;">用户管理</a>
	</div>
               <ul class="menu" style="display: none;">
                    <li><a href="user/adduser.jsp" >增加用户</a></li>
                        <br>
                    <li><a href="user/deluser.jsp">删除用户</a></li>
                        <br>
                    <li><a href="user/selectuser.jsp">查询用户</a></li>
                        <br>
                    <li><a href="user/updateuser.jsp">修改用户</a></li>
               </ul>	
</div>
<br>
<br>
<div>
	<div class="title" >
		 <a style="color:blue;cursor:pointer;">
		 	<img alt="" src="img/book.png" style="height:12%; width: 12%;">书籍管理</a>
	</div>
                <ul class="menu" style="display: none;">
                    <li><a href="book/addbook.jsp">增加书籍</a></li>
                        <br>
                    <li><a href="book/delbook.jsp">删除书籍</a></li>
                        <br>
                    <li><a href="book/selectbook.jsp">查询书籍</a></li>
                        <br>
                    <li><a href="book/updatebook.jsp">修改书籍</a></li>
                   
                </ul>
</div>
<br>
<br>

<div>		
	<div class="title" >
	
		<a style="color:blue;cursor:pointer;">
			<img alt="" src="img/shezhi.png" style="height:12%; width: 12%;">系统设置</a>
	</div>
                <ul  class="menu"  style="display: none;">
                    <li><a href="admin/selectadmin.jsp">查看信息</a></li>
                    <br>
                    <li><a href="admin/updateadmin.jsp">修改密码</a></li>
				</ul>
</div>
</body>
</html>