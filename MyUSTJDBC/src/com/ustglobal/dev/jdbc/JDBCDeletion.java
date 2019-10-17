package com.ustglobal.dev.jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class JDBCDeletion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		
	try {
		//1. load the driver
		Class.forName("com.mysql.jdbc.Driver");
	    System.out.println("Driver loaded--");
	    
	    //2.get the connection
	    String dbUrl = "jdbc:mysql://localhost:3306/ust_ty_db";
	    String filepath = "C:\\Users\\palak shivalkar\\Desktop\\dbjdbc.properties";
	    
	    FileReader reader = new FileReader(filepath);
	    
	    Properties prop = new Properties();
	    prop.load(reader);
	    
	    conn = DriverManager.getConnection(dbUrl, prop);
	    System.out.println("Connection Establish...");
	    System.out.println("*************");
	    
	    //3.issue the query
	    String query = "DELETE FROM users_info WHERE userid=? AND password=?";
	    
	    pstmt = conn.prepareStatement(query);
	    
	   System.out.println("Enter the userid for deletion--");
	   pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
	   System.out.println("Enter the password for deletion--");
	   pstmt.setString(2, sc.nextLine());
	   
	   int count = pstmt.executeUpdate();
	   
	   //4. process the query
	    if(count>0) {
	    	System.out.println("Query OK,"+count+" row affected");
	    }
	    else {
	    	System.out.println("Something went wrong...");
	    	
	    }
		
	    
		
	
	} catch (Exception e) {
	
		e.printStackTrace();
	}finally {
		  if(conn!=null) {
			  try {
				conn.close();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		  }
		  if(pstmt!=null)
		  {
			  try {
				pstmt.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		  }
	}

	}

}
