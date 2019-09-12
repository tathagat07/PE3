package com.stackroute;

import org.junit.*;

import static org.junit.Assert.*;

public class ExceptionHandlingTest {
    String message = "Tathagat";

   ExceptionHandling  exceptionHandling = new ExceptionHandling(message);
    @BeforeClass
    public static void setUp() throws Exception {

    }

    @AfterClass
    public static void tearDown() throws Exception {
    }

    @Test(expected = ArithmeticException.class)
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        exceptionHandling.printMessage();
    }

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Tathagat";
        assertEquals(message,exceptionHandling.salutationMessage());
    }
}