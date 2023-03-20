/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author usuario
 */
public class UtilsTest {

    public UtilsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("* UtilsTest: @BeforeClass method");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("* UtilsTest: @AfterClass method");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("* UtilsTest: @Before method");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("* UtilsTest: @After method");
    }

    @Test
    public void helloWorldCheck() {
        System.out.println("* UtilsTest: test method 1 - helloWorldCheck()");
        assertEquals("Hello, world!", Utils.concatWords("Hello", ", ", "world", "!"));

    }

    @Test(timeout = 1000)
    public void testWithTimeout() {
        System.out.println("* UtilsTest: test method 2 - testWithTimeout()");
        final int factorialOf = 1 + (int) (30000 * Math.random());
        System.out.println("computing " + factorialOf + '!');
        System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkExpectedException() {
        System.out.println("* UtilsTest: test method 3 - checkExpectedException()");
        final int factorialOf = -5;
        System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
    }

    @Ignore
    @Test
    public void temporarilyDisabledTest() throws Exception {
        System.out.println("* UtilsTest: test method 4 - checkExpectedException()");
        assertEquals("Malm\u00f6", Utils.normalizeWord("Malmo\u0308"));
    }

}
