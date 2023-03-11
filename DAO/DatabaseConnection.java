package java.com.startcollabo.rtc_gis_data_system.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ALABI
 */
public class DatabaseConnection {
    
private static final java.lang.String JDBC_DRIVER = "com.mysql.jdbc.Driver";
private static final java.lang.String USER_NAME = "root";
private static final java.lang.String PASSWORD = "";
private static Connection con;
    
/**
 * creates a database in mySQL server
 * @param dbName name of database
 * @return the Connection object
 */
    public static Connection createAndConnect(String dbName){
        
    String dbAddress = "jdbc:mysql://localhost:3306/" + dbName + "?createDatabaseIfNotExist=true";
        
    try {
        Class.forName(JDBC_DRIVER);
        con = DriverManager.getConnection(dbAddress, USER_NAME, PASSWORD);
    }catch (SQLException e) {        
        System.out.println(e.getMessage());
    }catch(ClassNotFoundException e){
        System.out.println(e.getMessage());
    } 
   return con;
}
/**
 * creates a db table in the database created with the createAndConnect("user") method
 * @param tableName name of table you want to create
 */
    public static void createTable(String tableName){
   // Open a connection
      try(Connection conn = createAndConnect("user");
         Statement stmt = conn.createStatement();
      ) {		      
          String sql = "CREATE TABLE IF NOT EXISTS " + tableName +
                   " (full_name INTEGER not NULL, " +
                   " pin VARCHAR(255), " + 
                   " email VARCHAR(255), "  + 
                   " PRIMARY KEY ( email ))"; 

         stmt.executeUpdate(sql);
         System.out.println("Created table in given database...");   	  
      } catch (SQLException e) {
          System.out.println(e.getMessage());
      } 
   }
    
    public static void closeConnection(){
    try{
    if(con.isValid(0)){
    con.close();
    }
    }catch(SQLException e){
        System.out.println(e.getMessage());
    }
    }
}
