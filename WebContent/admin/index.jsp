<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="req" value="${pageContext.request }"/>
<c:set var="base" value="${req.scheme}://${req.serverName}:${req.serverPort}${req.contextPath }/"/>
<!DOCTYPE html>
<html>
<head>
 <base href="${base }">
<meta charset="UTF-8">
<script type="text/javascript">
	window.onload=function(){
		function name(){
			if(window !=top){

			       top.location.href=location.href;

			     }

		}
		name();
	}
</script>
<title>网上书店系统管理平台</title>
<link rel="stylesheet" href="<c:url value='${base }admin/css/index.css'/>">
  <body>
<table class="table" align="center" border="0">
	<tr >
	
		<td colspan="2" align="center" style="width: 100%; height:15%;">
			<iframe frameborder="0" src="<c:url value='${base }admin/top.jsp'/>" name="top" scrolling="no"><p></iframe>
		</td>
	</tr>
	<tr>
		<td  style="padding:5px; width: 13%; height:85%; background-color:#FFEFD5 ;" align="center" valign="top" class="left">
			<iframe frameborder="0" width="120" src="<c:url value='${base }admin/left.jsp'/>" name="left"></iframe>
		</td>
		<td style="width: 87%; height:85%; background-color:	#FFF5EE 	;"> 
			<iframe frameborder="0" src="<c:url value='${base }admin/body.jsp'/>" name="body"></iframe>
		</td>
	</tr>
</table>
		
	
</body>
</html>