/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p11.pkg3;

/**
 *
 * @author 151146
 */
public class DataSet 
{
   public DataSet(Measurer aMeasurer)
   {
      sum = 0;
      count = 0;
      maximum = null;
      measurer = aMeasurer;
   }
   /**
      Adds a data value to the data set.
      @param x a data value
   */
   public void add(Object x)
   {
      sum = sum + measurer.measure(x);
      if (count == 0 || measurer.measure(maximum) < measurer.measure(x))
         maximum = x;
      count++;
   }
   /**
      Gets the average of the added data.
      @return the average or 0 if no data has been added
   */
   public double getAverage()
   {
      if (count == 0) return 0;
      else return sum / count;
   }
   /**
      Gets the largest of the added data.
      @return the maximum or 0 if no data has been added
   */
   public Object getMaximum()
   {
      return maximum;
   }
   private double sum;
   private Object maximum;
   private int count;
   private Measurer measurer;
}
