/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loan;

import java.util.ArrayList;

/**
 *
 * @author Evan
 */
public class Search {
    
    private String loanType;
    private float interestRate;
      
        /**
     * Gets the type of loan (home, car, business, etc)
     * @return A string represents the type of loan
     */
    
    public String getLoanType() {
        return loanType;
    }
    
     /**
     * Gets the interest rate of the loan
     * @return A double representing the interest rate of the loan
     */
    
    public double getInterestRate() {
        return interestRate;
    }
    
    
     /**
     * Sets the type of the loan
     * @param loanType Sets the type for the loan
     */
    
    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }
    
     /**
     * Sets the interest rate for the loan
     * @param interestRate Sets the interest rate for the loan
     */
    
    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }
    
     /**
     * Checks for list of user's current loans
     * @return An ArrayList representing the user's list of loans
     * @param listOfLoans checks user's current list of loans
     */
      
    
    public ArrayList[] searchLoan(ArrayList[] listOfLoans){
        
        return listOfLoans;
    }
}
