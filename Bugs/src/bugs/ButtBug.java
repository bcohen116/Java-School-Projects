/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bugs;
import info.gridworld.actor.Bug;
import java.awt.*;

/**
 *
 * @author 151146
 */
public class ButtBug extends NeighborBug
{
    public ButtBug()
    {
        this.setColor(Color.BLUE);
    }
    public void act()
    {
            turn();
            turn();
            turn();
            turn();
            if (this.canMove())
                move();
            else
                turn();
            turn();
            turn();
            turn();
            turn();
    }
}
