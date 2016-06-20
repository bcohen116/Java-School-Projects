/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter13demo;

/**
 *
 * @author 151146
 */
public class Teenager extends Person
{
    private boolean isSquirrel;
    private boolean hasLicense;
    
    public Teenager()
    {
        isSquirrel = false;
        hasLicense = false;
    }
    public Teenager(boolean s, boolean l)
    {
        isSquirrel = s;
        hasLicense = l;
    }
    public Teenager(boolean s, boolean l, String n, int a, boolean g)
    {        
        super(n, a, g);
        isSquirrel = s;
        hasLicense = l;

    }
    public boolean getSquirrelaty()
    {
        return isSquirrel;
    }
    public boolean getLicense()
    {
        return hasLicense;
    }
    public String toString()
    {
        return "Teenager = [" + super.toString() + "]   " + 
                isSquirrel + "   " + hasLicense;
    }
}
