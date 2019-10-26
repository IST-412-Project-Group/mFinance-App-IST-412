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
public class CarLoan extends Loan
{
    private String manufacturer;
    private int year;
    
    CarLoan(int amount, double interestRate, String manuafacturer, int year)
    {
        super(amount, interestRate);
        this.manufacturer = manufacturer;
        this.year = year;
    }

    private String getManufacturer()
    {
        return this.manufacturer;
    }

    
    private int getYear()
    {
        return this.year;
    }
    
    private void setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }
    
    private void setYear(int year)
    {
        this.year = year;
    }
}
