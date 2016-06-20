package studentfreeresponse;
import java.util.ArrayList;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ben
 */
public class StudentAnswerSheet 
{
    private ArrayList<String> answers;
    public double getScore(ArrayList<String> key)
    {
        int correctCounter = 0;
        int wrongCounter = 0;
        for (int x = 0; x < key.size(); x++)
        {
            if (key.get(x).equals(answers.get(x)))
            {
                correctCounter++;
            }
            else if (answers.get(x).equals("?"))
            {
                continue;
            }
            else
            {
                wrongCounter++;
            }
        }
        double sum = (correctCounter * 1) - (wrongCounter * 0.25);
        return sum;
    }
    public String getName()
    {
        return null;
    }
}
