/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

/**
 *
 * @author Thabang
 */
public class TickTacToe 
{
    private String[][] board;
    private static final int ROWS = 3;
    private static final int COLS = 3;
    private String space = "\\s{3}";
    
    public TickTacToe()
    {
        board = new String[ROWS][COLS];
    }
    
    ///// initialize the board
    public void initializeBoard()
    {
        for (int i = 0; i < ROWS; i++) 
        {
            for (int j = 0; j < COLS; j++) 
            {
                board[i][j] = "   ";
            }
 
        }
    }
    
    ////// setting the move for the player
    public void setPlay(int i, int j, String player)
    {
        if (this.board[i][j].matches(space)) 
        {
            board[i][j] = " " + player + " ";
        }
    }
    
    
    
    ///// check if its the end of the game
    public boolean isGameOver()
    {
        /// checking rows
        for (int i = 0; i < ROWS; i++) 
        {
            if (!board[i][0].matches(space) && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) 
            {
                return true;
            }
        }
        /// checking cols
        for (int j = 0; j < COLS; j++) 
        {
            if (!board[0][j].matches(space) && board[0][j].equals(board[1][j]) && board[1][j].equals(board[2][j])) 
            {
                return true;
            }
        }
        /// checking diagonals
        if (!board[0][0].matches(space) && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) 
        {
            return true;
        }
        if (!board[0][2].matches(space) && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) 
        {
            return true;
        }
        // nobody won
        return false;
    }
    
    
    
    
    ////// printing the game board
    public String printBoard()
    {
        String strBoard = "";
        for (int i = 0; i < ROWS; i++) 
        {
            for (int j = 0; j < COLS; j++) 
            {
                if (j != COLS - 1) 
                {
                    strBoard += board[i][j] + "|";
                }
                else
                    strBoard += board[i][j];
            }
            if (i != COLS - 1) 
            {
              strBoard += "\n---*---*---\n" ; 
            }
    
        }
        return strBoard;
    }
}
