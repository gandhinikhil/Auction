/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configure;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	public static  Connection takeConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String path = "jdbc:mysql://localhost:3306/auction";
			con = DriverManager.getConnection(path,"root","admin");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
