/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package p18.pkg6;
import java.util.Random;

/**
 *
 * @author Ben
 */

/**
   A tester class for DataSet.
*/
public class P186
{
   public static void main(String[] args)
   {
      Random generator = new Random();
      int capacity = 10;
      int[] array = new int[capacity];
      
      for (int i = 0; i < array.length; i++)
      {
         int num = generator.nextInt(100);
         array[i] = num;
         System.out.print(array[i] + " ");
      }
      System.out.println();
      
      DataSet d = new DataSet(array);
      System.out.println("Maximum = " + d.getMaximum());
   }
}