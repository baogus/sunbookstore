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
		<title>用户登录页面</title>
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
				background:paleturquoise;
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
	</head>
	<body onselectstart="return false">
		<center></center>
			<div id="login_main">
				<div class="login">
<<<<<<< HEAD
					<form href="<c:url value='${base }jsps/customer/bottom.jsp'/>" target="bottom">
						<h2>
							<a href="/sunbookstore/admin/admin/login.jsp" target="bottom">管理员登陆</a>登录
=======
					<form href="bottom.jsp" target="bottom">
						<h2>
							<a href="bottom.jsp" target="bottom">管理员登陆</a>登录
>>>>>>> fcl
						</h2>
						<h3>账号</h3>
						<p><input type="text" name="name" placeholder="请输入用户名" pattern="[0-9A-Za-z]{6,16}" required/></p>
						<h3>密码</h3>
						<p><input type="password" name="password" placeholder="请输入密码" pattern="[0-9A-Za-z]{6,12}" required/></p>
						<h3>验证码</h3>
						<p><input type="text" value="" placeholder="请输入验证码（不区分大小写）" class="input-val" /></p>
						<h3></h3>
						<span><canvas id="canvas" width="100" height="43"></canvas></span>
						<p><button class="btn" type="submit" value="登  录">登  录</button></p>
						<h3>
							<a href="#" class="forget" target="bottom">忘记密码？</a>
						</h3>
					</form>
				</div>
			</div>
		</center>
<<<<<<< HEAD
		<script type="text/javascript" src="<c:url value='${base }jsps/customer/js/jquery.min.js'/>"></script>
=======
		<script type="text/javascript" src="js/jquery.min.js"></script>
>>>>>>> fcl
		<script type="text/javascript">
		    $(function(){
		        var show_num = [];
		        draw(show_num);
		
		        $("#canvas").on('click',function(){
		            draw(show_num);
		        })
		        $(".btn").on('click',function(){
		            var val = $(".input-val").val().toLowerCase();
		            var num = show_num.join("");
		            if(val==''){
		                alert('请输入验证码！');
		            }else if(val == num){
						window.open("#")
		            }else{
		                alert('验证码错误！请重新输入！');
		                $(".input-val").val('');
		                draw(show_num);
		            }
		        })
		    })
		
		    function draw(show_num) {
		        var canvas_width=$('#canvas').width();
		        var canvas_height=$('#canvas').height();
		        var canvas = document.getElementById("canvas");//获取到canvas的对象，演员
		        var context = canvas.getContext("2d");//获取到canvas画图的环境，演员表演的舞台
		        canvas.width = canvas_width;
		        canvas.height = canvas_height;
		        var sCode = "A,B,C,E,F,G,H,J,K,L,M,N,P,Q,R,S,T,W,X,Y,Z,1,2,3,4,5,6,7,8,9,0";
		        var aCode = sCode.split(",");
		        var aLength = aCode.length;//获取到数组的长度
		        
		        for (var i = 0; i <= 3; i++) {
		            var j = Math.floor(Math.random() * aLength);//获取到随机的索引值
		            var deg = Math.random() * 30 * Math.PI / 180;//产生0~30之间的随机弧度
		            var txt = aCode[j];//得到随机的一个内容
		            show_num[i] = txt.toLowerCase();
		            var x = 10 + i * 20;//文字在canvas上的x坐标
		            var y = 20 + Math.random() * 8;//文字在canvas上的y坐标
		            context.font = "bold 23px 微软雅黑";
		
		            context.translate(x, y);
		            context.rotate(deg);
		
		            context.fillStyle = randomColor();
		            context.fillText(txt, 0, 0);
		
		            context.rotate(-deg);
		            context.translate(-x, -y);
		        }
		        for (var i = 0; i <= 5; i++) { //验证码上显示线条
		            context.strokeStyle = randomColor();
		            context.beginPath();
		            context.moveTo(Math.random() * canvas_width, Math.random() * canvas_height);
		            context.lineTo(Math.random() * canvas_width, Math.random() * canvas_height);
		            context.stroke();
		        }
		        for (var i = 0; i <= 30; i++) { //验证码上显示小点
		            context.strokeStyle = randomColor();
		            context.beginPath();
		            var x = Math.random() * canvas_width;
		            var y = Math.random() * canvas_height;
		            context.moveTo(x, y);
		            context.lineTo(x + 1, y + 1);
		            context.stroke();
		        }
		    }
			
		    function randomColor() {//得到随机的颜色值
		        var r = Math.floor(Math.random() * 256);
		        var g = Math.floor(Math.random() * 256);
		        var b = Math.floor(Math.random() * 256);
		        return "rgb(" + r + "," + g + "," + b + ")";
		    }
		</script>
	</body>
</html>
