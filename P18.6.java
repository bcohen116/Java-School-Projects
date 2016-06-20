import java.util.Random;

/**
   A tester class for DataSet.
*/
public class ExP18_6
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