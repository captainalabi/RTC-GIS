package java.com.startcollabo.rtc_gis_data_system;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALABI
 */
public class User {
        
    private String email;
    private String fullNme;
    private String pin;
    private String passWord;

    public User() {
    }
   
    public User(String email, String fullNme, String pin, String passWord) {
        this.email = email;
        this.fullNme = fullNme;
        this.pin = pin;
        this.passWord = passWord;
    }
    
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the fullNme
     */
    public String getFullNme() {
        return fullNme;
    }

    /**
     * @param fullNme the fullNme to set
     */
    public void setFullNme(String fullNme) {
        this.fullNme = fullNme;
    }

    /**
     * @return the pin
     */
    public String getPin() {
        return pin;
    }

    /**
     * @param pin the pin to set
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * @return the passWord
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * @param passWord the passWord to set
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    
    
}
