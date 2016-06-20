/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boxbug;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 *
 * @author 151146
 */
public class CircleBugProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ActorWorld world = new ActorWorld();
        CircleBug alice = new CircleBug(6);
        alice.setColor(Color.ORANGE);
        CircleBug bob = new CircleBug(3);
        world.add(new Location(9, 8), alice);
        world.add(new Location(7, 5), bob);
        world.show();
    }
}
