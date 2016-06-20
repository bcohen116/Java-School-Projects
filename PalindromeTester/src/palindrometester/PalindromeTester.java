/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindrometester;
import javax.swing.JOptionPane;

/**
 *
 * @author Ben
 */
public class PalindromeTester {
    /**
     * @param args the command line arguments
     */
    private static String text = "";
    
    public static void main(String[] args) 
    {
        String input = JOptionPane.showInputDialog("Enter a String: ");
        text = input;
        System.out.println("Is this a palindrome? " + isPalindrome());
    }
    
    public static boolean isPalindrome()
    {
        return isPalindrome(0, text.length() - 1);
    }
    
    public static boolean isPalindrome(int start, int end)
    {
        if (start >= end)
            return true;
        char first = Character.toLowerCase(text.charAt(start));
        char last = Character.toLowerCase(text.charAt(end));   
        if (Character.isLetter(first) && Character.isLetter(last))
        {
            if (first == last)
            {
                return isPalindrome(start + 1, end - 1);
            }
            else
                return false;
        }
        else if (!Character.isLetter(last))
            return isPalindrome(start, end - 1);
        else
            return isPalindrome(start + 1, end);
    }
}
