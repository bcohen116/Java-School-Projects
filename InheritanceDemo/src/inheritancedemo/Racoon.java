/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritancedemo;

/**
 *
 * @author clarkk
 */
public class Racoon extends Mammal 
{
    public Racoon()
    {
        System.out.println("Racoon Constructor");
    }
    public Racoon(int nuts)
    {
        System.out.println("1 ARGUMENT Racoon CONSTRUCTOR");

    }
    public String speak()
    {
        return ("Rrrrrrrr");
    }
}
