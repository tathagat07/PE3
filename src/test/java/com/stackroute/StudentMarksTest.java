package com.stackroute;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentMarksTest {
  public static StudentMarks studentMarks;
    @BeforeClass
    public static void setUp() throws Exception {
        studentMarks = new StudentMarks();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        studentMarks = null;
    }

    @Test
    public  void UTC_01_validInput()
    {

        studentMarks.setNoOfStudents(studentMarks.getNoOfStudents());
        int[] stuGrades = new int[studentMarks.getNoOfStudents()];

        stuGrades[0] = 10;
        stuGrades[1] = 101;
        stuGrades[2] = 30;
        assertEquals("error message"
                ,"not correct", studentMarks.validMarks(studentMarks.getNoOfStudents(),stuGrades));

    }

    @Test
    public  void UTC_02_validInput()
    {

        studentMarks.setNoOfStudents(2);
        int[] stuGrades = new int[studentMarks.getNoOfStudents()];

        stuGrades[0] = 10;
        stuGrades[1] = 101;
        stuGrades[2] = 30;
        assertNotEquals("error message"
                ,"not correct", studentMarks.validMarks(studentMarks.getNoOfStudents(),stuGrades));

    }


}