/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loan;

/**
 *
 * @author Salad
 */
public class LoanControl {
   public static Loan LoanFactory(Apply tempLoan) {
       Loan newLoan = null;
       int loanAmount = tempLoan.getLoanAmount();
       double intRate = tempLoan.getInterestRate();
       if (tempLoan.getLoanType().equals("car")) {
           String make = tempLoan.getCarMake();
           int year = tempLoan.getCarYear();
           newLoan = new CarLoan(loanAmount, intRate, make, year);
        }
        else if(tempLoan.getLoanType().equals("student")){
            String inst = tempLoan.getInstitution();
            newLoan = new StudentLoan(loanAmount, intRate, inst);
        }       
        else {
            /* TODO: make this dynamic */
            newLoan = new Loan(123, 12);
        }
       
       return newLoan;
   }
}
