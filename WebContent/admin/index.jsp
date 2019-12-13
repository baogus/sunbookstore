<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>网上书店系统管理平台</title>
<!-- <link rel="stylesheet" href="css/index.css"> -->
<style type="text/css">
		*{
			font-size:10pt;
		}
		body{
			text-align:center;
		}
		.table{
			width:100%;
			height:560PX;
			border:1px solid gray;/*固定边框,1像素*/
		    border-collapse: collapse;/*单线的列表边框*/
		}
		.table td{
			border:1px solid gray;/*固定边框,1像素*/
		}
		iframe {
			width: 100%;
			height: 100%;
		}
		
	
	
	</style>

  
  <body>
<table class="table" align="center">
	<tr >
		<td colspan="2" align="center" style="width: 100%; height:15%;">
			<iframe frameborder="0" src="top.jsp" name="top" scrolling="no"></iframe>
		</td>
	</tr>
	<tr>
		<td  style="padding:5px; width: 13%; height:85%; background-color: #BBFFEE;" align="center" valign="top" class="left">
			<iframe frameborder="0" width="120" src="left.jsp" name="left"></iframe>
		</td>
		<td style="width: 87%; height:85%; background-color:#7FFFD4 ;"> 
			<iframe frameborder="0" src="body.jsp" name="body"></iframe>
		</td>
	</tr>
</table>
		
	
</body>
</html>