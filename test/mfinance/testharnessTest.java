/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfinance;

import Loan.Apply;
import Loan.Manage;
import Loan.Search;
import User.EditInfo;
import User.Authentication;
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
public class testharnessTest {
    
    public testharnessTest() {
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

    @org.junit.Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
       
    }
       @org.junit.Test
    public void testGetLoanType() {
        System.out.println("getLoanType");
        Apply instance = new Apply();
        String expResult = "";
        String result = instance.getLoanType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
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
        
    }
    
        @org.junit.Test
    public void testGetLoanPayment() {
        System.out.println("getLoanPayment");
        Manage instance = new Manage();
        double expResult = 0.0;
        double result = instance.getLoanPayment();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
      
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
        
    }
    
     /**
     * Test of getUsername method, of class Authentication.
     */
    @org.junit.Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Authentication instance = new Authentication();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPassword method, of class Authentication.
     */
    @org.junit.Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Authentication instance = new Authentication();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setUsername method, of class Authentication.
     */
    @org.junit.Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        Authentication instance = new Authentication();
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setPassword method, of class Authentication.
     */
    @org.junit.Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Authentication instance = new Authentication();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of logIn method, of class Authentication.
     */
    @org.junit.Test
    public void testLogIn() {
        System.out.println("logIn");
        String username = "";
        String password = "";
        boolean correctLogin = false;
        Authentication instance = new Authentication();
        boolean expResult = false;
        boolean result = instance.logIn(username, password, correctLogin);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of logOut method, of class Authentication.
     */
    @org.junit.Test
    public void testLogOut() {
        System.out.println("logOut");
        Authentication instance = new Authentication();
        instance.logOut();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
     /**
     * Test of getCustId method, of class EditInfo.
     */
    @org.junit.Test
    public void testGetCustId() {
        System.out.println("getCustId");
        EditInfo instance = new EditInfo();
        long expResult = 0L;
        long result = instance.getCustId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getFirstName method, of class EditInfo.
     */
    @org.junit.Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        EditInfo instance = new EditInfo();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of getLastName method, of class EditInfo.
     */
    @org.junit.Test
    public void testGetLastName() {
        System.out.println("getLastName");
        EditInfo instance = new EditInfo();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getEmail method, of class EditInfo.
     */
    @org.junit.Test
    public void testGetEmail() {
        System.out.println("getEmail");
        EditInfo instance = new EditInfo();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPhone method, of class EditInfo.
     */
    @org.junit.Test
    public void testGetPhone() {
        System.out.println("getPhone");
        EditInfo instance = new EditInfo();
        String expResult = "";
        String result = instance.getPhone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getAddress method, of class EditInfo.
     */
    @org.junit.Test
    public void testGetAddress() {
        System.out.println("getAddress");
        EditInfo instance = new EditInfo();
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getSocialSecNum method, of class EditInfo.
     */
    @org.junit.Test
    public void testGetSocialSecNum() {
        System.out.println("getSocialSecNum");
        EditInfo instance = new EditInfo();
        String expResult = "";
        String result = instance.getSocialSecNum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of setCustId method, of class EditInfo.
     */
    @org.junit.Test
    public void testSetCustId() {
        System.out.println("setCustId");
        long custId = 0L;
        EditInfo instance = new EditInfo();
        instance.setCustId(custId);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setFirstName method, of class EditInfo.
     */
    @org.junit.Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        EditInfo instance = new EditInfo();
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setLastName method, of class EditInfo.
     */
    @org.junit.Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        EditInfo instance = new EditInfo();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setEmail method, of class EditInfo.
     */
    @org.junit.Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        EditInfo instance = new EditInfo();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setPhone method, of class EditInfo.
     */
    @org.junit.Test
    public void testSetPhone() {
        System.out.println("setPhone");
        String phone = "";
        EditInfo instance = new EditInfo();
        instance.setPhone(phone);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setAddress method, of class EditInfo.
     */
    @org.junit.Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "";
        EditInfo instance = new EditInfo();
        instance.setAddress(address);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of setSocialSecNum method, of class EditInfo.
     */
    @org.junit.Test
    public void testSetSocialSecNum() {
        System.out.println("setSocialSecNum");
        String socialSecNum = "";
        EditInfo instance = new EditInfo();
        instance.setSocialSecNum(socialSecNum);
        // TODO review the generated test code and remove the default call to fail.
      
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
       
    }
    
     /**
     * Test of main method, of class MFinance.
     */
    @org.junit.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MFinance.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
     /**
     * Test of getId method, of class User.
     */
    @org.junit.Test
    public void testGetId() {
        System.out.println("getId");
        User instance = null;
        long expResult = 0L;
        long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setId method, of class User.
     */
    @org.junit.Test
    public void testSetId() {
        System.out.println("setId");
        long id = 0L;
        User instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
       
    }

  
}
