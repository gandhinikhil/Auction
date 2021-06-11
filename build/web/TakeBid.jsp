<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="storage.LiveData" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
function show()
{
	var req = new XMLHttpRequest();
	var value = document.getElementById("a_id").value;
	var url = "getCurrentPrice.jsp?a_id="+value;
	try
	{
		req.onreadystatechange = function()
		{
			if(req.readyState == 4)
			{
				var res = req.responseText;
				document.getElementById("data").innerHTML=res;
			}
		}
	}
	catch(e)
	{
		document.getElementById("data").innerHTML=e;
	}
	req.open("GET",url,true);
	req.send();
}
</script>
</head>
<body onload="show()">
	Auction NO:<input  type="text" id="a_id" value="<%= LiveData.getAuctionId()%>" class="form-control" readonly/>
	<span id="data" ></span>
</body>
	
</html>