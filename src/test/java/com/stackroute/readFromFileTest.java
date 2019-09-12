package com.stackroute;

import org.junit.*;

import java.io.FileWriter;

import static org.junit.Assert.*;

public class readFromFileTest {
   public static readFromFile readFromFile;
    @BeforeClass
    public void setUp() throws Exception {
        readFromFile = new readFromFile();
    }

    @AfterClass
    public void tearDown() throws Exception {
        readFromFile = null;
    }
    @Test
    public void readfile() throws Exception{
        FileWriter f = new FileWriter("/home/cgi/abc.txt");
        f.write("this is file handling");
        f.close();

        assertEquals("THIS IS FILE HANDLING",readFromFile.printFileUpper("/home/cgi/abc.txt"));
    }
}