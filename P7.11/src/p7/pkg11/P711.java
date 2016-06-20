/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p7.pkg11;
import java.util.Scanner;

/**
 *
 * @author Ben
 */
public class P711 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Please enter a number:");
        Scanner aScanner = new Scanner(System.in);
        int integer = aScanner.nextInt();
        PrimeGenerator primeGen = new PrimeGenerator(integer);          

        boolean runPrimeDone = false;
        while (!runPrimeDone)
        {
           int primeNumber = primeGen.nextPrime();
           if (primeNumber > integer)
              runPrimeDone = true;
           else
              System.out.println(primeNumber);
        }

      }
}