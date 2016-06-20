/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p3.pkg7;

/**
 *
 * @author Ben
 */
public class P37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Student student1 = new Student("Ben");
        student1.addQuiz(85);
        student1.addQuiz(96);
        student1.addQuiz(84);
        System.out.println("Hello, " + student1.getName() + ". Your average score is " + student1.getAverageScore());
    }
}
