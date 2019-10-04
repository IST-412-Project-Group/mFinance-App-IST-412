/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author Evan
 */
public class Authentication {
    
    private String username;
    private String password;
    
    /**
     * Gets the username of the user
     * @return A string representing the username of the user
     */
    
    public String getUsername() {
        return username;
    }

    /**
     * Gets the password of the user
     * @return A string representing the password of the user
     */
    
    public String getPassword() {
        return password;
    }

    /**
     * Sets the username of the user
     * @param username Sets the username for the user
     */
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * Sets the password for the suer
     * @param password Sets the password of the user
     */
    
    public void setPassword(String password) {
        this.password = password;
    }
    
      /**
     * Gets the username (home, car, business, etc)
     * @return A boolean representing whether if correct info was entered
     * @param username Checks user's entered username
     * @param password Checks users entered password
     * @param correctLogin Checks if user's entered info is correct
     */
    
    public boolean logIn (String username, String password, boolean correctLogin){
        
        return correctLogin;
    }
    
    public void logOut(){
        
    }
    
}
