package com.ustglobal.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;         //except for driver everything will should be imported from java.sql....

public class MyFirstJDBC {

	public static void main(String[] args) {
		
		Connection conn = null;                //to get connection we use this method
		Statement stmt = null;
		ResultSet rs = null;                 //resultset is equivalent to result table in sql
		
	try {
		//1. Load the driver
		java.sql.Driver div = new Driver();
		DriverManager.registerDriver(div);   //to register the driver
		System.out.println("Driver loaded.....");
		
		//2.get connection via driver
		String dbUrl = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		
		//to get connection
		conn = DriverManager.getConnection(dbUrl);
		System.out.println("Connection Established.....");
		System.out.println("*******************");
		
		//3.Issue SQL query via connection-- in order to issue a query we need to have a query
		String query = "select * from users_info";
		//to make this string as query-- we will make this string into statement & to make string into statement we have method create-statement inside the connection interface 
		stmt = conn.createStatement();
		//to execute the query we have method execute-query
		rs = stmt.executeQuery(query);  //give the query variable as the argument
		
		//4.process the results returned by SQL query
		while(rs.next()) {   //to process the result we need to invoke method called as next() it get inside the result set it check for rows if it is present it will be true and  it will print it
			int userid = rs.getInt("userid"); //either we can give column name or column index
			String username = rs.getString("username");
			String email = rs.getString("email");
			String password = rs.getString("password");
			
			System.out.println("User id--"+userid);
			System.out.println("User Name--"+username);
			System.out.println("User Email--"+email);
			System.out.println("User password--"+password);
			System.out.println("***********************");
			
			
			
		}
		
		
		
	} catch (SQLException e) {
		
		e.printStackTrace();
		} 
	finally { //5.to close all the objects created-- we have a method called asclose 
		if(conn!=null)
		{ try { 
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		} 
		if(stmt!=null) {
			try { 
				stmt.close(); 
			} catch(SQLException e) { 
				e.printStackTrace(); 
			} }
		if(rs!=null) { 
			try { 
				rs.close();
			} catch (SQLException e) { 
				e.printStackTrace(); 
			} } }
			 
		
	}

}
