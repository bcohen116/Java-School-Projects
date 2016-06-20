/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package timernames;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author 151146
 */
public class TimerNames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        NameListener ml = new NameListener();
        
        String s = "";
        while (!s.equalsIgnoreCase("Q"))
        {
            s = JOptionPane.showInputDialog("Enter a name, press Q when done:");
            if (!s.equalsIgnoreCase("Q"))
            {
                ml.add(s);
            }
        }
        Timer t = new Timer(1000, ml);
        t.start();
        JOptionPane.showMessageDialog(null, "Quit?");
        System.exit(0);
    }
}
