package com.stackroute;

import org.junit.*;

import static org.junit.Assert.*;

public class FolderHandlingTest {
     private static  FolderHandling folderHandling;
    @BeforeClass
    public static void setUp() throws Exception {
        folderHandling = new FolderHandling();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        folderHandling = null;
    }
    @Test
    public void testFolder(){
        assertEquals("reading file successfully" ,"guessNumber.class \n test.txt \n hjgdfgf daGGDQU wdhd oi ad a \n Employee.java \n buffer.java \n check.class",folderHandling.readFile());
    }


}