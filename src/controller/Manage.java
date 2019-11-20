/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Evan
 */
public class Manage {
    
  private double loanPayment;
  private double totalLoan;
  private double interestRate;
  private double loanBalance;
  
   /**
     * Gets the amount payed toward the loan 
     * @return A double represents the amount paid toward loan
     */
  
    public double getLoanPayment() {
        return loanPayment;
    }

     /**
     * Gets the total amount of the loan 
     * @return A double represents the total amount of the loan
     */ 
    
    public double getTotalLoan() {
        return totalLoan;
    }

     /**
     * Gets the interest rate of the loan 
     * @return A double represents the interest rate of the loan
     */
    
    public double getInterestRate() {
        return interestRate;
    }

     /**
     * Sets the amount paid toward the loan
     * @param loanPayment Sets the amount paid toward the loan
     */
    
    public void setLoanPayment(double loanPayment) {
        this.loanPayment = loanPayment;
    }

     /**
     * Sets the total amount of the loan
     * @param totalLoan Sets the total amount of the loan
     */
    
    public void setTotalLoan(double totalLoan) {
        this.totalLoan = totalLoan;
    }

     /**
     * Sets the interest rate of the loan
     * @param interestRate Sets the interest rate of the loan
     */
    
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
     
    /**
     * Checks for the current balance of the loan
     * @return A double represents the loanBalance
     * @param loanBalance Checks user's current loan balance
     */
    
    public double checkLoanBalance(double loanBalance){ 
        
        return loanBalance;
        
      }
}

