package com.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//load the driver 
		Class.forName("com.mysql.cj.jdbc.Driver");	
		
		//get the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","pass3421");
		
		//send the object
		Statement stmt = con.createStatement();
		
		//get the result
		ResultSet res = stmt.executeQuery("select * from user");
		
		while(res.next()) {
			System.out.println(res.getString("item")+" "+ res.getInt("quantity"));
		}
		
		con.close();
	}

}
