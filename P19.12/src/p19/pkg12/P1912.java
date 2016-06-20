/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p19.pkg12;
import java.util.Arrays;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author 151146
 */
public class P1912 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Type how many people you want to enter: ");
        int x = input.nextInt();
        Person[] pArray = new Person[x];
        for (int i = 0; i < x; i++)
        {
            System.out.println("Enter name # " + (i + 1) + ": ");
            Person p = new Person(input.next());
            pArray[i] = p;
        }
        System.out.println();
        for (Person y : pArray)
            System.out.println(y.getName());
        System.out.println();
        System.out.println("Here are the first and last people:");
        Arrays.sort(pArray);
//        if (pArray[0].compareTo(pArray[pArray.length - 1]) <= 0)
//        {
            System.out.println("" + pArray[0].getName());
            System.out.println("" + pArray[pArray.length - 1].getName());
//        }
//        else
//        {
//            System.out.println("" + pArray[pArray.length - 1].getName());
//            System.out.println("" + pArray[0].getName());
//        }
        
    }
}
