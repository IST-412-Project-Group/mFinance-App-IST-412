/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfinance;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author spencer
 */
@org.junit.runner.RunWith(org.junit.runners.Suite.class)
@org.junit.runners.Suite.SuiteClasses({LoanControlTest.class, CarLoanTest.class, AuthenticationTest.class, MFinanceTest.class, UserControlTest.class, LoanTest.class, UserTest.class, AdminTest.class, CustomerTest.class, testharnessTest.class, StudentLoanTest.class})
public class MfinanceSuite {

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
    
}
