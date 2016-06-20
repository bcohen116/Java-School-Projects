/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p19.pkg12;

/**
 *
 * @author 151146
 */
public class Person implements Comparable
{
    private String name = "";
    public Person(String s)
    {
       name =  s;
    }
    public String getName()
    {
        return name;
    }
    public int compareTo(Object t) 
    {
        Person p = (Person) t;
        return this.name.compareTo(p.getName());
    }
}
