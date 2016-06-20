/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

/**
 *
 * @author Ben
 */
public class PalindromeClass 
{
    public PalindromeClass()
    {
        
    }
    public static boolean isNumericPalindrome(int number)
    {
        int fd, ld, num;
        while (number > 0)
        {
            ld = number % 10;
            fd = 0;
            num = number;
                    
            int count = 0;
            while (num > 0)
            {
                count++;
                fd = num;
                num = num / 10;
            }                
            number = ((number - (fd * (int) (Math.pow(10.0, count - 1)))) / 10);
                
            if (fd != ld)
                return false;
         }
         return true;
    }
    public static boolean isNumericPalindrome2(int number)
    {
        String ns = "" + number;
        
        for (int i = 0; i < ns.length(); i++)
        {
            if (ns.length() % 2 == 1 && i == ns.length() / 2)
                return true;
            if (!ns.substring(i, i + 1).equals(ns.substring(ns.length() - 1 - i, ns.length() - i)))
                return false;
        }
        return true;
    }
    public static int firstNumPalidrome(int start)
    {
        while (!isNumericPalindrome(start))
        {
            start++;
        }
        return start;
    }
    public static int firstNumPalidrome2(int start)
    {
        while (!isNumericPalindrome2(start))
        {
            start++;
        }
        return start;
    }
}
