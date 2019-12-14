<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html> 
<head>

<style type="text/css">
	img {
	height:20px;
	width: 20px;
}

</style>
<title>添加用户</title>
<meta charset="UTF-8">
</head>
<body>

<center>
	<form action="" >
		<label><img src="../img/per.png">姓名: <input type="text" name="cname"></label><br>
		<label><img src="../img/password.png">密码: <input type="password" name="cpassword"></label><br>
		<label><img src="../img/address.png">地址: <input type="text" name="caddress"></label><br>
		<label><img src="../img/sex.png">性别: </lable></label>&nbsp;
		<label><input type="radio" name="sex" value="男生"><img src="../img/man.png">&nbsp;&nbsp;
			<label><input type="radio" name="sex" value="女生"><img src="../img/woman.png"></label><br>
		<label><img src="../img/tel.png">电话: <input type="text" name="ctel"></label><br>
		<label><input type="submit" value="添加" style="background-color: #77FFCC;width: 70px; align-content: center;"></label><br>
	</form>
</center>

</body>
</html>