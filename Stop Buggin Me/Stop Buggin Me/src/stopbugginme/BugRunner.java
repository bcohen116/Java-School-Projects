package stopbugginme;
/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;

import info.gridworld.actor.Actor;
import java.util.*;
import java.awt.*;

/**
 * This class runs a world that contains a bug and a rock, added at random
 * locations. Click on empty locations to add additional actors. Click on
 * populated locations to invoke methods on their occupants. <br />
 * To build your own worlds, define your own actors and a runner class. See the
 * BoxBugRunner (in the boxBug folder) for an example. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class BugRunner
{
    public static void main(String[] args)
    {
        ArrayList <Actor> bugs = new ArrayList <Actor>();
        Random rand = new Random();
        final int MAX_OBJECTS = 40;
        
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
