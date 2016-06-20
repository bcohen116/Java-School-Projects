/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritancedemo;

/**
 *
 * @author clarkk
 */
public class Squirrel extends Mammal 
{
    public Squirrel()
    {
        System.out.println("Squirrel Constructor");
    }
    public Squirrel(int nuts)
    {
        super(4);
        System.out.println("1 ARGUMENT SQUIRREL CONSTRUCTOR");

    }
    public String speak()
    {
        return ("Squeek");
    }
}
