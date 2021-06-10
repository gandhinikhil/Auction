/**
 * 
 */
function welcomeMsg()
	{
		var val = document.getElementById("id1").value;
		if(window.confirm("SignUp Successfully "+val+"! Do you want to Login Click 'ok''"))
		{
			window.location.href = "index.jsp";
		}
	}