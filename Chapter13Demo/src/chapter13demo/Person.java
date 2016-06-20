/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter13demo;

/**
 *
 * @author 151146
 */
public class Person 
{
    private String name;
    private int age;
    private boolean isFemale;
    
    public Person()
    {
        name = "";
        age = 0;
        isFemale = false;
    }
    public Person(String n, int a, boolean g)
    {
        name = n;
        age = a;
        isFemale = g;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public boolean getGender()
    {
        return isFemale;
    }
    public String toString()
    {
        return "Person = " + name + "   " + age + "   " + isFemale;
    }
}
