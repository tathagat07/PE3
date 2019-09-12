package com.stackroute;

import org.junit.*;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {
    public static ConsecutiveNumbers consecutiveNumbers;
    @BeforeClass
    public static void setUp() throws Exception {
        consecutiveNumbers = new ConsecutiveNumbers();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        consecutiveNumbers = null;
    }

    @Test
    public void UTC_input01(){
        int[] expected =(new int[]{54, 53, 52, 51, 50, 49, 48} );

        int[] actual = consecutiveNumbers.func();

        assertEquals("Error!",actual,expected );
    }

    @Test
    public void UTC_input02(){
        int[] expected =(new int[]{54, 53, 52, 51, 50} );

        int[] actual = consecutiveNumbers.func();

        assertNotEquals("Error!",actual,expected );
    }

    @Test
    public void UTC_input03(){
        int[] expected =(new int[]{1,2,3,4,5,6,6} );

        int[] actual = consecutiveNumbers.func();

        assertNotEquals("Error!",actual,expected );
    }


}