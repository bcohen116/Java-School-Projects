/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritancedemo;

/**
 *
 * @author clarkk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Mammal[] zoo = new Mammal[3];
        zoo[0] = new Racoon();
        zoo[1] = new Squirrel();
        zoo[2] = new Rabbit();
        for (Mammal m : zoo)
        {
            System.out.println(m.speak());
        }
    }

}
