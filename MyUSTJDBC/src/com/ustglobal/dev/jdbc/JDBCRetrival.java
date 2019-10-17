package com.ustglobal.dev.jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class JDBCRetrival {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement ps=null;
		try {
			//1.load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded--");

			//2.to get connection
			String dbUrl = "jdbc:mysql://localhost:3306/ust_ty_db";
			String filepath = "C:\\Users\\palak shivalkar\\Desktop\\dbjdbc.properties";
			

			FileReader reader = new FileReader(filepath);

			Properties prop = new Properties();
			prop.load(reader);
			

			conn = DriverManager.getConnection(dbUrl, prop);
			System.out.println("Connection Establish...");
			System.out.println("*************");

			//3. to issue the query
			String query = "SELECT * FROM users_info WHERE userid=?";
			
			ps = conn.prepareStatement(query);
			

			System.out.println("Enter the id for retrival--");
			   ps.setInt(1, Integer.parseInt(sc.nextLine()));
			
			
			rs = ps.executeQuery(); 
			
			while(rs.next()) {
				int userid = rs.getInt("userid"); //either we can give column name or column index
				String username = rs.getString("username");
				String email1 = rs.getString("email");
				String password1 = rs.getString("password");
				
				System.out.println("User id--"+userid);
				System.out.println("User Name--"+username);
				System.out.println("User Email--"+email1);
				System.out.println("User password--"+password1);
				System.out.println("***********************");
			}

			


		} catch (Exception e) {

			e.printStackTrace();
		}


	}

}
