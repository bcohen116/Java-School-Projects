/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

/**
 *
 * @author Ben
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        PalindromeClass palindrome = new PalindromeClass();
        System.out.println(PalindromeClass.isNumericPalindrome(12));
        System.out.println(PalindromeClass.isNumericPalindrome2(12));
        System.out.println(PalindromeClass.firstNumPalidrome(12));
        System.out.println(PalindromeClass.firstNumPalidrome2(12));
    }
}
