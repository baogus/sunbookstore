<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<<<<<<< HEAD
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="req" value="${pageContext.request }"/>
<c:set var="base" value="${req.scheme}://${req.serverName}:${req.serverPort}${req.contextPath }/"/>
<!DOCTYPE html>
<html>
<head>
 <base href="${base }">
=======
<!DOCTYPE html>
<html>
	<head>
>>>>>>> fcl
		<meta charset="utf-8">
		<title>个人主页</title>
		<style type="text/css">
			*{
				margin:0px;
				padding: auto;
			}
			body{
				background:#42A8C0;
			}
			.main{
				width:1000px;
				height:634px;
				margin:100px auto;
			}
			.war{
				width:325px;
				height:500px;
				background:thistle;
				border-radius:10px;
				box-shadow:0px 0px 5px #666;
				float:right;
				padding:20px 50px;
				margin: auto 300px;
			}
			.customer{
				height: 120px;
			}
			.customer_img{
				float: left;
				margin: 20px 0 0 25px;
			}
			.customer_title{
				float: left;
				color: #fff;
				margin-left: 15px;
				margin-top: 50px;
			}
			.customer_img img{
				width: 80px;
			}
			.customer_bg{
				background:azure;
			}
			.customer_bg li{
				border-bottom: 1px solid #ddd;
				line-height: 45px;
				overflow: hidden;
			}
			.customer_bg li a{
				color: #333;
				text-decoration:none;
			}
			.customer_bg i{
				width: 20px;
				height: 20px;
				display: block;
				margin-left: 12px;
				float: left;
				margin-right: 15px;
				text-align: center;
			}
			.customer_bg span{
				float: left;
				display: block;
			}
			.customer_bg span input{
				border: none;
				background:azure;
				color: lightcoral;
				font-size: 17px;
			}
			.last{
				margin-top: 50px;
				margin-left: 80px;
				
			}
			.last input{
				border-color: none;
				background-color: cornsilk;
				border-radius: 30%;
				color: black;
				font-size:15px;
			}
			.last input:hover{
				border-color: none;
				background-color: cornsilk;
				border-radius: 30%;
				color: black;
				font-size:20px;
			}
		</style>
	</head>
	<body onselectstart="return false">
		<div class="main">
			<div class="war">
				<div class="customer">
					<div class="customer_img">
<<<<<<< HEAD
						<img src="<c:url value='${base }jsps/customer/img/default_photo.png'/>" />
=======
						<img src="img/default_photo.png" />
>>>>>>> fcl
					</div>
					<div class="customer_title">欢迎进入阳光书店</div>
				</div>
					<form>
						<ul class="customer_bg">
							<li><a href="#"><span>姓名:<input  type="text" value="张三" readonly="readonly"></span></a></li>
							<li><a href="#"><span>编号:<input  type="text" value="a312429173461" readonly="readonly"></span></a></li>
							<li><a href="#"><span>性别:<input  type="text" value="男" readonly="readonly"></span></a></li>
							<li><a href="#"><span>电话:<input  type="text" value="13737214728" readonly="readonly"></span></a></li>
							<li><a href="#"><span>收货地址:<input  type="text" value="宁夏银川市西夏区二民院" readonly="readonly"></span></a></li>
<<<<<<< HEAD
							<li><span><a href="<c:url value='${base }jsps/order/order.jsp'/>" target="bottom">查看我的订单</a></span></li>
=======
							<li><span><a href=" /sunbookstore/jsps/order/order.jsp" target="bottom">查看我的订单</a></span></li>
>>>>>>> fcl
						</ul>
						<div class="last">
							<input type="button" value="修改信息" name="change"/>
							&nbsp;&nbsp;
							<input type="button" value="退出登陆" name="quit"/>
					</form>
				</div>
			</div>
		</div>
	</body>
</html>
