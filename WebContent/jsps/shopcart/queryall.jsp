<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
=======
<%@page import="sunbookstore.shopcart.domin.Shop"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	%>
>>>>>>> fxb
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>查看全部购物车</title>
<<<<<<< HEAD
<script type="text/javascript" src="jquery/jquery-3.2.1.js"></script>
<script type="text/javascript" src="jquery/queryshopping.js"></script>
<link rel="stylesheet" type="text/css" href="css/shopping.css" />
=======
<script type="text/javascript" src="<%=basePath%>jsps/shopcart/jquery/jquery-3.2.1.js"></script>
<script type="text/javascript" src="<%=basePath%>jsps/shopcart/jquery/queryshopping.js"></script>
<link rel="stylesheet" type="text/css" href="<%=basePath%>jsps/shopcart/css/shopping.css" />
>>>>>>> fxb

</head>
<body onselectstart="return false">
	<div class="war">
		<table width="80%" cellspacing="0" cellpadding="0"  cellspacing="0">
			<tr class="title">
				<td><input type="checkbox" id="checkAll"/>全选</td>
				<td>图片</td>
				<td>书籍名称</td>
				<td>单价</td>
				<td>数量</td>
				<td>优惠</td>
				<td>小计</td>
				<td>操作</td>
			</tr>
<<<<<<< HEAD
=======
			<%
				List<Shop> shops = (List<Shop>)request.getAttribute("shops");
				for(Shop shop:shops){
			%>
>>>>>>> fxb
			<tbody id="shopcar" >
				<tr  align="center">
					<td><input type="checkbox"/ >选择</td>
					<td class="cart_td_1" width="15%" height="80px">
<<<<<<< HEAD
						<div><img src="img/11.jpg" height="75"/></div>
					</td>
					<td class="cart_td_1">Java详解</td>
					<td class="cart_td_1" style="color: #FC6F13;">39.9元</td>
					<td class="cart_td_1">
						<input class="min" name="" type="button" value="-" />    
						<input class="text_box" name="" type="text" value="1" />    
						<input class="add" name="" type="button" value="+" />
					</td>
					<td class="cart_td_1">9折</td>
					<td class="cart_td_1" style="color: #FC6F13;">79.8元</td>
					<td class="cart_td_1"><a href="#">删除</a></td>
				</tr>
				<tr  align="center">
				<td><input type="checkbox"/ >选择</td>
					<td class="cart_td_1" width="15%" height="80px">
						<div><img src="img/11.jpg" height="75"/></div>
					</td>
					<td class="cart_td_1">Java详解</td>
					<td class="cart_td_1" style="color: #FC6F13;">39.9元</td>
					<td class="cart_td_1">
						<input class="min" name="" type="button" value="-" />    
						<input class="text_box" name="" type="text" value="1" />    
						<input class="add" name="" type="button" value="+" />
					</td>
					<td class="cart_td_1">9折</td>
					<td class="cart_td_1" style="color: #FC6F13;">79.8元</td>
					<td class="cart_td_1"><a href="#">删除</a></td>
				</tr>
				<tr  align="center">
					<td><input type="checkbox"/ >选择</td>
					<td class="cart_td_1" width="15%" height="80px">
						<div><img src="img/11.jpg" height="75"/></div>
					</td>
					<td class="cart_td_1">Java详解</td>
					<td class="cart_td_1" style="color: #FC6F13;">39.9元</td>
					
					<td class="cart_td_1">
						<input class="min" name="" type="button" value="-" />    
						<input class="text_box" name="" type="text" value="1" />    
						<input class="add" name="" type="button" value="+" />
					</td>
					<td class="cart_td_1">9折</td>
					<td class="cart_td_1" style="color: #FC6F13;">79.8元</td>
					<td class="cart_td_1"><a href="#">删除</a></td>
				</tr>
				<tr align="center">
					<td><input type="checkbox"/ >选择</td>
					<td class="cart_td_1" width="15%" height="80px">
						<div><img src="img/11.jpg" height="75"/></div>
					</td>
					<td class="cart_td_1">Java详解</td>
					<td class="cart_td_1" style="color: #FC6F13;">39.9元</td>
					<td class="cart_td_1">
						<input class="min" name="" type="button" value="-" />    
						<input class="text_box" name="" type="text" value="1" />    
						<input class="add" name="" type="button" value="+" />
					</td>
					<td class="cart_td_1">9折</td>
					<td class="cart_td_1" style="color: #FC6F13;">79.8元</td>
					<td class="cart_td_1"><a href="#">删除</a></td>
				</tr>
			</tbody>
=======
						<div><img src="<%=basePath%>jsps/shopcart/image/1.jpg" height="75"/></div>
					</td>
					<td class="cart_td_1"><%=shop.getBname() %></td>
					<td class="cart_td_1" style="color: #FC6F13;"><%=shop.getBprice() %></td>
					<td class="cart_td_1">
						<input class="min" name="" type="button" value="-" />    
						<input class="text_box" name="" type="text" value="<%=shop.getSbnum() %>"/>    
						<input class="add" name="" type="button" value="+" />
					</td>
					<td class="cart_td_1"><%=shop.getBdiscount() %></td>
					<td class="cart_td_1" style="color: #FC6F13;"><%=shop.getBprice()*shop.getSbnum()*shop.getBdiscount() %></td>
					<td class="cart_td_1"><a href="<%=basePath%>DeleteShopServlet?sid=<%=shop.getSid()+"&bid="+shop.getBid()%>">删除</a></td>
				</tr>
				
			</tbody>
			 <%
			 
				}
			 %>
			 
>>>>>>> fxb
			 <tfoot>
				<tr height="50px">
				   <td>共计:</td>
				   <td colspan="5" id="sum" style="color: #FC6F13;"></td>
				   <!-- <td colspan="2" align="center"><button id="settlement">结算</button></td> -->
				   <td colspan="2" align="center">
					   <button id="clear">清空购物车</button>
					</td>
				</tr>
<<<<<<< HEAD
				
=======
>>>>>>> fxb
			</tfoot>
		</table>
	</div>
</body>
</html> 