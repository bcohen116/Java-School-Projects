/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package p18.pkg1;

/**
 *
 * @author Ben
 */
public class Sentence 
{
    private String text;
    private int counter;
    private String temp = "";
    
    public Sentence(String input)
    {
        text = input;
        counter = text.length();
    }
    public String getText()
    {
        return text;
    }
    public void Reverse()
    {
        if (counter != 0)
        {
            temp = text.substring(0, 1) + temp;
            text = text.substring(1);
            counter--;
            this.Reverse();
        }
        else
            text = text + temp;
    }
}
