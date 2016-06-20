/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package critters;
import info.gridworld.actor.*;
import info.gridworld.grid.*;
import info.gridworld.world.World;

/**
 *
 * @author 151146
 */
public class Critters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ActorWorld world = new ActorWorld(new UnboundedGrid<Actor>());
        world.add(new Location(17,17), new AttractiveCritter());
        for (int i = 12; i < 22; i++)
            world.add(new Location(12, i), new Rock());
        for (int i = 12; i < 22; i++)
            world.add(new Location(i, 12), new Rock());
        for (int i = 12; i < 22; i++)
            world.add(new Location(i, 22), new Rock());
        for (int i = 12; i <= 22; i++)
            world.add(new Location(22, i), new Rock());
        world.show();
    }
}
