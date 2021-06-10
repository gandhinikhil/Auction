<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="BootstrapCDN.jsp"></jsp:include>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String b_id = request.getParameter("id"); %>

<div class="container">
	<div class="row"></div>
	<div class="row">
		<div class="col-md-3">
		
		</div>
		<div class="col-md-6">
			<fieldset> 
			<legend>New Product Auction</legend>
			<form action="Product_Detail1.jsp" method="post">
				<select name="category" class="form-control">
					<option Selected disabled>Select Category</option>
					<option value="Vehicle">Vehicle</option>
					<option value="Electronic">Electronic</option>
					<option value="Book">Book</option>
					<option value="House">House</option>
					<option value="Artifacts">Artifacts</option>
					<option value="Furniture">Furniture</option>
					<option value="Souveniers">Souveniers</option>
				</select><br/>
				<textarea name="description" class="form-control" placeholder="Enter Product Description"></textarea><br/>
				<input type="text" name="initial_price" class="form-control"  placeholder="Enter Initial Price"/><br/>
				<input type="date" name="schedule_date" class="form-control"  placeholder="Enter Auction Date"/><br/>
				<input type="hidden" name="b_id" value="<%=b_id%>"/><br/>
				<input type="submit" value="Save" class="btn btn-info btn-block"/><br/>
				
			</form>
			</fieldset>
		</div>
		<div class="col-md-3">
		
		</div>
	
	</div>

</div>
</body>
    </html>