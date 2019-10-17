package com.ustglobal.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCUpgradaion {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
	
		try {
			//1.load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded....");
			
			//2. get the connection
			String dbUrl = "jdbc:mysql://localhost:3306/ust_ty_db";
			System.out.println("Enter the username and password..");
			String user = sc.nextLine();
			String password = sc.nextLine();
			conn = DriverManager.getConnection(dbUrl, user, password);
			System.out.println("Connection Established.....");
			System.out.println("********************************");
			
			//3. issue the query
			String query = "UPDATE users_info SET email = ? WHERE userid=? AND password=?";
			
			pstmt = conn.prepareStatement(query);
			
			System.out.println("Enter the new email id--");
			pstmt.setString(1, sc.nextLine());
		    System.out.println("Enter the user id--");
		    pstmt.setInt(2, Integer.parseInt(sc.nextLine()));
		    System.out.println("Enter the password--");
		    pstmt.setString(3, sc.nextLine());
		    
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
