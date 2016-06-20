/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package selfdivisor;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 151146
 */
public class SelfDivisor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Please enter a number:");
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        SelfDivisorClass self = new SelfDivisorClass();
        System.out.println("Here are the next 3 self divisors: ");
        System.out.println(Arrays.toString(self.firstSelfDivisor(num, 3)));
    }
}
