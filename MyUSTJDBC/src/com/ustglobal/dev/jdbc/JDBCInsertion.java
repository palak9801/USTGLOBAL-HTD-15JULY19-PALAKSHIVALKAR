
package com.ustglobal.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCInsertion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PreparedStatement pstmt = null;
		Connection conn = null;
		try {
			//1. load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded....");
			
			//2. get connection via driver
			String dbUrl= "jdbc:mysql://localhost:3306/ust_ty_db";
			System.out.println("Enter the username and password--");
			String user = sc.nextLine();
			String password = sc.nextLine();
			conn = DriverManager.getConnection(dbUrl, user, password);
			System.out.println("Connection Established.....");
			System.out.println("********************************");
			
			//3.Issue the sql query
			String query = "INSERT INTO users_info VALUES(?,?,?,?)";  //as it is a dynamic query, we need to use prepare-statement()
			pstmt = conn.prepareStatement(query);
			
			System.out.println("Enter the user name--");
			pstmt.setString(1, sc.nextLine());
			System.out.println("Enter the user id--");
			pstmt.setInt(2, Integer.parseInt(sc.nextLine()));  //Integer is a class that has a method parse-Int which take string as i/p argument and return string
		   
		    System.out.println("Enter the user email--");
		    pstmt.setString(3, sc.nextLine());
		    System.out.println("Enter the user password--");
		    pstmt.setString(4, sc.nextLine());
		    
		    //for query other than select query we go for execute update() and the return type of this method is integer
		    int count = pstmt.executeUpdate();
		    
		    //4.Process the result
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
			
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			
		}

	}

}
