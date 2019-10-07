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
public class CustomerTest {
    
    public CustomerTest() {
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
     * Test of getSSN method, of class Customer.
     */
    @org.junit.Test
    public void testGetSSN() {
        System.out.println("getSSN");
        Customer instance = null;
        String expResult = "";
        String result = instance.getSSN();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSSN method, of class Customer.
     */
    @org.junit.Test
    public void testSetSSN() {
        System.out.println("setSSN");
        String ssn = "";
        Customer instance = null;
        instance.setSSN(ssn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLoan method, of class Customer.
     */
    @org.junit.Test
    public void testAddLoan() {
        System.out.println("addLoan");
        Loan newLoan = null;
        Customer instance = null;
        instance.addLoan(newLoan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
