/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java.com.startcollabo.rtc_gis_data_system.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ALABI
 */
public class DB_Connect {
    
    private static final String DB_DRIVER = 
		           "com.mysql.jdbc.Driver";
	private static final String DB_URL = 
		        "jdbc:mysql://localhost:3306/w3spoint";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "root";
 
	public static void main(String args[]){
		Connection conn = null;
		try{
			//Register the JDBC driver
			Class.forName(DB_DRIVER);
 
			//Open the connection
			conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
 
			if(conn != null){
			   System.out.println("Successfully connected.");
			}else{
			   System.out.println("Failed to connect.");
			}
		}catch(ClassNotFoundException | SQLException e){
                    System.out.println(e.getMessage());
		}
	}
}
