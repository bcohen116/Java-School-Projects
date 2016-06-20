/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritancedemo;

/**
 *
 * @author clarkk
 */
public class Rabbit extends Mammal 
{
    public Rabbit()
    {
        System.out.println("Rabbit Constructor");
    }
    public Rabbit(int nuts)
    {
        System.out.println("1 ARGUMENT Rabbit CONSTRUCTOR");

    }
    public String speak()
    {
        return ("Chomp!");
    }
}
