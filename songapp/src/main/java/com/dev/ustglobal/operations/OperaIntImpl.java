package com.dev.ustglobal.operations;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class OperaIntImpl implements Operations {

	static Connection conn = null;

	public void searchSong() {
		// TODO Auto-generated method stub
		
	}

	public void showAllSong() {
		// TODO Auto-generated method stub
		
	}

	public void playAllSong() {
		// TODO Auto-generated method stub
		
	}

	public void playRandomSong() {
		// TODO Auto-generated method stub
		
	}

	public void playParticularSong() {
		// TODO Auto-generated method stub
		
	}

	public void addSong() {
		// TODO Auto-generated method stub
		
	}

	public void editSong() {
		// TODO Auto-generated method stub
		
	}

	public void deleteSong() {
		// TODO Auto-generated method stub
		
	}

	public Connection establishConnection() {
		if(conn != null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String dbUrl = "jdbc:mysql://localhost:3306/ust_ty_db";
				String filepath = "C:\\Users\\palak shivalkar\\Desktop\\dbjdbc.properties";

				FileReader reader = new FileReader(filepath);

				Properties prop = new Properties();
				prop.load(reader);

				conn = DriverManager.getConnection(dbUrl, prop);
				System.out.println("Connection Establish...");
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		return conn;
		
		
	}

}
