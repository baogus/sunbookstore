<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="req" value="${pageContext.request }"/>
<c:set var="base" value="${req.scheme}://${req.serverName}:${req.serverPort}${req.contextPath }/"/>
<!DOCTYPE html>
<html>
<head>
 <base href="${base }">
		<title>分类导航菜单</title>
		<style type="text/css">
			*{
				background: antiquewhite;
				color: #02B1CB;x
			}
			p{
				color: darkred;
				font-size: 20px;
				font-weight: 10px;
			}
			a{
				text-decoration:none
			} 
			a:hover{
				text-decoration:none;
				color:orange;
				font-size:18px;
				
			}
			hr{
				background-color:#42A8C0;
				height:2px;
				width:100%;
			}
		</style>
	</head>
	<body onselectstart="return false">  
		 <p>分类</p>
		 <hr/>
　　　　<table> 
			<tr>
				<td><a href="#" target="bottom">期刊</a></td>
			</tr>
			
			<tr>
				<td><a href="#" target="bottom">音乐</a></td>
			</tr>
			<tr>
				<td><a href="#" target="bottom">哲学类</a></td>
			</tr>
			<tr>
				<td><a href="#" target="bottom">经典著作</a></td>
			</tr>
			<tr>
				<td><a href="#" target="bottom">社会科学</a></td>
			</tr>
			<tr>
				<td><a href="#" target="bottom">政治法律</a></td>
			</tr>
			<tr>
				<td><a href="#" target="bottom">军事科学</a></td>
			</tr>
			<tr>
				<td><a href="#" target="bottom">财经管理</a></td>
			</tr>
			<tr>
				<td><a href="#" target="bottom">历史地理</a></td>
			</tr>
			<tr>
				<td><a href="#" target="bottom">语言文字</a></td>
			</tr>
			<tr>
				<td><a href="#" target="bottom">中国文学</a></td>
			</tr>
			<tr>
				<td><a href="#" target="bottom">外国文学</a></td>
			</tr>
			<tr>
				<td><a href="#" target="bottom">美术雕塑</a></td>
			</tr>
			<tr>
				<td><a href="#" target="bottom">摄影影视</a></td>
			</tr>
			<tr>
				<td><a href="#" target="bottom">舞蹈戏剧</a></td>
			</tr>
			<tr>
				<td><a href="#" target="bottom">书法篆刻</a></td>
			</tr>
			<tr>
				<td> <a href="#" target="bottom">医药卫生</a></td>
			</tr>
			<tr>
				<td><a href="#" target="bottom">计算机技术</a></td>
			</tr>
			<tr>
				<td><a href="#" target="bottom">农业科学</a></td>
			</tr>
			<tr>
				<td><a href="#" target="bottom">建筑工程</a></td>
			</tr>
			<tr>
				<td><a href="#" target="bottom">工业技术</a></td>
			</tr>
			<tr>
				<td><a href="#" target="bottom">生活休闲</a></td>
			</tr>
			<tr>
				<td><a href="#" target="bottom">少儿读物</a></td>
			</tr>
			<tr>
				<td><a href="#" target="bottom">港版图书</a></td>
			</tr>
			<tr>
				<td><a href="#" target="bottom">戏曲小品</a></td>
			</tr>
		</table>    　
	</body>
</html>