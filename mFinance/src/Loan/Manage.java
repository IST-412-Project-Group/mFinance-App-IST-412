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
public class Manage {
    
  private float loanPayment;
  private float totalLoan;
  private float interestRate;

    public float getLoanPayment() {
        return loanPayment;
    }

    public float getTotalLoan() {
        return totalLoan;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setLoanPayment(float loanPayment) {
        this.loanPayment = loanPayment;
    }

    public void setTotalLoan(float totalLoan) {
        this.totalLoan = totalLoan;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }
            
}

