/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package critters;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

import java.util.ArrayList;

/**
 *
 * @author 151146
 */
public class AttractiveCritter extends Critter
{
    public void processActors(ArrayList<Actor> actors)
    {
        ArrayList<Location> occupied = getGrid().getOccupiedLocations();
        actors = new ArrayList<Actor>();
        for (Location x : occupied)
        {
            if (x != getLocation())
                actors.add(getGrid().get(x));
        }
        for (Actor a : actors)
        {   
            Location loc = a.getLocation();
            int i = loc.getDirectionToward(this.getLocation());       
            if (i == 0 || i == 360)
            {
                loc = new Location(a.getLocation().getRow() + 1, a.getLocation().getCol() + 1);
            }
            else if (i == 45)
            {
                loc = new Location(a.getLocation().getRow() - 1, a.getLocation().getCol() + 1);
            }
            else if (i == 90)
            {
                loc = new Location(a.getLocation().getRow(), a.getLocation().getCol() + 1);
            }
            else if (i == 135)
            {
                loc = new Location(a.getLocation().getRow() + 1, a.getLocation().getCol() + 1);
            }
            else if (i == 180)
            {
                loc = new Location(a.getLocation().getRow() - 1, a.getLocation().getCol());
            }
            else if (i == 225)
            {
                loc = new Location(a.getLocation().getRow() - 1, a.getLocation().getCol() - 1);
            }
            else if (i == 270)
            {
                loc = new Location(a.getLocation().getRow(), a.getLocation().getCol() - 1);
            }
            else
            {
                loc = new Location(a.getLocation().getRow() + 1, a.getLocation().getCol() - 1);
            }
            if ((getGrid().get(loc) == null))
            {
                a.moveTo(loc);
            }
        }
    }
}
