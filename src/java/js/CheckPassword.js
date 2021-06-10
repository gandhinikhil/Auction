/**
 * 
 */
function checkPassword(){
		pass1 = document.signupform.password.value;
		pass2 = document.signupform.password2.value;
		
		if(pass1==pass2){
			document.getElementById("msg").innerHTML = "Password Matched";
			document.getElementById("msg").style.color = "blue"; 
		}
		else{
			document.getElementById("msg").innerHTML = "Password NOT Matched";
			document.getElementById("msg").style.color = "red";
		}
	}