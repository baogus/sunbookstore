<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.box{width:100%; height:600px;}
.yangshi{ width:75%; float:right;}
img { float: left;}
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
 <div class="box">
  <img src="images/xskdjs.jpg" />
    <div class="yangshi">
      <table>
       <tr>书籍名：肖申克的救赎</tr>
       <br>
         <tr>简介：“肖申克的救赎”享誉全世界的作品，一部不朽的励志经典，青年人的希望之书。<br>
               同名电影获奥斯卡奖七项提名，被誉为完美影片之一 。“每个美国家庭都拥有两本书，一本是圣经，<br>
               另一本八成就是斯蒂芬·金的小说”</tr>
        <br>
         <tr>作者：斯蒂芬.金　</tr>
         <tr>出版社：人民文学出版社</tr>
         <br>
          <tr>价格：¥32.90(8.66折)</tr>
          </table>
     </div  class="button">   

      <ul class = "nav">
  <li class = "list-item">
  <a href = "#">加入购物车</a></li>
  <li class = "list-item">
<a href = "#">立即下单</a></li>

  </ul>

   
</div>
  
</body>
</html>