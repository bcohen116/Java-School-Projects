/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package timernames;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 *
 * @author 151146
 */
public class NameListener implements ActionListener
{
    private ArrayList<String> names = new ArrayList<String>();
    private int counter = 0;
    public void add(String name)
    {
        names.add(name);
    }
    public void actionPerformed(ActionEvent event)
    {
        System.out.println(names.get(counter));
        counter++;
        if (counter == names.size())
            counter = 0;
    }
}
