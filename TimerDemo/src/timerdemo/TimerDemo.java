/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package timerdemo;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author 151146
 */
public class TimerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        MyListener ml = new MyListener(77);
        
        Timer t = new Timer(1000, ml);
        t.start();
        JOptionPane.showMessageDialog(null, "Quit?");
        System.exit(0);
    }
}
