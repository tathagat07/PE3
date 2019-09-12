package com.stackroute;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class removeVowelTest {
    private static removeVowel removeVowel;
    @BeforeClass
    public static void setUp() throws Exception {
        removeVowel = new removeVowel();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        removeVowel = null;
    }

    @Test
    public void UTC_input(){
        List<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("United States");
        countries.add("Germany");
        countries.add("Egypt");
        countries.add("czechoslovakia");

        List<String> expected = new ArrayList<>();
        expected.add("Ind");
        expected.add("Untd Stts");
        expected.add("Grmny");
        expected.add("Egypt");
        expected.add("czchslvk");

        assertEquals("Error! ",expected,removeVowel.Remove());

    }

    public void UTC_input02() {
        List<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("United States");
        countries.add("Germany");
        countries.add("Egypt");
        countries.add("czechoslovakia");

        List<String> expected = new ArrayList<>();
        expected.add("Ind");
        expected.add("Untd Stts");
        expected.add("Grmny");
        expected.add("Egypt");
        expected.add("czchslvkqw");

        assertNotEquals("Error! ",expected,removeVowel.Remove());

    }
}