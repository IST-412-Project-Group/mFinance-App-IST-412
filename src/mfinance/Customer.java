/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfinance;

import java.util.ArrayList;

/**
 *
 * @author Salad
 */

//using polymorphism to reduce need to rewrite methods
public class Customer extends User{
    private String ssn;
    private ArrayList<Loan> loans;
    
    
    //constructor
    Customer(long id, String firstName, String lastName, String email, String phone, String address, String ssn)
    {
        //call previous constructer, add attributes
        super(id, firstName, lastName, email, phone, address);
        this.ssn = ssn;
        loans  = new ArrayList<Loan>();
    }
    
   
    public String getSSN()
    {
        return this.ssn;
    
    }
    
    public void setSSN(String ssn)
    {
        this.ssn = ssn;
    }
    
    
    public void addLoan(Loan newLoan)
    {
        loans.add(newLoan);
    
    }
    
    
}

