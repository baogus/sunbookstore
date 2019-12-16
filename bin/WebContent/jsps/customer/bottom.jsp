<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>内容显示页面</title>
		<link rel="stylesheet" href="css/bootstrap.min.css">
		<script src="js/jquery.min.js"></script>
		<script src="js/popper.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<style>
			body{
				background:#DBDBE1;
			}
		/* 让图像完全响应*/
		.carousel-inner img {
			align-content: center;
		    width: 100%;
		    height: 300px;
			border: lightgreen 2px solid;
		}
		.bottom_bottom{
			background: #02B1CB;
		}
		</style>
	</head>
	<body onselectstart="return false">
		<div id="demo" class="carousel slide" data-ride="carousel">
		 
		  <!-- 指示符 -->
		  <ul class="carousel-indicators">
		    <li data-target="#demo" data-slide-to="0" class="active"></li>
		    <li data-target="#demo" data-slide-to="1"></li>
		    <li data-target="#demo" data-slide-to="2"></li>
			<li data-target="#demo" data-slide-to="3"></li>
			<li data-target="#demo" data-slide-to="4"></li>
			<li data-target="#demo" data-slide-to="5"></li>
			<li data-target="#demo" data-slide-to="6"></li>
		  </ul>
		 
		  <!-- 轮播图片 -->
		  <div class="carousel-inner">
		    <div class="carousel-item active">
		      <img src="img/1.jpg">
		    </div>
		    <div class="carousel-item">
		      <img src="img/2.jpg">
		    </div>
		    <div class="carousel-item">
		      <img src="img/3.jpg">
		    </div>
			<div class="carousel-item">
			  <img src="img/4.jpg">
			</div>
			<div class="carousel-item">
			  <img src="img/5.jpg">
			</div>
			<div class="carousel-item">
			  <img src="img/6.jpg">
			</div>
			<div class="carousel-item">
			  <img src="img/7.jpg">
			</div>
		  </div>
		 
		  <!-- 左右切换按钮 -->
		  <a class="carousel-control-prev" href="#demo" data-slide="prev">
		    <span class="carousel-control-prev-icon"></span>
		  </a>
		  <a class="carousel-control-next" href="#demo" data-slide="next">
		    <span class="carousel-control-next-icon"></span>
		  </a>
		</div>
		<div>
			  <table width="100%">
  <tr>
   <td>
    <div>
       <a href="xminute.jsp" target="bottom">
       <img src="images/xskdjs.jpg" width="200" height="200" /> </a> 
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
      <td>
    <div>
       <img src="images/ltxz.jpg" width="200" height="200" />
    </div>
    
    <div>
            书名:    
    </div>
    <div>
           作者：        
    </div>
    <div>
            价格：    
    </div>
   </td> 
   
    <td>
    <div>
       <img src="images/sjjs.jpg" width="200" height="200" />
    </div>
    
    <div>
            书名:     
    </div>
    <div>
             作者：   
    </div>
    <div>
             价格：    
    </div>
   </td> 
   
   
      <td>
    <div>
       <img src="images/gqzdyz.jpg" width="200" height="200" />
    </div>
    
    <div>
              书名:     
    </div>
    <div>
             作者：
    </div>
    <div>
             价格：    
    </div>
   </td>   
 </tr>

 <tr>
   <td>
    <div>
       <img src="images/gqzdyz.jpg" width="200" height="200" />
    </div>
    
    <div>
             书名:    
    </div>
    <div>
             作者：
    </div>
    <div>
             价格：    
    </div>
   </td>
 </tr>
 </table>
			 
		</div>
	</body>
</html>