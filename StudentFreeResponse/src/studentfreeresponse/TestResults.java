/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentfreeresponse;
import java.util.ArrayList;

/**
 *
 * @author Ben
 */
public class TestResults 
{
    private ArrayList<StudentAnswerSheet> sheets;
    public String highestScoringStudent (ArrayList<String> key)
    {
        int index = 0;//sheets.get(0).getScore(key);
        int counter = 0;
        for (int x = 0; x < sheets.size(); x++)
        {
            counter = 0;
            for (int y = 0; y < sheets.size(); y++)
            {
                if (sheets.get(x).getScore(key) > sheets.get(y).getScore(key) 
                        && x != y)
                {
                    counter++;
                }
            }
            if (counter == sheets.size() - 1)
            {
                index = x;
            }
        }
        return sheets.get(index).getName();
    }
}
