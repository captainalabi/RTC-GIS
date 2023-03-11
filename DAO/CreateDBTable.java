package java.com.startcollabo.rtc_gis_data_system.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDBTable {
   static final String DB_URL = "jdbc:mysql://localhost:3306/user";
   static final String USER = "root";
   static final String PASS = "";

   /**
 * creates a db table in the given database url
 * @param tableName name of table you want to create
 */
   public static void createTable(String tableName){
   // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
          String sql = "CREATE TABLE IF NOT EXISTS " + tableName +
                   " (full_name VARCHAR (255)," +
                   " pin VARCHAR(255)," + 
                   " email VARCHAR(255),"  + 
                  " password VARCHAR (255)," +
                   " PRIMARY KEY ( email ))"; 

         stmt.executeUpdate(sql);
         System.out.println("Created table in given database...");   	  
      } catch (SQLException e) {
          System.out.println(e.getMessage());
      } 
   }
   
}