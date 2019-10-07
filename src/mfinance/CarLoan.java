/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfinance;

/**
 *
 * @author Salad
 */
public class CarLoan extends Loan
{
    private String manufacturer;
    private int year;
    private boolean sportsCar;
    
    CarLoan(float amount, float interestRate, String manuafacturer, int year, boolean sportsCar)
    {
        super(amount, interestRate);
        this.manufacturer = manufacturer;
        this.year = year;
        this.sportsCar = sportsCar;
    
    }

    private String getManufacturer()
    {
        return this.manufacturer;
    }

    
    private int getYear()
    {
        return this.year;
    }
    
    private boolean getsportsCar()
    {
        return this.sportsCar;
    }
    
    
    private void setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }
    
    private void setYear(int year)
    {
        this.year = year;
    }
    
    private void setSportsCar(boolean sportsCar)
    {
        this.sportsCar = sportsCar;
    }
    
    
    
}
