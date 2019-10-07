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
public class StudentLoan extends Loan
{
    private String institution;
    private int semesterStanding;
    
    StudentLoan(float amount, float interestRate, String institution, int semesterStanding)
    {
        super(amount, interestRate);
        this.institution = institution;
        this.semesterStanding = semesterStanding;
    }
    
    private void setInstitution(String institution)
    {
        this.institution = institution;
        
    }
    
    private void setSemesterStanding(int semesterStanding)
    {
        this.semesterStanding = semesterStanding;
    
    }
    
    private String getInstitution()
    {
       return this.institution;
    }
    
    private int getSemester()
    {
        return this.semesterStanding;
    }
            
            
            
}
