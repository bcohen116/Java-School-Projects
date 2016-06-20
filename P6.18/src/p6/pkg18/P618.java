/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p6.pkg18;

/**
 *
 * @author Ben
 */
public class P618 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Line line1 = new Line(0,3,1,3);
        Line line2 = new Line(0,2,1,2);
   
        System.out.println("intersects " + line1.intersects(line2));
        System.out.println("parallel " + line1.isParrallel(line2));
        System.out.println("equals " + line1.equals(line2));
        
        

    }
}
