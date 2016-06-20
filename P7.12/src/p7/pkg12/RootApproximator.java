/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p7.pkg12;

/**
 *
 * @author Ben
 */
public class RootApproximator 
{   
    private double root1 = 1;
    private double root2;
    private double numberToRoot;
   
   public RootApproximator(double numberToRoot)
   {
      this.numberToRoot = numberToRoot;
      root2 = numberToRoot;
   }
   public double nextGuess()
   {
      root1 = root2;
      double root3 = 1;
      if(root1 > 0 || root1 < 0)
         root3 =  numberToRoot / root1;
         root2 = (root3 + root1) / 2;
      return root2;
   }
   public boolean hasMoreGuesses()
   {
      return (Math.abs(root2 - root1) > 0.000000000000000000001);
   }
}
