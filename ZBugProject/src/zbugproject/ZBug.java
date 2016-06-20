/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zbugproject;
import info.gridworld.actor.Bug;
/**
 *
 * @author 151146
 */
public class ZBug extends Bug
{
    private int steps;
    private int sideLength;
    private int counter = 0;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public ZBug(int length)
    {
        steps = 0;
        sideLength = length;
        turn();
        turn();
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if (steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        else if (!canMove() && steps != sideLength)
        {
            
        }
        else
        {
            if (counter == 0)
            {
                turn();
                turn();
                turn();
                steps = 0;
                counter++;
            }
            else if (counter == 1)
            {
                turn();
                turn();
                turn();
                turn();
                turn();
                steps = 0;
                counter++;
            }
            else
            {
                
            }
        }
    }
}
