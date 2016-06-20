/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spiralbugproject;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 *
 * @author 151146
 */
public class SpiralBugProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ActorWorld world = new ActorWorld();
        SpiralBug alice = new SpiralBug(5);
        alice.setColor(Color.ORANGE);
        world.add(new Location(7, 8), alice);
        world.show();
    }
}
