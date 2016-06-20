/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bugs;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.*;
import java.util.*;

/**
 *
 * @author 151146
 */
public class TunnelBug extends NeighborBug
{
    public TunnelBug()
    {
        this.setColor(Color.cyan);
    }
    public void act()
    {
        if (canMove())
            move();
        else
        {
            //checks to see if the bug is up against and facing a wall.
            if ((this.getLocation().getRow() == 0 && 
                        (this.getDirection() == Location.NORTH || 
                        this.getDirection() == Location.NORTHEAST || 
                        this.getDirection() == Location.NORTHWEST)) || 
                    (this.getLocation().getRow() == this.getGrid().getNumRows() - 1 &&
                        (this.getDirection() == Location.SOUTH || 
                        this.getDirection() == Location.SOUTHEAST || 
                        this.getDirection() == Location.SOUTHWEST)) ||
                    (this.getLocation().getCol() == 0 &&
                        (this.getDirection() == Location.WEST || 
                        this.getDirection() == Location.SOUTHWEST || 
                        this.getDirection() == Location.NORTHWEST)) ||
                    (this.getLocation().getCol() == this.getGrid().getNumCols() - 1 &&
                        (this.getDirection() == Location.EAST || 
                        this.getDirection() == Location.NORTHEAST || 
                        this.getDirection() == Location.SOUTHEAST)))
            {
                turn();
            }
            else
            {
                Location l = new Location(this.getLocation().getRow(), this.getLocation().getCol());
                Location l2 = l;
                if (this.getDirection() == Location.NORTH)
                {
                    l = new Location(this.getLocation().getRow() - 2, this.getLocation().getCol());
                }                
                else if (this.getDirection() == Location.SOUTH)
                {
                    l = new Location(this.getLocation().getRow() + 2, this.getLocation().getCol());
                }
                else if (this.getDirection() == Location.EAST)
                {
                    l = new Location(this.getLocation().getRow(), this.getLocation().getCol() + 2);
                }                
                else if (this.getDirection() == Location.WEST)
                {
                    l = new Location(this.getLocation().getRow(), this.getLocation().getCol() - 2);
                }
                else if (this.getDirection() == Location.NORTHEAST)
                {
                    l = new Location(this.getLocation().getRow() - 2, this.getLocation().getCol() + 2);
                }                
                else if (this.getDirection() == Location.NORTHWEST)
                {
                    l = new Location(this.getLocation().getRow() - 2, this.getLocation().getCol() - 2);
                }
                else if (this.getDirection() == Location.SOUTHEAST)
                {
                    l = new Location(this.getLocation().getRow() + 2, this.getLocation().getCol() + 2);
                }
                else
                {
                    l = new Location(this.getLocation().getRow() + 2, this.getLocation().getCol() - 2);
                }
                if (this.getGrid().isValid(l))
                {
                    Actor a = this.getGrid().get(l);
                    if (this.getGrid().isValid(l) && (this.getGrid().get(l) == null || a instanceof Flower))
                    {
                        this.moveTo(l);                
                        Flower f = new Flower(this.getColor());
                        f.putSelfInGrid(this.getGrid(), l2);
                    }
                    else
                        turn();     
                }
                else
                    turn();

            }
        }
    }
}
