/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p7.pkg12;
import java.util.Scanner;

/**
 *
 * @author Ben
 */
public class P712 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter an integer: ");
      double aNumber = in.nextDouble();

      RootApproximator aDoubleNumber = new RootApproximator(aNumber);
      while (aDoubleNumber.hasMoreGuesses())
         System.out.println(aDoubleNumber.nextGuess());
      
    }
}
