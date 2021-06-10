<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="storage.ProductData" %>
    <jsp:include page="BootstrapCDN.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<jsp:useBean id="obj" class="com.bean.ProductBean"/>
<jsp:setProperty property="*" name="obj"/>
<%
	ProductData.setProductDetails1(obj);
%>
</head>
<body>
<div class="container">
	<div class="row"></div>
	<div class="row">
		<div class="col-md-3">
		
		</div>
		<div class="col-md-6">
			<fieldset> 
			<legend>Upload Product Image</legend>
			<form action="UploadServlet" method="post" enctype="multipart/form-data">
				<input type="file" name="photo" class="form-control"/><br/>
				<input type="submit" value="Upload Image" class="btn btn-block btn-warning"/>
			</form>
			</fieldset>
		</div>
		<div class="col-md-3">
		
		</div>
	
	</div>

</div>
</body>
</html>