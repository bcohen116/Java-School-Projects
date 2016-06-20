/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fibonaccinumber;

/**
 *
 * @author Ben
 */
public class FibonacciNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int n = 5;
        for (int i = 0; i <= n; i++)
        {
            long f = fib(i);
            System.out.println("fib(" + i + ") = " + f);
        }
        System.out.println("Counter: " + (counter));
    }
    public static int counter = 0;
    public static long fib(int n)
    {
        counter++;
        if (n <=2)
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }
}
