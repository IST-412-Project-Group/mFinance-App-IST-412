/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loan;

/**
 *
 * @author Evan
 */
public class Apply {
    
    private String loanType;
    private String loanLength;
    private float interestRate;

    /**
     * Gets the type of loan (home, car, business, etc)
     * @return A string represents the type of loan
     */
    
    public String getLoanType() {
        return loanType;
    }
    
    /**
     * Gets the length of time for loan to be paid
     * @return A string represents the length of time for the loan
     */
    public String getLoanLength() {
        return loanLength;
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
     * Sets the length of the loan
     * @param loanLength Sets the length of the loan
     */
    
    public void setLoanLength(String loanLength) {
        this.loanLength = loanLength;
    }

    /**
     * Sets the interest rate for the loan
     * @param interestRate Sets the interest rate for the loan
     */
    
    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }
    
    
    
}
