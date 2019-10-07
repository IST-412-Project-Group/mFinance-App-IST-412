/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfinance;

/**
 *
 * @author Salad
 */
public class Admin extends User
{
    private boolean admin;
    
    Admin(long id, String firstName, String lastName, String email, String phone, String address)
    {
        super(id, firstName, lastName, email, phone, address);
        admin = true;
    
    }
    
    //will add more methods as needed
    
    
}
