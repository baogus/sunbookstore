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
<html lang="en">
	<head>
>>>>>>> fcl
 		<meta charset="UTF-8">
		<title>用户注册页面</title>
		<style type="text/css">
			*{
				margin:0px;
				padding: auto;
			}
			body{
				background:#42A8C0;
			}
			#login_main{
				width:1000px;
				height:634px;
				margin:100px 0px;
			}
			#login_main .login{
				width:325px;
				height:500px;
				background:#FCF8E3;
				border-radius:10px;
				box-shadow:0px 0px 5px #666;
				float:right;
				padding:20px 50px;
				margin: auto 300px;
			}
			#login_main .login h2{
				line-height:45px;
				font-size:26px;
				font-family:"微软雅黑";
				font-weight:100;
				padding-bottom:20px;
			}
			a{
				color:#02b1cb;
				font-size:14px;
				float:right;
				text-decoration:none;
			}
			#login_main .login h3{
				font-size:14px;
				font-family:"微软雅黑";
				line-height:35px;
				font-weight:100;
				padding-top:15px;
			}
			#login_main .login h3 a .forget{
				float:left;
				float:right;
			}
			#login_main .login p input{
				width:300px;
				height:35px;
				border:1px solid #ddd;
				text-indent:10px;
				color:#ccc;
			}
			#login_main .login .btn{
				width:300px;
				height:45px;
				background:aquamarine;
				color:#282C35;
				font-size:16px;
				border-radius:5px;
				text-align:center;
				line-height:45px;
				margin-top:20px;
				border:0px;
			}
			#login_main #canvas{
				border: 1px solid #ddd;
			}
  		</style>
		<script>
			var provinces = [
				["深圳市","东莞市","惠州市","广州市"],
				["长沙市","岳阳市","株洲市","湘潭市"],
				["厦门市","福州市","漳州市","泉州市"]
			];	
			function selectProvince(){
				var province = document.getElementById("province");
				//得到当前选中的是哪个省份
				//alert(province.value);
				var value = province.value;
				//从数组中取出对应的诚实信息
				var cities = provinces[value];
				var cityselect = document.getElementById("city");
				//清空select中的option
				cityselect.options.length = 0;
				for(var i = 0;i < cities.length;i++){
				//alert(cities[i]);
				//获得相对应的文本
				var cityText = cities[i];
				//动态创建城市节点<option>
				var option1 = document.createElement("option");
				//创建城市文本节点
				var textNode = document.createTextNode(cityText);
				//创建城市文本节点和内容关联起来
				option1.appendChild(textNode);
				//添加到城市select中
				cityselect.appendChild(option1);
				}
			}
		</script>
	</head>
	<body  onselectstart="return false">
		<div id="login_main">
			<div class="login">
<<<<<<< HEAD
				<form action="<c:url value='${base }jsps/index.jsp'/>" target="bottom">
=======
				<form action="index.jsp" target="bottom">
>>>>>>> fcl
					<h2>
						<a href="register.html" target="bottom">登录</a>注册
					</h2>
					<h3>账号</h3>
					<p><input type="text" name="name" placeholder="请输入用户名" pattern="[0-9A-Za-z]{6,16}" required/></p>
					<h3>密码</h3>
					<p><input type="password" name="password" placeholder="请输入密码" pattern="[0-9A-Za-z]{6,12}" required/></p>
					<h3>收货地址</h3>
					<p>
					<!--选择省份-->
						<select onchange="selectProvince();" id="province">
							<option value="-1">--请选择省份--</option>
							<option value="0">广东省</option>
							<option value="1">湖南省</option>
							<option value="2">福建省</option>
						</select>
						<!--选择城市-->
						<select id="city">
							<option>--请选择城市--</option>
						</select>
					</p><br />
					<P>
						<input type="text" name="" />
					</P>
					<p><input type="submit" class="btn" value="同意协议并注册"/></p>
				</form>
			</div>
		</div>
	</body>
</html>
