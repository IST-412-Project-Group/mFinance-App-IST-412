//parent class for loan types
package mfinance;

/**
 *
 * @author Salad
 */
public class Loan 
{
    private float amount;
    private float interestRate;
    private boolean active;
    
    
   //constructor 
    Loan(float amount, float interestRate)
    {
        this.amount = amount;
        this.interestRate = interestRate;
        active = true;
    }
    
    //sets n gets
    
    public void setAmount(float amount)
    {
        this.amount = amount;
    }
    public void setInterestRate(float interestRate)
    {
        this.interestRate = interestRate;
    }
    public void setActive(boolean active)
    {
        this.active = active;
    
    }
    
    
public float getAmount()
{
    return this.amount;
    
}


public float getInterestRate()
{
    return this.interestRate;

}

public boolean getActive()
{

    return this.active;
}
}




