/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CH11demo;
import java.util.Random;

/**
 *
 * @author 151146
 */
public class Die implements Measurable
{
   /**
      Constructs a die with a given number of sides.
      @param s the number of sides, e.g. 6 for a normal die
   */
   public Die(int s)
   {
      sides = s;
      generator = new Random();
      castNumber = 0;
   }
   /**
      Simulates a throw of the die
      @return the face of the die
   */
   public int cast()
   {
      castNumber = 1 + generator.nextInt(sides);
      return castNumber;
   }
   /**
      Gets the cast number of the current die
      @return the current cast number
   */
   public double getMeasure()
   {
      return castNumber;
   }

   private Random generator;
   private int sides;
   private int castNumber;
}
