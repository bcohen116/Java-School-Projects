/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lexi.parrot;
import java.util.Scanner;

/**
 *
 * @author 151146
 */
public class LexiParrot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        ArrayVersion arrayObject = new ArrayVersion();
        ArrayListVersion arrayListObject = new ArrayListVersion();
        String s = "";
        int counter = 0;
        while (counter < 10)
        {
            System.out.println("Please enter string " + (counter + 1) + ": ");
            s = input.next();
            arrayObject.add(s);
            arrayListObject.add(s);
            counter++;
        }
        boolean arrayIsRunning = true;
        boolean arrayListIsRunning = true;
        int printCounter = 0;
        System.out.println("Here is your list in alphabetical order using arrays: ");
        while (arrayIsRunning)
        {
            System.out.println(arrayObject.print(printCounter));
            printCounter++;
            if (printCounter == 10)
                arrayIsRunning = false;
        }
        System.out.println("Here is your list in alphabetical order using array lists: ");
        printCounter = 0;
        while (arrayListIsRunning)
        {
            System.out.println(arrayListObject.print(printCounter));
            printCounter++;
            if (printCounter == 10)
                arrayListIsRunning = false;
        }
    }
}
