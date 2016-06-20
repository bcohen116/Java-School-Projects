/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentfreeresponse;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ben
 */
public class StudentFreeResponse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> key = new ArrayList<String>();
        TestResults test1 = new TestResults();
        String s = "";
        System.out.println("Enter the answer key. Type done when you are done:");
        while (!s.equals("done"))
        {
            s = input.next();
            key.add(s);
        }
        test1.highestScoringStudent(key);
    }
}
