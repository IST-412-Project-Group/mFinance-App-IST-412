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
public class EditInfo {
    
    private long custId;   
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String socialSecNum;

   
    /**
     * Gets the customer ID of the user
     * @return An long representing the customer ID of the user
     */

    public long getCustId() {
        return custId;
    }

     /**
     * Gets the first name of the user
     * @return A string representing the first name of the user
     */
    
    public String getFirstName() {
        return firstName;
    }
    
     /**
     * Gets the last name of the user
     * @return A string representing the last name of the user
     */
    
    public String getLastName() {
        return lastName;
    }
    
     /**
     * Gets the email address of the user
     * @return A string representing email address of the user
     */
    
    public String getEmail() {
        return email;
    }
    
     /**
     * Gets the phone number of the user
     * @return A string representing the phone number of the user
     */
    public String getPhone() {
        return phone;
    }
    
     /**
     * Gets the address of the user
     * @return A string representing the address of the user
     */ 
    
    public String getAddress() {
        return address;
    }

     /**
     * Gets the social security number of the user
     * @return A string representing the social security number of the user
     */
    public String getSocialSecNum() {
        return socialSecNum;
    }
    
    /**
     * Sets the customer ID of the user
     * @param custId Sets the customer id of the user
     */
    
     public void setCustId(long custId) {
        this.custId = custId;
    }
    
     /**
     * Sets the first name of the user
     * @param firstName Sets the first name for the user
     */
     
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets the last name for the user
     * @param lastName Sets the last name for the user
     */
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /**
     * Sets the email address of the user
     * @param email Sets the email address for the user
     */
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * Sets the phone number for the user
     * @param phone Sets the phone number for the user
     */
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Sets address for the user
     * @param address Sets the address for the user
     */
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * Sets the social security number for the user
     * @param socialSecNum Sets the social security number for the user
     */
    
    public void setSocialSecNum(String socialSecNum) {
        this.socialSecNum = socialSecNum;
    }
    
   
            
}
    
