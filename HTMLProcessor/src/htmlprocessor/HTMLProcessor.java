/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package htmlprocessor;
import java.util.Scanner;

/**
 *
 * @author 151146
 */
public class HTMLProcessor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type a string:");
        String s = input.nextLine();
        System.out.println("Finding first tag:");
        System.out.println(HTMLCode.findFirstTag(s));
        System.out.println("Removing selected phrase and printing the rest:");
        System.out.println(HTMLCode.remove(s, "phrase you want deleted"));
        System.out.println("Removing all tags:");
        System.out.println(HTMLCode.removeAllTags(s));
    }
}
