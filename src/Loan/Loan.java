//parent class for loan types
package Loan;
import Loan.Apply;
/**
 *
 * @author Salad
 */
public class Loan 
{
    private int amount;
    private double interestRate;
    private boolean active;
    
    
   //constructor 
    Loan(int amount, double interestRate)
    {
        this.amount = amount;
        this.interestRate = interestRate;
        active = true;
    }
    
    //sets n gets
    
    public void setAmount(int amount)
    {
        this.amount = amount;
    }
    public void setInterestRate(double interestRate)
    {
        this.interestRate = interestRate;
    }
    public void setActive(boolean active)
    {
        this.active = active;
    
    }
    
    
public int getAmount()
{
    return this.amount;
    
}


public double getInterestRate()
{
    return this.interestRate;

}

public boolean getActive()
{

    return this.active;
}
}




