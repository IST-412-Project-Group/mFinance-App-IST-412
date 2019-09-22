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
     * Get the custId attribute of the user
     * @return custId of the user
     */

    public long getCustId() {
        return custId;
    }

     /**
     * Get the FirstName attribute of the user
     * @return FirstName of the user
     */
    
    public String getFirstName() {
        return firstName;
    }
    
     /**
     * Get the lastName attribute of the user
     * @return lastName of the user
     */
    
    public String getLastName() {
        return lastName;
    }
    
     /**
     * Get the lastName attribute of the user
     * @return FirstName of the user
     */
    
    public String getEmail() {
        return email;
    }
    
     /**
     * Get the phone attribute of the user
     * @return phone of the user
     */
    public String getPhone() {
        return phone;
    }
    
     /**
     * Get the address attribute of the user
     * @return address of the user
     */ 
    
    public String getAddress() {
        return address;
    }

     /**
     * Get the socialSecNum attribute of the user
     * @return socialSecNum of the user
     */
    public String getSocialSecNum() {
        return socialSecNum;
    }
    
     public void setCustId(long custId) {
        this.custId = custId;
    }
     
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSocialSecNum(String socialSecNum) {
        this.socialSecNum = socialSecNum;
    }
    
}
    
