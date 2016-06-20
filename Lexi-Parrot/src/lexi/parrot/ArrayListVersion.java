/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lexi.parrot;
import java.util.ArrayList;
/**
 *
 * @author Ben
 */
public class ArrayListVersion 
{        
    private ArrayList<String> newString2 = new ArrayList<String>(); 
    private ArrayList<String> newString = new ArrayList<String>();
    private ArrayList<Boolean> xIsFilled = new ArrayList<Boolean>();
    private void run (ArrayList<String> s)
    {
        int counter = 0;
        int counter2 = 0;
        int a;
        for (int g = 0; g < newString.size(); g++)
        {
             xIsFilled.add(false);
        }
        while (counter2 < 9)
        {
            for (int x = 0; x < newString.size(); x++)
            {
                counter = 0;
                if (!xIsFilled.get(x))
                {
                    for (int y = 0; y < newString.size(); y++)
                    {
                        a = newString.get(x).toUpperCase().compareTo(newString.get(y).toUpperCase());
                        if (a < 0 && x != y)
                        {
                            counter++;
                        }
                        else if (a == 0 && x != y)
                        {
                            a = newString.get(x).compareTo(newString.get(y));
                            if (a < 0 && x != y)
                            {
                                counter++;
                            }
                            else if (a == 0 && !xIsFilled.get(y) && x != y)
                            {
                                counter++;
                            }
                        }
                    }  
                    if (counter >= (newString.size() - 1) - newString2.size())
                    {
                        newString2.add(newString.get(x));
                        counter2++;
                        xIsFilled.set(x, true);
                    }
                }
            }
        }
    }
    public void add(String s)
    {
        newString.add(s);
        if (newString.size() == 10)
            this.run(newString);
    }
    public String print(int printCounter)
    {
        return newString2.get(printCounter);
    }
}
