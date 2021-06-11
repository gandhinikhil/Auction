<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.Date,java.util.ArrayList,storage.LiveData" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Date d = new Date(); 
	ArrayList<String> a = LiveData.getAuctionProduct();
	if(a.size()!=0)
	{
%>
<table class="table">
	<tr><td>Product NO: </td><td><%=a.get(0) %></td></tr>
	<tr><td>Product Image:</td><td><img src="<%=a.get(1) %>" width="100%" height="300"/></td></tr>
	<tr><td>Category:</td><td><%=a.get(2) %></td></tr>
	<tr><td>Description</td><td><%=a.get(3) %></td></tr>
	<tr><td>Initial Amount:</td><td><%=a.get(4) %></td></tr>
	<tr><td>Post by:</td><td><%=a.get(7) %></td></tr>
	
</table>
<%}
	else
	{
		out.println("No Auction Today!");
	}%>
</body>
</html>