/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfinance;

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
public class LoanTest {
    
    public LoanTest() {
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
     * Test of setAmount method, of class Loan.
     */
    @org.junit.Test
    public void testSetAmount() {
        System.out.println("setAmount");
        float amount = 0.0F;
        Loan instance = null;
        instance.setAmount(amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInterestRate method, of class Loan.
     */
    @org.junit.Test
    public void testSetInterestRate() {
        System.out.println("setInterestRate");
        float interestRate = 0.0F;
        Loan instance = null;
        instance.setInterestRate(interestRate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActive method, of class Loan.
     */
    @org.junit.Test
    public void testSetActive() {
        System.out.println("setActive");
        boolean active = false;
        Loan instance = null;
        instance.setActive(active);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAmount method, of class Loan.
     */
    @org.junit.Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Loan instance = null;
        float expResult = 0.0F;
        float result = instance.getAmount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInterestRate method, of class Loan.
     */
    @org.junit.Test
    public void testGetInterestRate() {
        System.out.println("getInterestRate");
        Loan instance = null;
        float expResult = 0.0F;
        float result = instance.getInterestRate();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActive method, of class Loan.
     */
    @org.junit.Test
    public void testGetActive() {
        System.out.println("getActive");
        Loan instance = null;
        boolean expResult = false;
        boolean result = instance.getActive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
