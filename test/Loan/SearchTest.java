/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loan;

import java.util.ArrayList;
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
public class SearchTest {
    
    public SearchTest() {
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
     * Test of getLoanType method, of class Search.
     */
    @org.junit.Test
    public void testGetLoanType() {
        System.out.println("getLoanType");
        Search instance = new Search();
        String expResult = "";
        String result = instance.getLoanType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInterestRate method, of class Search.
     */
    @org.junit.Test
    public void testGetInterestRate() {
        System.out.println("getInterestRate");
        Search instance = new Search();
        double expResult = 0.0;
        double result = instance.getInterestRate();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLoanType method, of class Search.
     */
    @org.junit.Test
    public void testSetLoanType() {
        System.out.println("setLoanType");
        String loanType = "";
        Search instance = new Search();
        instance.setLoanType(loanType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInterestRate method, of class Search.
     */
    @org.junit.Test
    public void testSetInterestRate() {
        System.out.println("setInterestRate");
        float interestRate = 0.0F;
        Search instance = new Search();
        instance.setInterestRate(interestRate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchLoan method, of class Search.
     */
    @org.junit.Test
    public void testSearchLoan() {
        System.out.println("searchLoan");
        ArrayList[] listOfLoans = null;
        Search instance = new Search();
        ArrayList[] expResult = null;
        ArrayList[] result = instance.searchLoan(listOfLoans);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
