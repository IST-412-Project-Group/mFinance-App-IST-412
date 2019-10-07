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
public class ApplyTest {
    
    public ApplyTest() {
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
     * Test of getLoanType method, of class Apply.
     */
    @org.junit.Test
    public void testGetLoanType() {
        System.out.println("getLoanType");
        Apply instance = new Apply();
        String expResult = "";
        String result = instance.getLoanType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLoanLength method, of class Apply.
     */
    @org.junit.Test
    public void testGetLoanLength() {
        System.out.println("getLoanLength");
        Apply instance = new Apply();
        String expResult = "";
        String result = instance.getLoanLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInterestRate method, of class Apply.
     */
    @org.junit.Test
    public void testGetInterestRate() {
        System.out.println("getInterestRate");
        Apply instance = new Apply();
        double expResult = 0.0;
        double result = instance.getInterestRate();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLoanType method, of class Apply.
     */
    @org.junit.Test
    public void testSetLoanType() {
        System.out.println("setLoanType");
        String loanType = "";
        Apply instance = new Apply();
        instance.setLoanType(loanType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLoanLength method, of class Apply.
     */
    @org.junit.Test
    public void testSetLoanLength() {
        System.out.println("setLoanLength");
        String loanLength = "";
        Apply instance = new Apply();
        instance.setLoanLength(loanLength);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInterestRate method, of class Apply.
     */
    @org.junit.Test
    public void testSetInterestRate() {
        System.out.println("setInterestRate");
        float interestRate = 0.0F;
        Apply instance = new Apply();
        instance.setInterestRate(interestRate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
