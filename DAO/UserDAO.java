package java.com.startcollabo.rtc_gis_data_system.DAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.com.startcollabo.rtc_gis_data_system.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    
    public void readUser(){}
    
    public void updateUser(){}
    
    public void deleteUser(){}
    
    public static void main(String[] args) {
        User user = new User("Alabi Bolakale", "12000555", "alabibolakale@start.com", "Alabi88&76");
        createUser(user);
        
    }
}
