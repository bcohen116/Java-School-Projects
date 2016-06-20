/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
package p4.pkg12;

/**
 *
 * @author Ben
 */
public class P412
{

    public static void main(String[] args) 
{
   
      Scanner in = new Scanner(System.in);

      System.out.println("Please enter a 5 digit integer:");
      int digit = in.nextInt();

      DigitExtractor myExtractor = new DigitExtractor(digit);

      System.out.println(myExtractor.nextDigit());
      System.out.println(myExtractor.nextDigit());
      System.out.println(myExtractor.nextDigit());
      System.out.println(myExtractor.nextDigit());
      System.out.println(myExtractor.nextDigit());
   
}
}