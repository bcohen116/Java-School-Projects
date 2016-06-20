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
public class NeighborBug extends Bug
{
    public NeighborBug()
    {
        this.setColor(Color.GREEN);
    }
    private boolean hasBeenCounted = false;
    public int countNeighbors()
    {
        uncount();
        hasBeenCounted = true;
        return 1 + helperCountNeighbors(0);
    }
    private int helperCountNeighbors(int index)
    {
        ArrayList<Actor> neighbors = getGrid().getNeighbors(getLocation());
        if (neighbors.size() > 0 && index <= neighbors.size() - 1)
        {
            if(neighbors.get(index) instanceof NeighborBug)
            {
                NeighborBug bug = (NeighborBug) neighbors.get(index);
                if (!bug.hasBeenCounted)   
                {
                    bug.hasBeenCounted = true;
                    return 1 + bug.helperCountNeighbors(0) + helperCountNeighbors(index + 1);
                }
                else
                    return helperCountNeighbors(index + 1);
            }
            else
                return helperCountNeighbors(index + 1);
        }
        else
            return 0;
    }
    private void uncount()
    {
        for (Location x : this.getGrid().getOccupiedLocations())
        {
            if (getGrid().get(x) instanceof NeighborBug)
            {
                NeighborBug y = (NeighborBug) getGrid().get(x);
                y.hasBeenCounted = false;
            }
        }
    }
}
