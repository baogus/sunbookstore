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
	<tr  height="40px">
		<td colspan="6">
			订单编号：123456　成交时间：2000-01-01 15:30　金额：<font color="red"><b>319.2元</b></font>
		</td>
	</tr>

	<tr  align="center">
		<td width="15%">
			<div><img src="/book_img/9317290-1_l.jpg" height="75"/></div>
		</td>
		<td>书名：Java详解</td>
		<td>单价：39.9元</td>
		<td>折扣：9折</td>
		<td>数量：2</td>
		<td>小计：79.8元</td>
	</tr>

</table>
<br/>
<div style="margin:200px,100px ;background-color:red;">
<form method="post" action="javascript:alert('别点了，再点就去银行页面了！');" id="form" target="_parent">
	收货地址：<input type="text" name="address" size="50" value="北京市海淀区金燕龙大厦2楼216室无敌收"/><br/>

	选择银行：<br/>
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

</div>

</body>
</html>