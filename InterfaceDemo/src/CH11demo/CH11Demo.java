/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CH11demo;

/**
 *
 * @author 151146
 */
public class CH11Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        final int TRIES = 10;
        DataSet ds = new DataSet();
        for (int i = 1; i <= TRIES; i++)
        {
            Die d = new Die(6);
            int n = d.cast();
            ds.add(d);
            System.out.print(n + " ");
        }
        
        System.out.println("");
        System.out.println("The average is: " + ds.getAverage());
        Measurable m = ds.getMaximum();
        
        Squirrel s = new Squirrel();
        ds.add(s);
        System.out.println("");
        System.out.println("The average AFTER SQUIRREL is: " + ds.getAverage());
        
        Die d1 = (Die) ds.getMaximum();
        //Die d1 = (Die) m;
        
        System.out.println(d1.cast());
        
    }
}
