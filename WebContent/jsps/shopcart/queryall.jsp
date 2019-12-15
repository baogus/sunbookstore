<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
	<head>
		<meta charset="UTF-8">
		<title>查看全部购物车</title>
		<script type="text/javascript" src="jquery/jquery-3.2.1.js"></script>
		<script type="text/javascript" src="jquery/queryshopping.js"></script>
		<style type="text/css">
			*{
				margin: 0;
				padding: 0;
			}
			body{
				line-height:20px;
				color:darkcyan;
			   }
			.war{
				width:100%;
				margin:10px auto 5px auto;
				clear:both;
			 }
			 table .title{
				background: navajowhite;
				height: 50px;
			}
			table .title td{
				color: brown;
				text-align: center;
				font-size: 20px;
				border-right:solid 2px #FFF;
			}
			table{
				margin: 80px auto;
			}
			.line{
				background-color:#a7cbff;
				height:3px;
				}	
			a{
				color:#1965b3;
			    text-decoration: none;
			}    
			a:hover{
				color:red;
				text-decoration:underline;
				font-size: 17px;
			}
			img:hover{
				width:100px
			}
			tfoot button{
				background: #FF801F;
				width: 90px;
				height: 30px;
				border-radius: 20%;
				border:crimson 1px solid;
				color: white;
			}
			tfoot button:hover{
				width: 100px;
				background: deeppink;
				color: black;
				border-radius: 30%;
			}
			.cart_td_1{
				border-bottom:solid 2px #d1ecff;
				border-top:solid 2px #d1ecff;
				text-align:center;
				padding:5px;
				border-right:solid 2px #FFF;
				}
		</style>
	</head>
	<body onselectstart="return false">
		<div class="war">
			<table width="80%" cellspacing="0" cellpadding="0"  cellspacing="0">
				<tr bgcolor="#000000">
					<td background="img/1.jpg">
						
					</td>
				</tr>
				<tr class="title">
					<td></td>
					<td>图片</td>
					<td>书籍名称</td>
					<td>单价</td>
					<td>数量</td>
					<td>优惠</td>
					<td>小计</td>
					<td>操作</td>
				</tr>
				<tr>
					<td colspan="8" class="line"></td>
				</tr>
				<tbody id="shopcar" >
					<tr bgcolor="#FFFFCC" align="center">
						<td class="cart_td_1" width="15%" height="80px">
							<div><img src="image/1.jpg" height="75"/></div>
						</td>
						<td class="cart_td_1">Java详解</td>
						<td class="cart_td_1" style="color: #FC6F13;">39.9元</td>
						<td class="cart_td_1">2</td>
						<td class="cart_td_1">有货</td>
						<td class="cart_td_1">9折</td>
						<td class="cart_td_1" style="color: #FC6F13;">79.8元</td>
						<td class="cart_td_1"><a href="#">删除</a></td>
					</tr>
					<tr bgcolor="#E2F2FF" align="center">
						<td class="cart_td_1" width="15%" height="80px">
							<div><img src="image/1.jpg" height="75"/></div>
						</td>
						<td class="cart_td_1">Java详解</td>
						<td class="cart_td_1" style="color: #FC6F13;">39.9元</td>
						<td class="cart_td_1">2</td>
						<td class="cart_td_1">有货</td>
						<td class="cart_td_1">9折</td>
						<td class="cart_td_1" style="color: #FC6F13;">79.8元</td>
						<td class="cart_td_1"><a href="#">删除</a></td>
					</tr>
					<tr bgcolor="#FFFFCC" align="center">
						<td class="cart_td_1" width="15%" height="80px">
							<div><img src="image/1.jpg" height="75"/></div>
						</td>
						<td class="cart_td_1">Java详解</td>
						<td class="cart_td_1" style="color: #FC6F13;">39.9元</td>
						<td class="cart_td_1">2</td>
						<td class="cart_td_1">有货</td>
						<td class="cart_td_1">9折</td>
						<td class="cart_td_1" style="color: #FC6F13;">79.8元</td>
						<td class="cart_td_1"><a href="#">删除</a></td>
					</tr>
					<tr bgcolor="#E2F2FF" align="center">
						<td class="cart_td_1" width="15%" height="80px">
							<div><img src="image/1.jpg" height="75"/></div>
						</td>
						<td class="cart_td_1">Java详解</td>
						<td class="cart_td_1" style="color: #FC6F13;">39.9元</td>
						<td class="cart_td_1">2</td>
						<td class="cart_td_1">有货</td>
						<td class="cart_td_1">9折</td>
						<td class="cart_td_1" style="color: #FC6F13;">79.8元</td>
						<td class="cart_td_1"><a href="#">删除</a></td>
					</tr>
				</tbody>
				 <tfoot>
					<tr height="50px">
					   <td>共计:</td>
					   <td colspan="5" id="sum"></td>
					   <!-- <td colspan="2" align="center"><button id="settlement">结算</button></td> -->
					   <td colspan="2" align="center">
						   <button id="clear">清空购物车</button>
						</td>
					</tr>
				</tfoot>
			</table>
		</div>
	</body>
</html> 