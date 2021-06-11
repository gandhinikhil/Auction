<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList,storage.ProductData" %>
    <% String id = request.getParameter("id"); %>
    <fieldset>
    <legend>Bidder Auction Details</legend>
<table class="table">
<tr>
	<th>Product Id</th><th>Category</th><th>Initial Amount</th><th>Schedule Date</th>
</tr>
<%
	ArrayList<ArrayList<String>> a = ProductData.getAllRecords(Integer.parseInt(id));
	for(ArrayList<String> b: a)
	{
		out.println("<tr>");
		out.println("<td>"+b.get(0)+"</td>");
		//out.println("<td>"+b.get(1)+"</td>");
		out.println("<td>"+b.get(2)+"</td>");
		out.println("<td>"+b.get(4)+"</td>");
		out.println("<td>"+b.get(5)+"</td>");
		out.println("<td><button class='btn btn-success btn-xs' data-toggle='modal' data-target='#"+b.get(0)+"'>Show More</button></td>");
		out.println("</tr>");
	}
%>
</table>
</fieldset>
<%
	for(ArrayList<String> b: a)
	{%>
	<div id="<%= b.get(0) %>" class="modal fade" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">Product Details</h4>
				</div>
			<div class="modal-body">
				<form action="" method="">
					Category: <input type="text" value="<%=b.get(0) %>" class="form-control"/>
					Product Image: <img src="<%=b.get(1) %>" width="100%" height="30%"/>
					Category: <input type="text" value="<%=b.get(2) %>" class="form-control"/>
					Description: <input type="text" value="<%=b.get(3) %>" class="form-control"/>
					Initial Amount: <input type="text" value="<%=b.get(4) %>" class="form-control"/>
					Auction Date<input type="text" value="<%=b.get(5) %>" class="form-control"/>
					<input type="submit" value="Edit" class="btn btn-success btn-block"/>
				</form>
 			</div>
			</div>
		</div>
	
	</div>
	
		
<%}
%>