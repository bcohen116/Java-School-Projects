/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Bug;
import info.gridworld.grid.BoundedGrid;


/**
 *
 * @author 151146
 */
public class FinalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ActorWorld world = new ActorWorld(new BoundedGrid<Actor>(9, 15));
        int[] row0 = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int[] row1 = {8,14};
        int[] row2 = {0,2,3,4,6,8,9,10,11,12,14};
        int[] row3 = {0,2,4,6,12,14};
        int[] row4 = {0,2,4,6,7,8,10,12,14};
        int[] row5 = {0,2,8,12,14};
        int[] row6 = {0,1,2,4,5,6,8,10,11,12,14};
        int[] row7 = {0,6,8,14};
        int[] row8 = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        
        int[][]rows = new int[9][15];
        rows[0] = row0;
        rows[1] = row1;
        rows[2] = row2;
        rows[3] = row3;
        rows[4] = row4;
        rows[5] = row5;
        rows[6] = row6;
        rows[7] = row7;
        rows[8] = row8;
        
        
        
        for(int i = 0; i < 9; i++)
            for(int j = 0; j < rows[i].length;j++ )
            world.add(new Location(i, rows[i][j]), new Rock());
        world.add(new Location(8, 9), new PotOfGold());
        world.add(new MazeExplorer());
        world.show();
    }

}

