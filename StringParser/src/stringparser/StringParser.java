/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringparser;
import java.util.Scanner;

/**
 *
 * @author Ben
 */
public class StringParser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Part 1: print name out on seperate lines using substring.
        String name = "Ben E. Cohen";
        System.out.println(name.substring(0, 3));
        System.out.println(name.substring(4, 6));
        System.out.println(name.substring(7));
        
        
        //Part 2: Allow any name to be typed in and put into 3 lines.
      //  Scanner s = new Scanner(System.in);
        //name = s.next(name);
        System.out.println(name.indexOf());
    }
}
