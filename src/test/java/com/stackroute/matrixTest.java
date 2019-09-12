package com.stackroute;

import org.junit.*;

import static org.junit.Assert.*;

public class matrixTest {
   private static matrix matrix;
    @BeforeClass
    public static void setUp() throws Exception {
        matrix = new matrix();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        matrix = null;
    }

    @Test
    public void input1(){
        matrix.setRow(3);
        matrix.setCol(2);
        int[][] mat1 =new int[matrix.getRow()][matrix.getCol()];
         mat1[0][0] = 1;
         mat1[0][1] = 2;
         mat1[0][2] = 3;
         mat1[1][0] = 4;
         mat1[1][1] = 5;
         mat1[1][2] = 6;
        int[][] mat2 =new int[matrix.getRow()][matrix.getCol()];
        mat2[0][0] = 9;
        mat2[0][1] = 8;
        mat2[0][2] = 7;
        mat2[1][0] = 6;
        mat2[1][1] = 5;
        mat2[1][2] = 4;
        int[][] expected =new int[matrix.getRow()][matrix.getCol()];
        expected[0][0] =10;
        expected[0][1] = 10;
        expected[0][2] = 10;
        expected[1][0] = 10;
        expected[1][1] = 10;
        expected[1][2] = 10;

        int[][] actual = matrix.addMatrix(mat1,mat2);
        assertEquals("Error!",expected,actual );
    }
}