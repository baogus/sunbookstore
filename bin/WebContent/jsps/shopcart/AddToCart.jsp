<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>加入购物车</title>
</head>
<body>

<form action="#">
	<table>
		<tr>
			<td>请输入书籍的编号：</td>
			<td><input type="text" name="bid" value=""/></td>
		</tr>
		<tr>
			<td>请输入用户的编号：</td>
			<td><input type="text" name="cid" value=""/></td>
		</tr>
		<tr align="center">
			<td colspan="2">
				<input type="submit" value="确定"/>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="reset" value="取消"/>
			</td>
		</tr>
	</table>

</form>

</body>
</html>