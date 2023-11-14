/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import java.util.Scanner;

/**
 *
 * @author Thabang
 */
public class QUESTION2 
{
     public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);  
      TickTacToe game = new TickTacToe();
      game.initializeBoard();
      String player = "X" ;
      int row;
      int cols;
        do 
        {
            System.out.println(game.printBoard());
            System.out.println("Enter the coordinates for rows: ");
            row= sc.nextInt();
            System.out.println("Enter the coordinates for columns: ");
            cols = sc.nextInt();
            game.setPlay(row, cols, player);
            if (game.isGameOver()) 
            {
                System.out.println(game.printBoard() + "\n" + player + " wins!");    
                break;
            }
            if (player == "X") 
            {
              player = "O";     
            }
            else
            {
                player = "X";
            }
        } while (true);
        
    }
    
}
