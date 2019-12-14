<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>查看全部购物车</title>
<script type="text/javascript" src="jquery/jquery-3.2.1.js"></script>
<script type="text/javascript" src="jquery/queryshopping.js"></script>

</head>
<body background="image/bg1.jpg" height="500px">
<table border="1" bgcolor="white" align="center">
 <tr>
    <td></td>
    <td>图片</td>
    <td>书籍名称</td>
    <td>单价</td>
    <td>数量</td>
    <td>优惠</td>
    <td>小计</td>
    <td>操作</td>
 </tr>
 <tbody id="shopcar" >
 	<tr bgcolor="#FFFFCC" align="center">
		<td width="15%" height="80px">
			<div><img src="image/1.jpg" height="75"/></div>
		</td>
		<td>Java详解</td>
		<td>39.9元</td>
		<td>2</td>
		<td>有货</td>
		<td>9折</td>
		<td>79.8元</td>
		<td><a href="#">删除</a></td>
	</tr>
 	<tr bgcolor="#FFFFCC" align="center">
		<td width="15%" height="80px">
			<div><img src="image/1.jpg" height="75"/></div>
		</td>
		<td>Java详解</td>
		<td>39.9元</td>
		<td>2</td>
		<td>有货</td>
		<td>9折</td>
		<td>79.8元</td>
		<td><a href="#">删除</a></td>
	</tr>
	<tr bgcolor="#FFFFCC" align="center">
		<td width="15%" height="80px">
			<div><img src="image/1.jpg" height="75"/></div>
		</td>
		<td>Java详解</td>
		<td>39.9元</td>
		<td>2</td>
		<td>有货</td>
		<td>9折</td>
		<td>79.8元</td>
		<td><a href="#">删除</a></td>
	</tr>
	<tr bgcolor="#FFFFCC" align="center">
		<td width="15%" height="80px">
			<div><img src="image/1.jpg" height="75"/></div>
		</td>
		<td>Java详解</td>
		<td>39.9元</td>
		<td>2</td>
		<td>有货</td>
		<td>9折</td>
		<td>79.8元</td>
		<td><a href="#">删除</a></td>
	</tr>
 </tbody>
 
 <tfoot>
   <tr>
	   <td>共计:</td><td colspan="5" id="sum"></td>
	   <!-- <td colspan="2" align="center"><button id="settlement">结算</button></td> -->
	   <td colspan="2" align="center"><button id="clear">清空购物车</button></td>
 </tr>
 </tfoot>
 </table>
</body>
</html> 