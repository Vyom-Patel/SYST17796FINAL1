/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syst17796final1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 14373
 */
public class SYST17796FINAL1IT {
    
    public SYST17796FINAL1IT() {
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
     * Test of main method, of class SYST17796FINAL1.
     */
    @Test
    public void testMain() {
     /*   System.out.println("main");
        String[] args = null;
        SYST17796FINAL1.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of calculateNet method, of class SYST17796FINAL1.
     */
    @Test
    public void testCalculateNet() {
        System.out.println("calculateNet");
        double hours = 40;
        double rate = 14.25;
        double tax = 10;
        double expResult = 570;
        double result = SYST17796FINAL1.calculateNet(hours, rate, tax);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
