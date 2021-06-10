package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import storage.ProductData;

public final class BidderAuctionDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 String id = request.getParameter("id");
      out.write("\n");
      out.write("<table class =\"table\">\n");
      out.write("    <tr>\n");
      out.write("        <th>Product ID </th><th>Category</th><th>Initial Amount</th><th>Schedule Date</th>\n");
      out.write("    </tr>\n");
      out.write("    ");

    ArrayList<ArrayList<String>>a=ProductData.getAll(Integer.parseInt(id));
    for(ArrayList<String> b: a){
    out.println("<tr>");
    out.println("<td>"+b.get(0)+"</td>");
    out.println("<td>"+b.get(2)+"</td>");
    out.println("<td>"+b.get(4)+"</td>");
    out.println("<td>"+b.get(5)+"</td>");
    out.println("<td><button class ='btn btn-success btn-xs' data-toggle='modaL' data-target='#"+b.get(0)+"'>Show More</button></td>");
    out.println("</tr>");
    }
    
      out.write("\n");
      out.write("  </table>  \n");
      out.write("  <fieldset>\n");
      out.write("\n");
      out.write("    ");

    for(ArrayList<String>b:a){
      
      out.write("\n");
      out.write("      <div id=\"");
      out.print( b.get(0) );
      out.write("\" class =\"modaL\" roles =\"dailog\">\n");
      out.write("          <div class=\"modal-content\">\n");
      out.write("              <div class=\"modal-header\">\n");
      out.write("                  <h4 class =\"modal-title\">Product Details</h4>\n");
      out.write("              </div>\n");
      out.write("              <div class =\"modal-body\"></div>\n");
      out.write("              <form action=\"\" method=\"\">\n");
      out.write("                 Category <input type =\"text\" value=\"");
      out.print(b.get(0) );
      out.write("\" class=\"form-control\"/>\n");
      out.write("                 Product Image : <img src =\"");
      out.print( b.get(1) );
      out.write("\" class=\"img-rounded\" width=\"100%\" height=\"20%\"/> \n");
      out.write("                 Category: <input type =\"text\" value=\"");
      out.print(b.get(3) );
      out.write("\" class=\"form-control\"/>\n");
      out.write("                 Description: <input type =\"text\" value=\"");
      out.print(b.get(4) );
      out.write("\" class=\"form-control\"/>\n");
      out.write("                 Initial Amount: <input type =\"text\" value=\"");
      out.print(b.get(5) );
      out.write("\" class=\"form-control\"/>\n");
      out.write("                 Auction Date: <input type =\"text\" value=\"");
      out.print(b.get(6) );
      out.write("\" class=\"form-control\"/>\n");
      out.write("                 <input type=\"submit\" value=\"Edit\" class=\"btn btn-success btn-block\" />\n");
      out.write("              </form>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("        }\n");
      out.write("    %>");
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
