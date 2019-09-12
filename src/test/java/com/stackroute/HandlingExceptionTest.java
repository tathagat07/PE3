package com.stackroute;

import org.junit.*;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class HandlingExceptionTest {
   public static HandlingException handlingException;
 private HandlingException StringMethods;

 @BeforeClass
    public static void setUp() throws Exception {
        handlingException = new HandlingException();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        handlingException = null;
    }

    @Test
    public void NegativeArraySize() throws NegativeArraySizeException{
        List<Object> list = new ArrayList<Object>();

        List.get(0);

    }
    @Test
    public void IndexOutOfBounds() throws IndexOutOfBoundsException{
        List<Object> list = new ArrayList<Object>();

        //thrown.expect(IndexOutOfBoundsException.class);
        //thrown.expectMessage("Index: 0, Size: 0");
        list.get(0);

    }
    @Test(expected = NullPointerException.class)
    public void NullPointerException(){

     AbstractList nullString = null;

     assertEquals(nullString.indexOf(3), StringMethods.myIndexOf(null, 'd',3));
    }
}