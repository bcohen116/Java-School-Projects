/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8.pkg10;
import java.util.ArrayList;

/**
 *
 * @author Ben
 */
public class AlternatingSum 
{
    public int add(ArrayList<Integer> arrayList)
    {
        int[] anArray = new int[arrayList.size()];
        int a = 0;
        for (int x : arrayList)
        {
            anArray[a] = x;
            a++;
        }
        int sum = 0;
        boolean isAdding = true;
        for (int x : anArray)
        {
            if (isAdding == true)
            {
                sum += x;
                isAdding = false;
            }
            else
            {
                sum -= x;
                isAdding = true;
            }
        }
        return sum;
    }
}

