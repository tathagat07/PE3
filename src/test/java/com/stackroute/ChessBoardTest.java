package com.stackroute;

import org.junit.*;

import static org.junit.Assert.*;

public class ChessBoardTest {
     public static ChessBoard chessBoard;
    @BeforeClass
    public void setUp() throws Exception {
        chessBoard = new ChessBoard();
    }

    @AfterClass
    public void tearDown() throws Exception {
        chessBoard = null;
    }

    @Test
    public void UTC_input01(){
        chessBoard.setRow(3);
        chessBoard.setCol(3);
        int x = chessBoard.getRow();
        int y = chessBoard.getCol();

        String[][] z = {
                {"W","W","|"},
                {"B","B","|"},
                {"W","W","|"}
        };
        assertEquals(z,chessBoard.makeboard());
    }
}