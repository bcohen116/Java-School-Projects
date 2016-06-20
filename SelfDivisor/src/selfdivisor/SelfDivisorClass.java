/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package selfdivisor;

/**
 *
 * @author 151146
 */
public class SelfDivisorClass 
{
    int num = -1;
    private boolean isSelfDivisor(int y)
    {
        int a = y;
        int length = 0;
        for (;a > 0;)
        {
            a /= 10;
            length++;
        }
        int[] anarray = new int[length];            
        a = y;
        int b;
        for (int z = 0; z < length; z++)
        {
            b = a % 10;
            a /= 10;
            anarray[z] = b;
            if (anarray[z] == 0 || y % anarray[z] != 0)
            {
                return false;
            }
        }
        return true;
    }
    public int[] firstSelfDivisor(int divisor, int amount)
    {
        num++;
        int[] nums2 = new int[amount];
        for (int counter = 0; counter < amount; counter++, divisor++)
        {
            while (!isSelfDivisor(divisor))
            {
                divisor++;
            }
            nums2[counter] = divisor;
        }
        notDone = false;
        return nums2;
    }
    public boolean notDone()
    {
        return notDone;
    }
    private boolean notDone = true;
}
