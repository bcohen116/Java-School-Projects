/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p7.pkg10;
import java.util.Scanner;

/**
 *
 * @author 151146
 */
public class P710 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {       
        System.out.println("Please enter a number:");
        Scanner input = new Scanner(System.in);
        
        int input2;
        input2 = input.nextInt();
        FactorGenerator factor = new FactorGenerator(input2);
     
            
            while (factor.hasMoreFactors())
            {
                System.out.println(factor.nextFactor());            
            }
        
    }
}
