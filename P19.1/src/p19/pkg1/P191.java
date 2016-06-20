/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p19.pkg1;
import javax.swing.JOptionPane;

/**
 *
 * @author 151146
 */
public class P191 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Appointment goToClass = new Appointment("Go to class!", "May", 10, 1, 00, 2, 00);
        Appointment finishPrograms = new Appointment("Finish p19.1!", "May", 10, 12, 30, 1, 30);
        System.out.println("Class starts at: " + goToClass.getStartTime());
        System.out.println("Finish your programs by: " + finishPrograms.getStartTime());
        
            
    }
}
