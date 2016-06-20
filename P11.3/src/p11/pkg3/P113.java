/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p11.pkg3;
import java.util.Scanner;

/**
 *
 * @author 151146
 */
public class P113 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Measurer m = new PersonMeasure();
        DataSet data = new DataSet(m);
        
        //makes 10 people
        for (int counter = 0; counter < 3; counter++)
        {
            System.out.println("Please enter the name of the person, "
                    + "press enter, and then enter the height of the person: ");
            System.out.println("Person #" + (counter + 1) + ": ");
            Person human = new Person(input.next(), input.nextInt());
            data.add(human);
        }
        System.out.println("The avarage height is: " + data.getAverage());
        Person guy = (Person) data.getMaximum();
        System.out.println("The tallest person is: " + guy.getName());
    }
}
