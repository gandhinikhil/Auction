package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/BootstrapCDN.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type=\"text/javascript\" src = \"./js/CheckPassword.js\"></script>\r\n");

//Session check
	String email = (String)session.getAttribute("email");
	if(email != null){
		response.sendRedirect("home.jsp");
	}
	
	//status not working
	String status = request.getParameter("status");
	if(status != null)
	{
		if(status.equals("false")){
			out.println("Invalid Login Details");
		}
		else{
			out.println("Something went Wrong");
		}
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class = \"container\">\r\n");
      out.write("\t<div class =\"row\">\r\n");
      out.write("\t\t<img alt = \"banner\" src = \"./img/welcome.jpg\" class = \"img-rounded\" width =\"100%\" height = \"200\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br/>\r\n");
      out.write("\t \r\n");
      out.write("\t<div class = \"row\">\r\n");
      out.write("\t<div class= \"col-md-3\"></div>\r\n");
      out.write("\t<div class = \"col-md-6\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t<ul class = \"nav nav-tabs\">\r\n");
      out.write("\t\t\t<li class = \"active\"><a data-toggle =\"tab\" href =\"#Login\">Login</a></li>\r\n");
      out.write("\t\t\t<li><a data-toggle = \"tab\" href = \"#newbidder\">New Bidder</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class = \"tab-content\">\r\n");
      out.write("\t\t\t\t<div id = \"Login\" class = \"tab-pane fade in active\">\r\n");
      out.write("\t\t\t\t<h3>Login</h3>\r\n");
      out.write("\t\t\t\t<form action = \"LoginHandler.jsp\" method = \"post\">\r\n");
      out.write("\t\t\t\t\t<input type = \"email\" name = \"email\" class =\"form-control\" placeholder = \"Enter Email\" Required/><br/>\r\n");
      out.write("\t\t\t\t\t<input type = \"password\" name = \"password\" class =\"form-control\" placeholder = \"Enter Password\" Required/><br/>\r\n");
      out.write("\t\t\t\t\t<input type = \"submit\" value =\"Login\" class = \"btn btn-block btn-lg\"/>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div id = \"newbidder\" class = \"tab-pane fade\">\r\n");
      out.write("\t\t\t\t<h3>New Bidder</h3>\r\n");
      out.write("\t\t\t\t<form action = \"SignUpHandler.jsp\" method = \"post\" name =\"signupform\">\r\n");
      out.write("\t\t\t\t\t<input type =\"text\" name = \"name\" class =\"form-control\" placeholder = \"Enter Name\" Required/><br/>\r\n");
      out.write("\t\t\t\t\t<input type = \"email\" name = \"email\" class =\"form-control\" placeholder = \"Enter Email\" Required /><br/>\r\n");
      out.write("\t\t\t\t\t<input type =\"text\" name = \"occupation\" class =\"form-control\" placeholder = \"Enter Occupation\" Required /><br/>\r\n");
      out.write("\t\t\t\t\t<input type =\"text\" name = \"networth\" class =\"form-control\" placeholder = \"Enter Net-Worth\"  Required/><br/>\r\n");
      out.write("\t\t\t\t\t<select name = \"Location\" class =\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"\" disabled selected>Select Location</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Andhra Pradesh\">Andhra Pradesh</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Andaman and Nicobar Islands\">Andaman and Nicobar Islands</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Arunachal Pradesh\">Arunachal Pradesh</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Assam\">Assam</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Bihar\">Bihar</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Chandigarh\">Chandigarh</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Chhattisgarh\">Chhattisgarh</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Dadar and Nagar Haveli\">Dadar and Nagar Haveli</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Daman and Diu\">Daman and Diu</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Delhi\">Delhi</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Lakshadweep\">Lakshadweep</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Puducherry\">Puducherry</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Goa\">Goa</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Gujarat\">Gujarat</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Haryana\">Haryana</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Himachal Pradesh\">Himachal Pradesh</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Jammu and Kashmir\">Jammu and Kashmir</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Jharkhand\">Jharkhand</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Karnataka\">Karnataka</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Kerala\">Kerala</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Madhya Pradesh\">Madhya Pradesh</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Maharashtra\">Maharashtra</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Manipur\">Manipur</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Meghalaya\">Meghalaya</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Mizoram\">Mizoram</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Nagaland\">Nagaland</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Odisha\">Odisha</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Punjab\">Punjab</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Rajasthan\">Rajasthan</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Sikkim\">Sikkim</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Tamil Nadu\">Tamil Nadu</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Telangana\">Telangana</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Tripura\">Tripura</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Uttar Pradesh\">Uttar Pradesh</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Uttarakhand\">Uttarakhand</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"West Bengal\">West Bengal</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t\t\t<input type = \"text\" name = \"mobile\" class = \"form-control\" placeholder = \"Enter Mobile No\" Required/><br/>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type = \"password\" name  = \"password\" class = \"form-control\" placeholder = \"Enter password\" Required/><br/>\r\n");
      out.write("\t\t\t\t\t\t<input type = \"password\" onkeyup = \"checkPassword()\" name  = \"password2\" class = \"form-control\" placeholder = \"Re-Enter Password\" Required/><br/>\r\n");
      out.write("\t\t\t\t\t\t<span id = \"msg\"></span>\r\n");
      out.write("\t\t\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=  \"submit\" class = \"btn btn-lg btn-info\" value = \"SignUp\"/>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class= \"col-md-3\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class = \"row\">\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
