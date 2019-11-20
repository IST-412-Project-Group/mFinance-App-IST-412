/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Salad
 */
public class StudentLoan extends Loan
{
    private String institution;
    
    public StudentLoan(int amount, double interestRate, String institution)
    {
        super(amount, interestRate);
        this.institution = institution;
    }
    
    private void setInstitution(String institution)
    {
        this.institution = institution;
        
    }
    
    private String getInstitution()
    {
       return this.institution;
    }     
}
