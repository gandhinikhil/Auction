package storage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bean.ProductBean;

import configure.DBConnect;

public class ProductData {

	public static void setProductDetails1(ProductBean pb)
	{
		try
		{
			Connection con = DBConnect.takeConnection();
			String query = "insert into new_auction(category,description,initial_price,schedule_date,b_id) values(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,pb.getCategory());
			ps.setString(2,pb.getDescription());
			ps.setString(3, pb.getInitial_price());
			ps.setString(4, pb.getSchedule_date());
			ps.setInt(5,pb.getB_id());

			ps.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	
	public static void setImage(String path,int id)
	{
		try
		{
			Connection con = DBConnect.takeConnection();
			String query = "update new_auction set photo=? where product_id=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,path);
			ps.setInt(2,id);
			ps.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	
	public static int getImageId()
	{
		int id=0;
		try
		{
			Connection con = DBConnect.takeConnection();
			String query = "select * from new_auction";
			Statement ps = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = ps.executeQuery(query);
			if(rs.last())
			{
				id = rs.getInt("product_id");
				
			}
			updateLiveAuction(id);
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return id;
	}
	
	public static void updateLiveAuction(int p_id)
	{
	
		try
		{
			Connection con = DBConnect.takeConnection();
			String query = "Insert into current_auction(current_price,b_id,product_id) select initial_price,b_id,product_id from new_auction where product_id=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, p_id);
			ps.executeUpdate();
			
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	
	
	public static ArrayList<ArrayList<String>> getAllRecords(int bid)
	{
		ArrayList<ArrayList<String>> a = new ArrayList<ArrayList<String>>();
		try
		{
			Connection con = DBConnect.takeConnection();
			String query = "select * from new_auction where b_id=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1,bid);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				ArrayList<String> b = new ArrayList<String>();
				b.add(rs.getString(1));
				b.add(rs.getString(2));
				b.add(rs.getString(3));
				b.add(rs.getString(4));
				b.add(rs.getString(5));
				b.add(rs.getString(6));
				a.add(b);
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return a;
	}
}