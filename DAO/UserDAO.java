package java.com.startcollabo.rtc_gis_data_system.DAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.com.startcollabo.rtc_gis_data_system.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ALABI
 */
public class UserDAO {
/**
 * creates a new user in the database
 * @param user object of class user 
 */
    public static void createUser(User user){
        CreateDBTable.createTable("user");
        
     Connection con = DatabaseConnection.createAndConnect("user");
          
        String createUser = "insert into user values( ?, ?, ?, ?)";
                
        try {            
            PreparedStatement statement = con.prepareStatement(createUser);
            
            statement.setString(1, user.getFullNme());            
            statement.setString(2, user.getPin());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getPassWord());
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        DatabaseConnection.closeConnection();
        }
    }
    
    public static List readUser(){
    
List <User> userList = new ArrayList<>();        
    String readSQL = "select * from user";
    Connection conn = null;
    Statement stmt = null;
    try{
    conn = DatabaseConnection.createAndConnect("user");
    stmt = conn.createStatement();
    
    ResultSet rs = stmt.executeQuery(readSQL);
        while(rs.next()){
        String fullName = rs.getString(1);
        String pin = rs.getString(2);
        String email = rs.getString(3);
        String password = rs.getString(4);
    User user = new User(fullName, pin, email, password);    
    userList.add(user);
        }
    }catch(SQLException e){
        System.out.println(e.getMessage());
    }    
    return userList;
    }
    
    public static void updateUser(User user){
    
    String updateSQL = "update user set full_name = ?, pin = ?, email = ?, password = ? where password = ?";    
    Connection con = DatabaseConnection.createAndConnect("user");    
    
    PreparedStatement pstmt;
        try {
            pstmt = con.prepareStatement(updateSQL);
            
            pstmt.setString(1, user.getFullNme());
            pstmt.setString(2, user.getPin());
            pstmt.setString(3, user.getEmail());
            pstmt.setString(4, user.getPassWord());
            pstmt.setString(5, user.getPassWord());
            
        pstmt.executeUpdate();            
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void deleteUser(User user){
    
    String deleteSQL = "delete from user where password = ?";
    Connection con = DatabaseConnection.createAndConnect("user");    
    PreparedStatement pstmt;
        try{
        pstmt = con.prepareStatement(deleteSQL);
        pstmt.setString(1, user.getPassWord());
        pstmt.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
