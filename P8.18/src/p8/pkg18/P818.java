/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p8.pkg18;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author 151146
 */
public class P818 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      ArrayList<Integer> newMagicSquare = new ArrayList<Integer>();
      Scanner scanner = new Scanner(System.in);
      boolean stillAddingNumbers = true;
      int counter = 0;
      while (stillAddingNumbers)
      {
         counter++;
         System.out.println("If you are done, type 0.");
         System.out.print("Please type in your next number(#" + counter + "): "); 
         int input = scanner.nextInt();
         if (input == 0)
            stillAddingNumbers = false;
         else
            newMagicSquare.add(input);
      }
      int squareRootSize = (int)Math.sqrt(newMagicSquare.size());
      if (Math.pow(squareRootSize, 2) == newMagicSquare.size() && newMagicSquare.size() > 8)
      {
         MagicSquares aNewMagicSquare = new MagicSquares(newMagicSquare);
         int index = 0;
         int rowCounter = 0;
         System.out.println("Here is your square: ");
         while (index < Math.pow(squareRootSize, 2))
         {
            System.out.print(newMagicSquare.get(index) + " ");
            if (rowCounter == squareRootSize - 1)
            {
                System.out.println();
                rowCounter = 0;
            }
            else
                rowCounter++;
            index++;
         }
         if(aNewMagicSquare.isMagic())
            System.out.println("You have created a magic square!");
         else
            System.out.println("You have not created a magic square! :(");
      }
      else
         System.out.println("You did not type enough numbers to make a perfect square. :(");
   }
}
