/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p4.pkg4;

/**
 *
 * @author Ben
 */
public class P44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Pair p = new Pair(2, 20.3);
       System.out.println("Sum = " + p.getSum());
       System.out.println("Difference = " + p.getDifference());
       System.out.println("Product = " + p.getProduct());
       System.out.println("Average = " + p.getAverage());
       System.out.println("Distance = " + p.getDistance());
       System.out.println("Maximum = " + p.getMax());
       System.out.println("Minimum = " + p.getMin());
       
    }
}
