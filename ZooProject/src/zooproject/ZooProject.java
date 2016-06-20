/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zooproject;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 151146
 */
public class ZooProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ArrayList<Speakable> zoo = new ArrayList<Speakable>();
        for (int x = 0; x < 5; x++)
        {
            String ans = JOptionPane.showInputDialog("Create a Dog(1), Cow(2), Squirrel(3)?");
            if (ans.equals("1"))
                zoo.add(new Dog());
            else if (ans.equals("2"))
                zoo.add(new Cow());
            else if (ans.equals("3"))
                zoo.add(new Squirrel());
        }
        for (Speakable A : zoo)
        {
            System.out.println(A.speakBoy());
        }
    }
}
