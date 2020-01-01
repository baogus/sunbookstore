<%@page import="java.text.DecimalFormat"%>
<%@page import="sunbookstore.shopcart.domin.PageBean"%>
<%@page import="sunbookstore.shopcart.domin.Shop"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	%>
	<% DecimalFormat df=new DecimalFormat("0.00");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>查看全部购物车</title>
<script type="text/javascript" src="<%=basePath%>jsps/shopcart/jquery/jquery-3.2.1.js"></script>
<script type="text/javascript" src="<%=basePath%>jsps/shopcart/jquery/queryshopping.js"></script>
<link rel="stylesheet" type="text/css" href="<%=basePath%>jsps/shopcart/css/shopping.css" />

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
			<%
				int cid =(int)request.getAttribute("cid");
				PageBean<Shop> pageBean =(PageBean<Shop>)request.getAttribute("pageBean");
				List<Shop> pb1 = pageBean.getBeanList();
				for(Shop pb:pb1){
			%>
			<tbody id="shopcar" >
				<tr  align="center">
					<td><input type="checkbox" name = "check"/>选择</td>
					<td class="cart_td_1" width="15%" height="80px">
						<div><img src="<%=basePath%>jsps/shopcart/image/1.jpg" height="75"/></div>
					</td>
					<td class="cart_td_1"><%=pb.getBname() %></td>
					<td class="cart_td_1" style="color: #FC6F13;"><%=pb.getBprice() %></td>
					<td class="cart_td_1">
						<form action="UpdateShopServlet">
							<input type="text" name="cid" value="<%=cid %>" style="display:none" />
							<input type="text" name="bid" value="<%=pb.getBid() %>" style="display:none" />
							<input class="min" name="min" type="submit" value="-" />    
							<input class="text_box" name="sbnum" type="text" value="<%=pb.getSbnum() %>"/>    
							<input class="add" name="add" type="submit" value="+" />
						</form>
					</td>
					<td class="cart_td_1"><%=1.0*pb.getBdiscount()+"折" %></td>
					<td class="cart_td_1" id="xiaoji" style="color: #FC6F13;"><%=df.format(pb.getBprice()*pb.getSbnum()*pb.getBdiscount()*0.1) %></td>
					<td class="cart_td_1"><a href="<%=basePath%>DeleteShopServlet?sid=<%=pb.getSid()+"&bid="+pb.getBid()%>">删除</a></td>
				</tr>
				
			</tbody>
			 <%
			 
				}
			 %>
			 
			 <tfoot>
				<tr height="50px">
				   <td id="sum">共计:</td>
				   <td colspan="5" id="sum" style="color: #FC6F13;"></td>
				   <!-- <td colspan="2" align="center"><button id="settlement">结算</button></td> -->
				   <td colspan="2" align="center">
					   <a href="DeleteShopCartByIdServlet?cid=<%=cid %>">清空购物车</a>
					</td>
				</tr>
				
			</tfoot>
		</table>
		<div align="center">
				第${pageBean.pc }页/共${pageBean.tp }页
				<a href="<%=basePath%>QueryShopServlet?pc=1&cid=${cid }">首页</a>
				<%
					if(pageBean.getPc()>1){
				%>
				<a href="<%=basePath%>QueryShopServlet?pc=${pageBean.pc-1 }&cid=${cid }">上一页</a>
				<%
					}
					if(pageBean.getPc()<pageBean.getTp()){
				%>
				<a href="<%=basePath%>QueryShopServlet?pc=${pageBean.pc+1}&cid=${cid }">下一页</a>
				<%
					}
				%>
				<a href="<%=basePath%>QueryShopServlet?pc=${pageBean.tp }&cid=${cid }">尾页</a>
		</div>
	</div>
</body>
</html> 