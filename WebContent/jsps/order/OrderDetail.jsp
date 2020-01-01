<%@page import="java.sql.Date"%>
<%@page import="sunbookstore.order.domin.Orders"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>订单明细</title>
<script type="text/javascript" src="/sunbookstore/jsps/shopcart/jquery/jquery-3.2.1.js"></script>
<script type="text/javascript">
$(function(){
	$("tr:even:gt(0)").css("background-color","#FFFFCC");
	$("tr:odd").css("background-color","#E2F2FF");
});
</script>
</head>
<body>


<table border="1" width="80%" cellspacing="0" background="black" align="center">
	<tr>
		<td colspan="6">
			<h1>当前订单</h1>
		</td>
	</tr>
<%
	double oid=0;
	Date otime = null;
	int total = 0;
	String addressString = null;
	String ostate = null;
	List<Orders> orderList = (List<Orders>)request.getAttribute("orderList");
	for(int i = 0;i<1;i++){
		 oid = orderList.get(0).getOid();
		 otime = orderList.get(0).getOtime();
		 ostate = orderList.get(0).getOstate();
	}
%>
	<tr  height="40px">
		<td colspan="6">
			订单编号：<%=(long)oid %>　成交时间：<%=otime%>　
		</td>
	</tr>
<%
		for(Orders order:orderList ){
%>
	<tr  height="80px" align="center">
		<td width="15%">
			<div><img src="/book_img/9317290-1_l.jpg" height="75"/></div>
		</td>
		<td>书名：<%=order.getBname() %></td>
		<td>单价：<%=order.getBprice() %>元</td>
		<td>折扣：<%=order.getBdiscount() %>折</td>
		<td>数量：<%=order.getOnum() %></td>
		<td>小计：<%=order.getOsubtotal() %>元</td>
		<%
			total += order.getOsubtotal();
		%>
	</tr>
	<%
		addressString = order.getCaddress()+order.getCname()+"（收）";
		}
	%>
	<tr>
		<td colspan="3"></td>
		<td colspan="3" align="center">
			<form method="post" action="UpdateOrderServlet?oid=<%=(long)oid %>" id="form" method="get">
	收货地址：<input type="text" name="address" size="50" value="<%=addressString %>"/><br/>
	<%
		if(ostate.equals("待付款")){
	%>
	选择支付方式：<br/>
	<input type="radio" name="pd_FrpId" value="ICBC-NET-B2C" checked="checked"/>工商银行
	<img src="../../bank_img/icbc.bmp" align="middle"/>
	<input type="radio" name="pd_FrpId" value="BOC-NET-B2C"/>中国银行
	<img src="../../bank_img/bc.bmp" align="middle"/><br/><br/>
	<input type="radio" name="pd_FrpId" value="ABC-NET-B2C"/>农业银行
	<img src="../../bank_img/abc.bmp" align="middle"/>
	<input type="radio" name="pd_FrpId" value="CCB-NET-B2C"/>建设银行
	<img src="../../bank_img/ccb.bmp" align="middle"/><br/><br/>
	<input type="radio" name="pd_FrpId" value="BOCO-NET-B2C"/>交通银行
	<img src="../../bank_img/bcc.bmp" align="middle"/>
	<input type="radio" name="pd_FrpId" value="BOCO-NET-B2C"/>钱包
	<img src="../../bank_img/bcc.bmp" align="middle"/><br/>
</form>
	<a id="pay" href="javascript:document.getElementById('form').submit();">支付</a>
	<%
		}
	%>
	总金额：<font color="red"><b><%=total %>元</b></font>
		</td>
	</tr>

</table>
<h1 align="center">${msg }</h1>
<br/>
	<!-- <script type="text/javascript">
		var a = ($(document).wight() - $('table').wight()) / 2;
		alert('sgs');
		$('form').css('padding-right', a + 'px');
	</script> -->


</body>
</html>