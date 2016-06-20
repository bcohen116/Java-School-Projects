/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p3.pkg7;

/**
 *
 * @author Ben
 */
public class Student 
{
    private int numberOfQuizzes;
    private double quizScore;
    private double average;
    private String studentName;
    
    public Student()
    {
     
    }
    public Student(String name)
    {
        studentName = name;
    }
    public double addQuiz(int score)
    {
        numberOfQuizzes = (numberOfQuizzes + 1);
        quizScore = (quizScore + score);
        return score;
    }
    public double getTotalScore()
    {
        return quizScore;
    }
    public double getAverageScore()
    {
        average = (quizScore/numberOfQuizzes);
        return average;   
    }
    public String getName()
    {
        return studentName;
    }
}
