/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package timerdemo;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author 151146
 */
public class MyListener implements ActionListener
{
    private int count = 0;
    public MyListener(int start)
    {
        count = start;
    }
    public void actionPerformed(ActionEvent event)
    {
        System.out.println(count++);
    }
}
