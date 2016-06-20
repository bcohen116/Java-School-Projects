/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8.pkg10;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Ben
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("When you are done, type 0. Please enter sum numbers you want added:");
        int num = 1;
        int[] nums;
        ArrayList<Integer> number = new ArrayList<Integer>();
        while (num > 0)
        {
            num = input.nextInt();
            number.add(num);
        }
        AlternatingSum aSumOfNumbers = new AlternatingSum();
        System.out.println("Your result is: " + aSumOfNumbers.add(number));
    }
}
