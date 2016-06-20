/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p11.pkg3;

/**
 *
 * @author 151146
 */
public class Person
{
    private String name;
    private int height;
    public Person(String inputName, int inputHeight)
    {
        name = inputName;
        height = inputHeight;
    }
    public String getName()
    {
        return name;
    }
    public int getHeight()
    {
        return height;
    }
}
