package storage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import configure.DBConnect;

public class LiveData {

	public static ArrayList<String> getAuctionProduct()
	{
		ArrayList<String> b = new ArrayList<String>();
		try
		{
			Connection con = DBConnect.takeConnection();
			String query = "SELECT new_auction.`*`, bidder.name FROM new_auction,bidder WHERE new_auction.schedule_date=? AND bidder.b_id=new_auction.b_id;";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,LiveData.getCurrentDate());
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				b.add(rs.getString(1));
				b.add(rs.getString(2));
				b.add(rs.getString(3));
				b.add(rs.getString(4));
				b.add(rs.getString(5));
				b.add(rs.getString(6));
				b.add(rs.getString(7));
				b.add(rs.getString(8));
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return b;
	}
	
	public static int getAuctionId()
	{
		int i=0;
		try
		{
			Connection con = DBConnect.takeConnection();
			String query = "SELECT current_auction.auction_id from current_auction,new_auction where new_auction.schedule_date=? and new_auction.product_id = current_auction.product_id";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,LiveData.getCurrentDate());
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				i= rs.getInt(1);
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return i;
	}
	
	public static String getAuctionAmount(int auction_id)
	{
		String i ="";
		try
		{
			Connection con = DBConnect.takeConnection();
			String query = "select current_price from current_auction where auction_id=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1,auction_id);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				i= rs.getString(1);
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace(); 
		}
		return i;
	}
	
	public static String getCurrentDate()
	{
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(d);
	}
}
