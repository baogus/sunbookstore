<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head runat="server">
<meta charset="UTF-8">
<title>用户列表</title>
 <script type="text/javascript" src="../jquery/jquery-3.2.1.js"></script>
    <style type="text/css">
     .input{
      	width:25px;
      	height: 25px
      }
       
      .search{
      	width:250px;
      	height: 30px;
      	background-color:#33FFFF;
      	border-radius:12px;/* 变成圆角 */
      
      } 	
        	
        	a{
   	text-decoration:none;
   	
   	}
        img {
	height:20px;
	width: 20px;
}
        .t1
        {
            clear: both;
            border: 1px solid #c9dae4;
        }
        .t1 tr th
        {
            color: #0d487b;
         
            line-height: 28px;
            border-bottom: 1px solid #9cb6cf;
            border-top: 1px solid #e9edf3;
            font-weight: normal;
            text-shadow: #e6ecf3 1px 1px 0px;
            padding-left: 5px;
            padding-right: 5px;
        }
        .t1 tr td
        {
            border-bottom: 1px solid #e9e9e9;
            padding-bottom: 5px;
            padding-top: 5px;
            color: #444;
            border-top: 1px solid #FFFFFF;
            padding-left: 5px;
            padding-right: 5px;
            word-break: break-all;
        }
        /* white-space:nowrap; text-overflow:ellipsis; */
        tr.alt td
        {
            background: #77FFEE; /*这行将给所有的tr加上背景色*/
        }
        tr.over td
        {
            background: #6495ED; /*这个将是鼠标高亮行的背景色*/
        }
    </style>
    <script type="text/javascript">
        $(document).ready(function () { //这个就是传说的ready  
            $(".t1 tr").mouseover(function () {
                //如果鼠标移到class为stripe的表格的tr上时，执行函数  
                $(this).addClass("over");
            }).mouseout(function () {
                //给这行添加class值为over，并且当鼠标一出该行时执行函数  
                $(this).removeClass("over");
            }) //移除该行的class  
            $(".t1 tr:even").addClass("alt");
            //给class为stripe的表格的偶数行添加class值为alt
        });
    </script>
</head>
<body>
<div>
<form action="" style="background-color: #33FFAA; width: 300px;">
	<input class="search" type="text" placeholder="请输入查询内容">
	<input class="input" type="image" src="../img/search.png">

</form>

</div>
<br>
<br>
<br>
<br>







    <form id="form1" runat="server">
   
    <table width="100%" id="ListArea" border="0" class="t1" align="center" cellpadding="0"
        cellspacing="0">
        <tr align="center">
            <th>
              <img src="../img/per.png">  姓名
            </th>
            <th>
              <img src="../img/sex.png">  性别
            </th>
            <th>
               <img src="../img/tel.png"> 电话
            </th>
            <th>
             <img src="../img/address.png">   地址
            </th>
            <th>
             <img src="../img/caozuo.png">     操作
            </th>
        </tr>
        <tr align="center">
            <td>
                张三
            </td>
            <td>
                女
            </td>
            <td>
                14498723540
            </td>
            <td>
                宁夏回族自治区银川市西夏区北方民族大学
            </td>
            <td>
                <a href="">删除用户</a>
            </td>
        </tr>
        <tr align="center">
            <td>
                1234
            </td>
            <td>
                aaaa
            </td>
            <td>
                aaaaa
            </td>
            <td>
                aaaaa
            </td>
            <td>
                aaaaa
            </td>
        </tr>
        <tr align="center">
            <td>
                1234
            </td>
            <td>
                aaaa
            </td>
            <td>
                aaaaa
            </td>
            <td>
                aaaaa
            </td>
            <td>
                aaaaa
            </td>
        </tr>
        <tr align="center">
            <td>
                1234
            </td>
            <td>
                aaaa
            </td>
            <td>
                aaaaa
            </td>
            <td>
                aaaaa
            </td>
            <td>
                aaaaa
            </td>
        </tr>
        <tr align="center">
            <td>
                1234
            </td>
            <td>
                aaaa
            </td>
            <td>
                aaaaa
            </td>
            <td>
                aaaaa
            </td>
            <td>
                aaaaa
            </td>
        </tr>
        <tr align="center">
            <td>
                1234
            </td>
            <td>
                aaaa
            </td>
            <td>
                aaaaa
            </td>
            <td>
                aaaaa
            </td>
            <td>
                aaaaa
            </td>
        </tr>
    </table>
    </form>
</body>
</html>