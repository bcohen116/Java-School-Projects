/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dancingbug;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
/**
 *
 * @author 151146
 */
public class DancingBugProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int[] num = {1,2,3,4,5};
        ActorWorld world = new ActorWorld();
        world.add(new DancingBug(num));
        world.add(new Rock());
        world.show();
    }
}
