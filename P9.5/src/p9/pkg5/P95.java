/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p9.pkg5;
import java.util.Scanner;

/**
 *
 * @author Ben
 */
public class P95 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      Scanner input = new Scanner(System.in);

      System.out.println("Enter the radius: ");
      double r = input.nextDouble();

      System.out.println("Enter the height: ");
      double h = input.nextDouble();

      System.out.println("Volume of sphere: " + Volumes.sphereVolume(r));
      System.out.println("Surface area of sphere: " + Volumes.sphereSurface(r));
      System.out.println("Volume of cylinder: " + Volumes.cylinderVolume(r, h));
      System.out.println("Surface area of cylinder: " + Volumes.cylinderSurface(r, h));
      System.out.println("Volume of the cone: " + Volumes.coneVolume(r, h));
      System.out.println("Surface area of cone: " + Volumes.coneSurface(r, h));
    }
}
