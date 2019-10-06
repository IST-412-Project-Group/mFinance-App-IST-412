/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loan;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author spencer
 */
public class ManageTest {
    
    public ManageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getLoanPayment method, of class Manage.
     */
    @org.junit.Test
    public void testGetLoanPayment() {
        System.out.println("getLoanPayment");
        Manage instance = new Manage();
        double expResult = 0.0;
        double result = instance.getLoanPayment();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalLoan method, of class Manage.
     */
    @org.junit.Test
    public void testGetTotalLoan() {
        System.out.println("getTotalLoan");
        Manage instance = new Manage();
        double expResult = 0.0;
        double result = instance.getTotalLoan();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInterestRate method, of class Manage.
     */
    @org.junit.Test
    public void testGetInterestRate() {
        System.out.println("getInterestRate");
        Manage instance = new Manage();
        double expResult = 0.0;
        double result = instance.getInterestRate();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLoanPayment method, of class Manage.
     */
    @org.junit.Test
    public void testSetLoanPayment() {
        System.out.println("setLoanPayment");
        double loanPayment = 0.0;
        Manage instance = new Manage();
        instance.setLoanPayment(loanPayment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalLoan method, of class Manage.
     */
    @org.junit.Test
    public void testSetTotalLoan() {
        System.out.println("setTotalLoan");
        double totalLoan = 0.0;
        Manage instance = new Manage();
        instance.setTotalLoan(totalLoan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInterestRate method, of class Manage.
     */
    @org.junit.Test
    public void testSetInterestRate() {
        System.out.println("setInterestRate");
        double interestRate = 0.0;
        Manage instance = new Manage();
        instance.setInterestRate(interestRate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkLoanBalance method, of class Manage.
     */
    @org.junit.Test
    public void testCheckLoanBalance() {
        System.out.println("checkLoanBalance");
        double loanBalance = 0.0;
        Manage instance = new Manage();
        double expResult = 0.0;
        double result = instance.checkLoanBalance(loanBalance);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
