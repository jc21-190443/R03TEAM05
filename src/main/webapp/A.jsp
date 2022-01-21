<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Optional"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">--%>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/main.css">
<title>home</title>
</head>
<%
Optional<List<String[]>>optList = Optional.ofNullable((List<String[]>)request.getAttribute("list"));
List<String[]> list=new ArrayList<>();
if(optList.isPresent()){
	list = optList.get();
}
%>
<body>

<H1>冷蔵庫管理</H1>
<table class="table" align="center">

  <thead> 
    <th>no</th>
    <th>名前</th>
    <th>期限</th>
    <th>数</th>
  </thead>
  <tbody>
  
  <% for (String[] s : list){ %>
    <tr>
<td><%=s[0] %></td>
<td><%=s[1] %></td>
<td><%=s[2] %></td>
<td><%=s[3] %></td>

    </tr>
    <%} %>
    
    
  </tbody>
</table>
<table align="center">
			<tr>
<form method="get" action="./insertCall"> 
    <button type="submit" class="underbutton" id="returnbutton">登録ページ</button></form>
    <form method="get" action="./editPage"> 
    <button type="submit" class="underbutton" id="nextbutton">編集ページ</button></form>
     <%--<button onclick="location.href='/insertCall'">登録ページ</button>--%>
     </tr>
		</table>
</body>
<%--
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js" integrity="sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj" crossorigin="anonymous"></script>
--%>
</html>