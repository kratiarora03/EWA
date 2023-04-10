package org.ncu.mysql;

import java.sql.*;
 class class_1_jdbc {
	 public static void main(String[] args) {
		try {
			//load the driver 
			Class.forName("com.mysql.jdbc.Driver");
			
			//creating a connection 
			String url = "jdbc:mysql://localhost:3306/";
			String username = "root";
			String password = "Abktanvi03";
			Connection con = DriverManager.getConnection(url,username,password);
			
			if(con.isClosed()) {
				System.out.println("connection is closed");
			}else {
				System.out.println("connection is created ");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	 }
	

}
