package p18.pkg6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ben
 */
public class DataSet 
{
    private int max = 0;
    private int[] maxArray;
    private int counter = 0;
    
    public DataSet(int[] Array)
    {
        maxArray = Array;
    }
    public int getMaximum()
    {
        this.findMaximum();
        return max;
    }
    public void findMaximum()
    {
        if (counter != maxArray.length - 1)
        {
            if (counter == maxArray.length - 2)
            {
                if (maxArray[counter] > maxArray[counter - 1])
                    if (max < maxArray[counter])
                        max = maxArray[counter];
                else
                    if (max < maxArray[counter - 1])
                        max = maxArray[counter - 1];
            }
            else
            {
                if (maxArray[counter] > maxArray[counter + 1])
                    if (max < maxArray[counter])
                        max = maxArray[counter];
                else
                    if (max < maxArray[counter - 1])
                        max = maxArray[counter - 1];
            }
            counter++;
            this.findMaximum();
        }
        else
             if (max < maxArray[counter])
                 max = maxArray[counter];
    }
}
