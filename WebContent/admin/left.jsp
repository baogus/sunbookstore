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
</style>

 <script type="text/javascript">
        //默认隐藏的
        var hide=true;
       
        //显示或者隐藏的函数
        function displayOrHide1(){
        	 var cityList=document.getElementById("cityList1");
            if(hide){
                //显示
                cityList.style.display="block";
                hide=false;
            }else{
                //隐藏
                cityList.style.display="none";
                hide=true;
            }
        }
        function displayOrHide2(){
            var cityList=document.getElementById("cityList2");
            if(hide){
                //显示
                cityList.style.display="block";
                hide=false;
            }else{
                //隐藏
                cityList.style.display="none";
                hide=true;
            }
        }
        function displayOrHide3(){
            var cityList=document.getElementById("cityList3");
            if(hide){
                //显示
                cityList.style.display="block";
                hide=false;
            }else{
                //隐藏
                cityList.style.display="none";
                hide=true;
            }
        }
       
        </script>   
<base target="body">
<meta charset="UTF-8">
<title>左边</title>
</head>

<body>
<div>		
	<nobr>
	
		<a style="color:blue;cursor:pointer;" onclick="displayOrHide1();">
			<img alt="" src="img/customer.png" style="height:12%; width: 12%;">用户管理</a>
	</nobr>
                <ul id="cityList1" style="display: none;">
                    <li><a href="user/adduser.jsp">增加用户</a></li>
                    <li><a href="user/deluser.jsp">删除用户</a></li>
                    <li><a href="user/selectuser.jsp">查询用户</a></li>
                    <li><a href="user/updateuser.jsp">修改用户</a></li>
                </ul>	
</div>
<br>
<br>
<div>
	<nobr>
	
		 <a style="color:blue;cursor:pointer;" onclick="displayOrHide2();">
		 	<img alt="" src="img/book.png" style="height:12%; width: 12%;">书籍管理</a>
		 </nobr>
                <ul id="cityList2" style="display: none;">
                    <li><a href="book/addbook.jsp">增加书籍</a></li>
                    <li><a href="book/delbook.jsp">删除书籍</a></li>
                    <li><a href="book/selectbook.jsp">查询书籍</a></li>
                    <li><a href="book/updatebook.jsp">修改书籍</a></li>
                   
                </ul>

</div>
<br>
<br>

<div>		
	<nobr>
	
		<a style="color:blue;cursor:pointer;" onclick="displayOrHide3();">
			<img alt="" src="img/shezhi.png" style="height:12%; width: 12%;">系统设置</a>
			</nobr>
                <ul id="cityList3" style="display: none;">
                    <li><a href="admin/selectadmin.jsp">查看信息</a></li>
                    <li><a href="admin/updateadmin.jsp">修改密码</a></li>
				</ul>
</div>
</body>
</html>