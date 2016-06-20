/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dancingbug;
import info.gridworld.actor.Bug;

/**
 *
 * @author 151146
 */
public class DancingBug extends Bug
{
    private int steps;
    private int sideLength;
    private int[] nums;
    private int counter = 0;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public DancingBug(int[] num)
    {
        nums = num;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        for (int x: nums)
        {
            while (counter < x)
            {
                turn();
                counter++;
            }
            if (canMove())
                move();
            else
                turn();
            
        }
    }
}
