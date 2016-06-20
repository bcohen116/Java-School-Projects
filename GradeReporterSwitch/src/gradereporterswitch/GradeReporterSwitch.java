/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gradereporterswitch;

/**
 *
 * @author Ben
 */
public class GradeReporterSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double score = 85.89;
        int grade = 1;
        
        if (score >= 90)
            grade = 1;
        else if (score >=80)
            grade = 2;
        else if (score >=70)
            grade = 3;
        else if (score >=60)
            grade = 4;
        else 
            grade = 5;
        
        switch (grade)
        {
            case 1:
                System.out.println("A");
                    break;
            case 2:
                System.out.println("B");
                    break;
            case 3:
                System.out.println("C");
                    break;
            case 4:
                System.out.println("D");
                    break;
            case 5:
                System.out.println("F");
                    break;
            default: 
                System.out.println("Error");
        }
    }
}
