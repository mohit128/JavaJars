//package com.example.database;
import java.sql.*;

public final class DataConn{
	public static Connection getCon() throws SQLException{
		Connection c=null;
		String url="jdbc:mariadb://localhost:3306/operation";
		String uname="moh";
		String pass="1234567";
	
		try{
		Class.forName("org.mariadb.jdbc.Driver");
	         c=DriverManager.getConnection(url,uname,pass);	
		}
			catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

return c;
}
}

