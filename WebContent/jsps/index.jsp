<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
		<head>
		<meta charset="utf-8">
		<title>主页面</title>
		<style>
			*{
				margin: 0px;
				padding: 0px;
				background:#42A8C0;
			}
			.top{
				width: 100%;
				height: 10%;
			}
			.left{
				float: left;
				height: 62.5rem;
				width: 10%
			}
			.lunpotu{
				float: left;
				width: 90%;
				height: 18.75rem;
			}
			.bottom{
				float: left;
				width: 90%;
				height: 62.5rem;
			}
		</style>
	</head>
	<body onselectstart="return false">
		<div class="top">
			<iframe name="top" width="100%" src="customer/top.jsp"></iframe>
		</div>
		<div class="left">
			<iframe name="left" width="100%" height="100%" src="customer/left.jsp"></iframe>
		</div>
		<!--<div class="lunpotu">
			<iframe name="lunpotu" width="100%" height="100%" src="customer/lunpotu.jsp"></iframe>
		</div>-->
		<div class="bottom">
			<iframe name="bottom" width="100%" height="100%" src="customer/bottom.jsp" scrolling="no"></iframe>
		</div>
	</body>
</html>
