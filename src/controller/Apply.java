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
public class Apply {
    
    private String loanType;
    private int loanAmount;
    private double interestRate;
    private String institution;
    private String carMake;
    private int carYear;

    /**
     * Gets the type of loan (home, car, business, etc)
     * @return A string represents the type of loan
     */
    
    public boolean doesQualify(int income) {
        boolean qualifies = false;
        
        if (income > 20000) {
            qualifies = true;
        }
        
        return qualifies;
    }
    
    public String getLoanType() {
        return loanType;
    }
    
    public String getCarMake() {
        return carMake;
    }
    
    public int getCarYear() {
        return carYear;
    }
    
    public String getInstitution() {
        return institution;
    }
    
    /**
     * Gets the length of time for loan to be paid
     * @return A string represents the length of time for the loan
     */
    public int getLoanAmount() {
        return loanAmount;
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
    
    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    /**
     * Sets the interest rate for the loan
     * @param interestRate Sets the interest rate for the loan
     */
    
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
    public void setCarMake(String make) {
        this.carMake = make;
    }
    
    public void setCarYear(int year) {
        this.carYear = year;
    }
    
    public void setInstituion(String institution) {
        this.institution = institution;
    }
    
}
