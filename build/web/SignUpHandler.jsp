<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "storage.DBData" %>
<jsp:useBean id="obj" class = "bean.SignUpBean"/>
<jsp:setProperty property="*" name="obj"/>
<script type="text/javascript" src = "./js/WelcomeMessage.js">

</script>

<%
	int i = DBData.newBidder(obj);
	if(i==1)
	{%>
		<body>
			<input type ="hidden" id = "id1" value = "<%= obj.getName() %>"/>
		</body>
	<%}
	else
	{
		
	}

%>