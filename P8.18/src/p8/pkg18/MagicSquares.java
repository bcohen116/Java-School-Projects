/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p8.pkg18;
import java.util.ArrayList;

/**
 *
 * @author 151146
 */
public class MagicSquares 
{       
   private int[][] superMagicSquare;
   private int sizeOfNewMagicSquare;
   public MagicSquares(ArrayList<Integer> typedNumbers)
   {
      //set up the variables I will need.
      sizeOfNewMagicSquare = (int) (typedNumbers.size() / typedNumbers.size());
      superMagicSquare = new int[sizeOfNewMagicSquare][sizeOfNewMagicSquare];
      int counter = 0;
      for (int row = 0; row < sizeOfNewMagicSquare; row++)
      {
         for (int colum = 0; colum < sizeOfNewMagicSquare; colum++)
         {
            superMagicSquare[row][colum] = typedNumbers.get(counter);
            counter++;
         }
      }
   }
   private int addRowsAndColums(int rowOrColum, boolean isARow)
   {
      //sum the rows and colums
      int sumOfLine = 0;
      for (int columOrRow = 0; columOrRow < sizeOfNewMagicSquare; columOrRow++)
      {
         if (isARow)
            sumOfLine += superMagicSquare[rowOrColum][columOrRow];
         else
            sumOfLine += superMagicSquare[columOrRow][rowOrColum];
      }
      return sumOfLine;
   }
   private int addDiagonals(boolean isLeftDiagonal)
   {
      //sum the diagonals
      int sumOfDiagonal = 0;
      for (int row = 0; row < sizeOfNewMagicSquare; row++)
      {
         int colum;
         if (isLeftDiagonal)
            colum = row;
         else
            colum = (sizeOfNewMagicSquare - 1) - row;
         sumOfDiagonal += superMagicSquare[row][colum];
      }
      return sumOfDiagonal;
   }
   public boolean isMagic()
   {
      //check for no repeats
      boolean numberIsInSquare = false;
      for (int repeatChecker = 1; repeatChecker <= Math.pow(sizeOfNewMagicSquare, 2); repeatChecker++)
      {      
         for (int row = 0; row < sizeOfNewMagicSquare ; row++)
         {
             for (int colum = 0; colum < sizeOfNewMagicSquare ; colum++)
             {
                if (superMagicSquare[row][colum] == repeatChecker)
                   numberIsInSquare = true;
             }
         }
      if (numberIsInSquare)
         return false;
      }
      //makes sure everything adds up
      //true for diagonal, means that it is checking the diaonal that 
      //starts on the top left. If it is false, it is checking the opposite. 
      //For the rows and colums, true means that it is checking a row, if it 
      //is false, it is chcking a colum.
      int sumOfNumbers = addDiagonals(true);
      if (sumOfNumbers != addDiagonals(false))
         return false;
      for (int i = 0; i < sizeOfNewMagicSquare; i++)
      {
         if (sumOfNumbers != addRowsAndColums(i, true) && sumOfNumbers != addRowsAndColums(i, false))
            return false;
      }
      return true;
   }
}
