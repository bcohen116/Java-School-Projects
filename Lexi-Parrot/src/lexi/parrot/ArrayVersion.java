/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lexi.parrot;

/**
 *
 * @author Ben
 */
public class ArrayVersion 
{        
    private int addCounter = 0;       
    private String[] s1 = new String[10];
    private String[] s2 = new String[10];
    private boolean[] xIsFilled = new boolean[10];
    private void run(String[] s)
    {
        int i;
        int z = 0;
        int counter;
        int counter2 = 0;        
        for (int g = 0; g < s1.length; g++)
        {
            xIsFilled[g] = false;
        }           
        while (counter2 < 9)
        {
            for (int x = 0; x < s1.length; x++, z++)
            {
                counter = 0;
                if (!xIsFilled[x])
                {
                    for (int y = 0; y < s1.length; y++)
                    {
                        i = s1[x].toUpperCase().compareTo(s1[y].toUpperCase());                     
                        if (i < 0 && x != y)
                        {
                            counter++;
                        }
                        else if (i == 0 && x != y)
                        {
                            i = s1[x].compareTo(s1[y]);
                            if (i < 0)
                            {
                              counter++;
                            }
                            else if (i == 0 && !xIsFilled[y])
                            {
                                counter++;
                            }
                        }
                    }          
                    if (counter == (s1.length - 1) - counter2)
                    {
                        s2[counter2] = s1[x];
                        xIsFilled[x] = true;
                        counter2++;
                    }
                }
            }
        }
    }
    public void add(String s)
    {
        s1[addCounter] = s;
        addCounter++;
        if (addCounter == 10)
        {
            this.run(s1);
        }
    }
    public String print(int printCounter)
    {
        return s2[printCounter];
    }
}