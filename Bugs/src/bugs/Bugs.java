/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bugs;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;

import info.gridworld.actor.Actor;
import java.util.*;
import java.awt.*;

/**
 *
 * @author 151146
 */
public class Bugs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ArrayList <Actor> bugs = new ArrayList <Actor>();
        Random rand = new Random();
        final int MAX_OBJECTS = 50;
        
        ActorWorld world = new ActorWorld();
        
        for (int i = 0; i < rand.nextInt(MAX_OBJECTS); i++)
        {
            bugs.add(new Rock());
        }
        
        for (int i = 0; i < rand.nextInt(MAX_OBJECTS); i++)
        {
            bugs.add(new NeighborBug());
        }
        
        for (int i = 0; i < rand.nextInt(MAX_OBJECTS); i++)
        {
            bugs.add(new ButtBug());
        }
        
        for (int i = 0; i < rand.nextInt(MAX_OBJECTS); i++)
        {
            bugs.add(new TunnelBug());
        }
        
        for (Actor b: bugs)
        {
            world.add(b);
        }
        
        Color myColor;
        
        for (Actor b: bugs)
           {
               myColor = b.getColor();
               b.setColor(new Color((myColor.getRed() + 100) % 256, myColor.getGreen(), myColor.getBlue()));
           }
        
        world.show();
    }
}
