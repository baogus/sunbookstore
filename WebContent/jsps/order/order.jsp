<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>订单列表</title>
<script type="text/javascript" src="/sunbookstore/jsps/shopcart/jquery/jquery-3.2.1.js"></script>
<script type="text/javascript">
	window.onload = function(){
		function getStyle(ele, attr) {
			var res = null;
			if (ele.currentStyle) {
				res = ele.currentStyle[attr];
			} else {
				res = window.getComputedStyle(ele, null)[attr];
			}
			return parseFloat(res);
		}
		function $(idName) {
			return document.getElementById(idName);
	
		}
		var table = $("table");
		var tableL = getStyle(table,"left");
		/* alert(tableL); */
	}
</script>
<script>
	$(function(){
		$("#checkAll").click(function(){
			$("input[type='checkbox']:gt(0)").prop("checked",this.checked);
		});
		$("input[type='checkbox']:gt(0)").click(function(){
			var checkArr = $("input[type='checkbox']:gt(0)").map(function(){return $(this)}).get();
			var result = false;
			for(var i=0;i<checkArr.length;i++){
				if(!checkArr[i]){
					result = true;
				}
			}
			if(result){
				$("#checkAll").prop("checked",true);
			}else{
				$("#checkAll").prop("checked",false);
			}
			
		});  
	});
</script>
</head>
<body bgcolor="#AAC5EE">
<div id="head"><h1>我的订单</h1></div>


<table width="80%" align="center" id ="table" style="border:2px solid #E6E6E6">

	<tr bgcolor="#CCCCCC"  height="40px" ><!--  -->
		<th><input type="checkbox" id="checkAll"/>全选</th>
		<th colspan = "2">书籍</th>
		<th>单价</th>
		<th>优惠</th>
		<th>库存</th>
		<th>数量</th>
		<th>小计</th>
		<th>操作</th>
	</tr>
	<tr height="35px">
		<td rowspan="2"><input type="checkbox"/ >选择</td>	
		<td colspan="7" >
			订单编号：abcdefg　成交时间：2000-01-01 15:30　金额：<font color="red"><b>319.2</b></font>　

					
		</td>
		<td rowspan="2"><a href="#">删除</a></td>
	</tr>
	<tr bgcolor="#FFFFCC" align="center">
		<td width="15%" height="80px">
			<div><img src="image/1.jpg" height="75"/></div>
		</td>
		<td>书名：Java详解</td>
		<td>单价：39.9元</td>
		<td>优惠：9折</td>
		<td>库存：有货</td>
		<td>数量：2</td>
		<td>小计：79.8元</td>
	</tr>
	<tr height="35px">
		<td rowspan="2"><input type="checkbox" "/>选择</td>
		<td colspan="7">
			订单编号：abcdefg　成交时间：2000-01-01 15:30　金额：<font color="red"><b>319.2</b></font>　

					
		</td>
		<td rowspan="2"><a href="#">删除</a></td>
	</tr>
	<tr bgcolor="#FFFFCC" align="center">
		<td width="15%" height="80px">
			<div><img src="image/2.jpg" height="75"/></div>
		</td>
		<td>书名：Java详解</td>
		<td>单价：39.9元</td>
		<td>优惠：9折</td>
		<td>库存：有货</td>
		<td>数量：2</td>
		<td>小计：79.8元</td>
	</tr>
	<tr >
		<td rowspan="2"><input type="checkbox" />选择</td>
		<td colspan="7" height="35px">
			订单编号：abcdefg　成交时间：2000-01-01 15:30　金额：<font color="red"><b>319.2</b></font>　

					
		</td>
		<td rowspan="2"><a href="#">删除</a></td>
	</tr>
	<tr bgcolor="#FFFFCC" align="center">
		<td width="15%" height="80px">
			<div><img src="image/3.jpg" height="75"/></div>
		</td>
		<td>书名：Java详解</td>
		<td>单价：39.9元</td>
		<td>优惠：9折</td>
		<td>库存：有货</td>
		<td>数量：2</td>
		<td>小计：79.8元</td>
	</tr>
</table>





</body>
</html>