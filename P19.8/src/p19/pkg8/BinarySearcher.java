/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p19.pkg8;

/**
 *
 * @author 151146
 */
public class BinarySearcher 
{
    private int[] a;
    public BinarySearcher(int[] anArray)
    {
        a = anArray;
    }
    public int search(int v)
    {
        int k;
        int low = 0;
        int high = a.length - 1;
        while(low <= high)
        {
            int mid = (low + high) / 2;
            int diff = a[mid] - v;
            if (diff == 0) // a[mid] == v
                return mid;
            else if (diff < 0) // a[mid] < v
                low = mid + 1;
            else
                high = mid - 1;
        }
        k = -low - 1;
        return k;
    }

}
