package com.stackroute;

import org.junit.*;

import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;
import java.util.List;

import static org.junit.Assert.*;

public class countFrequencyTest {
     public static countFrequency countFrequency;
    @BeforeClass
    public static void setUp() throws Exception {
        countFrequency = new countFrequency();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        countFrequency = null;
    }

    @Test
    public void freq() throws IOException {

        FileWriter f = new FileWriter("/home/cgi/testF.txt");
        f.write("i am a man ,\n" +
                "i like to sleep ,\n" +
                "i have a home.");
        f.close();
        List<String> a= new ArrayList<>();
        a.add("i : 3");
        a.add("am : 1");
        a.add("a : 2");
        a.add("man : 1");
        a.add("like : 1");
        a.add("to : 1");
        a.add("sleep : 1");
        a.add("have : 1");
        a.add("home : 1");
        assertEquals(a , countFrequency.countFreq("/home/cgi/testF.txt"));
    }
}