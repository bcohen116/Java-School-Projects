/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritancedemo;

/**
 *
 * @author clarkk
 */
public abstract class Mammal 
{
    public Mammal()
    {
        System.out.println("Mammal Constructor");
    }
    public Mammal(int age)
    {
        System.out.println("1 ARGUMENT MAMMAL CONSTRUCTOR");
    }
    public abstract String speak();
}
