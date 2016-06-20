/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zbugproject;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;


/**
 *
 * @author 151146
 */
public class ZBugProject 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ActorWorld world = new ActorWorld();
        world.add(new ZBug(2));
        world.add(new Rock());
        world.show();
    }
}
