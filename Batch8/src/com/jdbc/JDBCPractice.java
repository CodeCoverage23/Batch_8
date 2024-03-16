package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCPractice {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//load driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch","root","pass3421");
		
		//send the object
		Statement stmt = con.createStatement();
		
		//get the result
		ResultSet result = stmt.executeQuery("select * from student");
		
		while(result.next()) {
			System.out.println(result.getInt("idstudent")+" "+result.getString("studentname")+" "+result.getString("studentage")+" "+result.getString("studentskilllanguage"));
		}
		
		//close connection
		con.close();

	}

}
