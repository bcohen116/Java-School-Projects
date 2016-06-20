/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import java.util.*;
import java.awt.*;
import javax.swing.JOptionPane;

/**
 *
 * @author 151146
 */
public class MazeExplorer extends Bug //AKA BeeBug
{
    private boolean foundGold = false;
    private int steps = 0;
    public int getStepsTaken()
    {
        return steps;
    }
    public void act()
    {        
        int counter = 0;
        ArrayList<Location> neighborLocations = getGrid().getValidAdjacentLocations(getLocation());
        for (Location z : neighborLocations)
        {
            if (!(getGrid().get(z) instanceof PotOfGold))
                counter++;
            else
            {
                if (getLocation().getDirectionToward(z) % 90 != 0)
                    counter++;
            }
        }
        if (counter == neighborLocations.size())
        {
            if (getGrid().isValid(getLocation().getAdjacentLocation(getDirection() - 90)) &&
                    getGrid().isValid(getLocation().getAdjacentLocation(getDirection())))
            {
                if (getGrid().get(getLocation().getAdjacentLocation(getDirection() - 90)) == null)
                {
                    setDirection(getDirection() - 90);
                    move();
                    steps++;
                }
                else
                {
                    if (getGrid().get(getLocation().getAdjacentLocation(getDirection())) instanceof Flower && 
                            getGrid().get(getLocation().getAdjacentLocation(getDirection() - 90)) instanceof Flower &&
                            getGrid().get(getLocation().getAdjacentLocation(getDirection() + 180)) instanceof Flower)
                    {
                        if (getDirection() == 0)
                        {
                            move();
                            steps++;
                        }
                        else
                        {
                            setDirection(getDirection() - 90);
                            move();
                            steps++;
                        }
                    }
                    else if (getGrid().get(getLocation().getAdjacentLocation(getDirection())) instanceof Flower && 
                            getGrid().get(getLocation().getAdjacentLocation(getDirection() - 90)) instanceof Flower)
                    {
                        move();
                        steps++;
                    }
                    else if (getGrid().isValid(getLocation().getAdjacentLocation(getDirection() + 90))
                            && getGrid().get(getLocation().getAdjacentLocation(getDirection() + 90)) instanceof Flower && 
                            getGrid().get(getLocation().getAdjacentLocation(getDirection() - 90)) instanceof Flower)
                    {
                        setDirection(getDirection() - 90);
                        move();
                        steps++;
                    }
                    else
                    {
                        if (canMove())
                        {
                            move();
                            steps++;
                        }
                        else
                        {
                            if (getGrid().get(getLocation().getAdjacentLocation(getDirection() + 180)) instanceof Flower && 
                                getGrid().get(getLocation().getAdjacentLocation(getDirection() + 90)) instanceof Flower &&
                                !(getGrid().get(getLocation().getAdjacentLocation(getDirection() - 90)) instanceof Flower) &&
                                !(getGrid().get(getLocation().getAdjacentLocation(getDirection())) instanceof Flower))
                                    setDirection(getDirection() + 90);
                            else
                                setDirection(getDirection() - 90);
                        }
                    }
                }
            }
            else
            {
                if (getGrid().isValid(getLocation().getAdjacentLocation(getDirection())) && 
                        (getGrid().get(getLocation().getAdjacentLocation(getDirection())) instanceof Flower
                        || getGrid().get(getLocation().getAdjacentLocation(getDirection())) == null))
                {
                    move();
                    steps++;
                }
                else
                    setDirection(getDirection() - 90);
            }
        }
        else
        {
            if (!foundGold)
            {
                JOptionPane.showMessageDialog(null, "You found the Gold!");
                foundGold = true;
            }
        }
    }
}
