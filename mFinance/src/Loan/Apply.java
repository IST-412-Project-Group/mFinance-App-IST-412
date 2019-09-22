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

    public String getLoanType() {
        return loanType;
    }

    public String getLoanLength() {
        return loanLength;
    }

    public float getInterestRate() {
        return interestRate;
    }
    
    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public void setLoanLength(String loanLength) {
        this.loanLength = loanLength;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }
    
    
    
}
