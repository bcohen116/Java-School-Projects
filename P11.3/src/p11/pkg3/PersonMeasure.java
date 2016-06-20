/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package p11.pkg3;

/**
 *
 * @author Ben
 */
public class PersonMeasure implements Measurer
{
    public double measure(Object anObject)
    {
        Person aPerson = (Person) anObject;
        double height = aPerson.getHeight();
        return height;
    }
}
