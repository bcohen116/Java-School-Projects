/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p3.pkg12;

/**
 *
 * @author Ben
 */
public class P312 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //first implementation
        RoachPopulation Roachlet1 = new RoachPopulation(10);
        Roachlet1.waitForDoubling();
        Roachlet1.spray();
        System.out.println("There are currently " + Roachlet1.getRoaches() + " roaches.");
        
        //second implementation
        Roachlet1.waitForDoubling();
        Roachlet1.spray();
        System.out.println("There are currently " + Roachlet1.getRoaches() + " roaches.");
        
        //third implementaion
        Roachlet1.waitForDoubling();
        Roachlet1.spray();
        System.out.println("There are currently " + Roachlet1.getRoaches() + " roaches.");
    }
}
