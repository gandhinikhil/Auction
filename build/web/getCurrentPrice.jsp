<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.Date,java.util.ArrayList,storage.LiveData" %>
<%@ page import="storage.LiveData,java.sql.*,configure.DBConnect" %>

	<%
		String id = request.getParameter("a_id");
	
	//out.println(LiveData.getAuctionAmount(Integer.parseInt(name)));
	Connection con = null;  
	String  i="";
	try
	{
		con = DBConnect.takeConnection();
		String query = "select current_auction.current_price,bidder.b_id,bidder.name,bidder.occupation,bidder.location from bidder,current_auction where auction_id=? AND current_auction.b_id=bidder.b_id";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1,Integer.parseInt(id));
		ResultSet rs = ps.executeQuery();
		if(rs.next())
		{	out.println("<table class='table'>");
			
			out.println("<tr><th><h1>Last Bid:</h1></td><td><h1>"+rs.getString(1)+"</h1></td></tr>");
			out.println("<tr><th>Bidder No:</td><td>"+rs.getString(2)+"</td></tr>");
			out.println("<tr><th>Bidder Name:</td><td>"+rs.getString(3)+"</td></tr>");
			out.println("<tr><th>Bidder Occupation:</td><td>"+rs.getString(4)+"</td></tr>");
			out.println("<tr><th>Bidder Location:</td><td>"+rs.getString(5)+"</td></tr>");
			out.println("</table>");
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
        %>