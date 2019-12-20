<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="req" value="${pageContext.request }"/>
<c:set var="base" value="${req.scheme}://${req.serverName}:${req.serverPort}${req.contextPath }/"/>
<!DOCTYPE html>
<html>
<head>
 <base href="${base }">
		<meta charset="utf-8">
		<base tarfet="top">
		<title>Insert title here</title>
		<style type="text/css">
			*{
				margin:0;
				padding:0;
			}
			ul{
				list-style:none;
			}
		/*navigation start*/
		
			/*top start*/
			.top{
				width:100%;
				height:54px;
				background:#2f333b;
			}
			.top .t_logo:hover{
				background-position:0 -54px;
			}
			.top .t_login{
				height:54px;
				float:right;
				margin-right:6%;
			}
			li{
				float:left;
				padding:0 8px 0 8px;
				line-height:54px;
				color:#b8bbbf;
			}
			a{
				font-size:14px;
				color:#b8bbbf;
				display:block;
				text-decoration:none;
			}
			a:hover{
				color:#fff;
			}
			/*top end */
			
			/*tools start*/
			.tools{
				width:100%;
				height:75px;
				color:#8b8c8f;
				background:linear-gradient(#fff,#F4F4F7);
			}
			.tools .t_nav{
				width:1200px;
				height:75px;
				margin:0 auto;
				}
			.tools .n_icon{
				width:448px;
				height:75px;
				float:left;
			}
			.tools .n_icon li{
				float:left;
				padding-right:50px;
			}
			.tools .n_icon li a{
				text-decoration:none;
				line-height:75px;
				display:inline-block;
				color:#8b8c8f;
				font-size:18px;
			}
			.tools .n_icon li a:hover span{
				color:#6dc186;
			}
			.n_search{
				float:right;
				margin-top:16px;
			}
			.n_search .s_box{
				width:493px;
				height:39px;
				border:3px solid #6dc186;
				float:left;
				position:relative;
				border-radius:4px;
			}
			.tools .t_nav .n_search .s_box .b_btn{
				width:79px;
				height:45px;
				background:#6dc186;
				display:inline-block;
				font-size:18px;
				text-decoration:none;
				text-align:center;
				line-height:45px;
				color:#fff;
				position:absolute;
				right:-3px;
				top:-3px;
				border-radius: 0px 4px 4px 0px;
			}
			.tools .t_nav .n_search .s_box .b_btn:hover{
				background:#4DB36B;
			}
			.tools .t_nav .n_search .s_car{
				display:inline-block;
				background:#feaf51;
				float:left;
				font-size:18px;
				margin-left:10px;
				text-decoration:none;
				text-align:center;
				line-height:39px;
				color:#fff;
				padding: 3px 15px 3px 15px;
				border-radius:4px;
			}
			.tools .t_nav .n_search .s_car:hover{
				background:#FEA436;
			}
			.tools .t_nav .n_search .s_box .b_txt{
				width:406px;
				height:39px;
				border:none;
				padding-left:10px;
				line-height:39px;
				outline:none;
				font-size:14px;
			}
			/*end tools*/
		/*navigation end*/
		</style>
	</head>
	<body onselectstart="return false">
	<!-- navigation start -->
		<!--top start-->
		<div class="top">
			<div class="t_login">
				<ul>
					<li><a href="<c:url value='${base }jsps/customer/login.jsp'/>" target="bottom">登录</a></li>
					<li>|</li>
					<li><a href="<c:url value='${base }jsps/customer/register.jsp'/>" target="bottom">注册</a></li>
				</ul>
			</div>
		</div>
		<!--end top-->
		
		<!--tools start-->
		<div class="tools">
			<div class="t_nav">
				<!--home_page start-->
				<div class="n_icon">
					<ul>
						<li>
							<a href="<c:url value='${base }jsps/customer/bottom.jsp'/>" target="bottom">
								<span>首页</span>
							</a>
						</li>
					</ul>
					<ul>
						<li>
							<a href="<c:url value='${base }jsps/customer/my_page.jsp'/>" target="bottom">
								<span>个人主页</span>
							</a>
						</li>
					</ul>
					<ul>
						<li>
							<a href="<c:url value='${base }jsps/customer/contact_us.jsp'/>" target="bottom">
								<span>联系我们</span>
							</a>
						</li>
					</ul>
					<ul>
						<li>
							<a href="<c:url value='${base }jsps/customer/about.jsp'/>" target="bottom">
								<span>关于</span>
							</a>
						</li>
					</ul>
				</div>
				<!--home_page end-->
		
				<!--n_search start-->
				<div class="n_search">
					<div class="s_box">
						<a href="#" class="b_btn" target="bottom">搜索</a>
						<input type="text" class="b_txt" placeholder="搜索你喜欢的书籍"/>
					</div>
					<a href="<c:url value='${base }jsps/shopcart/queryall.jsp'/>" class="s_car" target="bottom">
						购物车
					</a>
				</div>
				<!--end n_search-->
		
			</div>
		</div>
		<!--end tools-->
		
	<!--navigation end-->
	</body>
</html>