<%@page import="sunbookstore.shopcart.domin.PageBean"%>
<%@page import="sunbookstore.order.domin.Orders"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>订单列表</title>
<script type="text/javascript" src="/sunbookstore/jsps/shopcart/jquery/jquery-3.2.1.js"></script>
<link rel="stylesheet" type="text/css" href="<%=basePath%>jsps/order/css/order.css"/>
</head>
<body bgcolor="#AAC5EE">
<div id="head"><h1>我的订单</h1></div>


<table width="80%" align="center" id ="table" style="border:2px solid #E6E6E6">
	<tr bgcolor="#CCCCCC"  height="40px" >
		<th colspan = "2">书籍</th>
		<th>单价</th>
		<th>收货人</th>
		<th>数量</th>
		<th>小计</th>
		<th width="140px">操作</th>
	</tr>
	
	<%
	/* List<Orders> orders = (List<Orders>)request.getAttribute("orders");
	for( Orders order:orders){ */
		//int cid = (int)request.getAttribute("cid");
		PageBean<Orders> pageBean = (PageBean<Orders>)session.getAttribute("pageBean");
		List<Orders> pb1 = pageBean.getBeanList();
		for(Orders pb:pb1 ){
	%>
	
	<tr height="35px" class="nav">
		<td colspan="6" >
			订单编号：<%=(long)pb.getOid() %>　成交时间：<%=pb.getOtime() %>			
		</td>
		<td rowspan="2" align="center" class="list-item">
			<% 
				if(pb.getOstate().equals("待付款")){
			%>
			<a href="<%=basePath%>PayOrderServlet?oid=<%=(long)pb.getOid() %>">付款</a><br>
			<%
				}
			%>
			<a href="<%=basePath%>DeleteOrderServlet?cid=<%=pb.getCid()+"&oid="+pb.getOid() %>">删除</a><br/>
			<a href="<%=basePath%>PayOrderServlet?oid=<%=(long)pb.getOid() %>">订单详情</a><br>
		</td>
	</tr>
	<tr bgcolor="#FFFFCC" align="center">
		<td width="15%" height="80px">
			<div><img src="<%=basePath%>jsps/order/image/1.jpg" height="75"/></div>
		</td>
		<td><%=pb.getBname() %></td>
		<td><%=pb.getBprice() %></td>
		<td>
			<div><%=pb.getCname() %></div>
			<div><%=pb.getCaddress()%></div>
		</td>
		<td><%=pb.getOnum() %></td>
		<td><%=pb.getOsubtotal() %></td>
	</tr>
	<%
	
	}
	
	%>
	
</table>

<div align="center">
	第${pageBean.pc }页/共${pageBean.tp }页
						<a href="<%=basePath%>QueryOrderServlet?pc=1&cid=${cid }">首页</a>
						<%
							if(pageBean.getPc()>1){
						%>
						<a href="<%=basePath%>QueryOrderServlet?pc=${pageBean.pc-1 }&cid=${cid }">上一页</a>
						<%
							}
							if(pageBean.getPc()<pageBean.getTp()){
						%>
						<a href="<%=basePath%>QueryOrderServlet?pc=${pageBean.pc+1}&cid=${cid }">下一页</a>
						<%
							}
						%>
						<a href="<%=basePath%>QueryOrderServlet?pc=${pageBean.tp }&cid=${cid }">尾页</a>

</div>



</body>
</html>