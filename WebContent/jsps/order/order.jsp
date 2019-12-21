<<<<<<< HEAD
=======
<%@page import="sunbookstore.order.domin.Orders"%>
<%@page import="java.util.List"%>
>>>>>>> fxb
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>订单列表</title>
<script type="text/javascript" src="/sunbookstore/jsps/shopcart/jquery/jquery-3.2.1.js"></script>
</head>
<body bgcolor="#AAC5EE">
<div id="head"><h1>我的订单</h1></div>


<table width="80%" align="center" id ="table" style="border:2px solid #E6E6E6">
<<<<<<< HEAD

	<tr bgcolor="#CCCCCC"  height="40px" ><!--  -->
=======
	<tr bgcolor="#CCCCCC"  height="40px" >
>>>>>>> fxb
		<th colspan = "2">书籍</th>
		<th>单价</th>
		<th>收货人</th>
		<th>数量</th>
		<th>小计</th>
		<th>操作</th>
	</tr>
<<<<<<< HEAD
	<tr height="35px">
		<td colspan="6" >
			订单编号：abcdefg　成交时间：2000-01-01 15:30　

					
		</td>
		<td rowspan="2"><a href="OrderDetail.jsp" target="bottom">付款</a><br><a href="#">删除</a></td>
	</tr>
	<tr bgcolor="#FFFFCC" align="center">
		<td width="15%" height="80px">
			<div><img src="image/1.jpg" height="75"/></div>
		</td>
		<td>书名：Java详解</td>
		<td>单价：39.9元</td>
		<td>收货人信息</td>
		<td>数量：2</td>
		<td>小计：79.8元</td>
	</tr>
	<tr height="35px">
=======
	
	<%
	List<Orders> orders = (List<Orders>)request.getAttribute("orders");
	for( Orders order:orders){
	%>
	
	<tr height="35px">
		<td colspan="6" >
			订单编号：<%=order.getOid() %>　成交时间：<%=order.getOtime() %>			
		</td>
		<td rowspan="2">
			<a href="#">付款</a><br>
			<a href="/sunbookstore/DeleteOrderServlet?cid=<%=order.getCid()+"&oid="+order.getOid() %>">删除</a>
		</td>
	</tr>
	<tr bgcolor="#FFFFCC" align="center">
		<td width="15%" height="80px">
			<div><img src="/sunbookstore/jsps/order/image/1.jpg" height="75"/></div>
		</td>
		<td><%=order.getBname() %></td>
		<td><%=order.getBprice() %></td>
		<td>
			<div><%=order.getCname() %></div>
			<div><%=order.getCaddress()%></div>
		</td>
		<td><%=order.getOnum() %></td>
		<td><%=order.getOsubtotal() %></td>
	</tr>
	<!-- <tr height="35px">
>>>>>>> fxb
		<td colspan="6">
			订单编号：abcdefg　成交时间：2000-01-01 15:30　

					
		</td>
<<<<<<< HEAD
		<td rowspan="2"><a href="OrderDetail.jsp" target="bottom">付款</a><br><a href="#">删除</a></td>
=======
		<td rowspan="2"><a href="#">付款</a><br><a href="#">删除</a></td>
>>>>>>> fxb
	</tr>
	<tr bgcolor="#FFFFCC" align="center">
		<td width="15%" height="80px">
			<div><img src="image/2.jpg" height="75"/></div>
		</td>
		<td>书名：Java详解</td>
		<td>单价：39.9元</td>
		<td>收货人信息</td>
		<td>数量：2</td>
<<<<<<< HEAD
		<td>小计：79.8元</td>sssss
=======
		<td>小计：79.8元</td>
>>>>>>> fxb
	</tr>
	<tr >
		<td colspan="6" height="35px">
			订单编号：abcdefg　成交时间：2000-01-01 15:30　

					
		</td>
<<<<<<< HEAD
		<td rowspan="2"><a href="OrderDetail.jsp" target="bottom">付款</a><br><a href="#">删除</a></td>
=======
		<td rowspan="2"><a href="#">付款</a><br><a href="#">删除</a></td>
>>>>>>> fxb
	</tr>
	<tr bgcolor="#FFFFCC" align="center">
		<td width="15%" height="80px">
			<div><img src="image/3.jpg" height="75"/></div>
		</td>
		<td>书名：Java详解</td>
		<td>单价：39.9元</td>
		<td>收货人信息</td>
		<td>数量：2</td>
		<td>小计：79.8元</td>
	</tr>
<<<<<<< HEAD
=======
	 -->
	<%
	
	}
	
	%>
	
>>>>>>> fxb
</table>





</body>
</html>