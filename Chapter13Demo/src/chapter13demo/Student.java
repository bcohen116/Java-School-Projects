/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapter13demo;

/**
 *
 * @author Ben
 */
public class Student extends Teenager
{
    private int grade;
    private double GPA;
    public Student()
    {
        grade = 0;
        GPA = 0;
    }
    public Student(int gradeLevel, double gradePointAverage)
    {
        grade = gradeLevel;
        GPA = gradePointAverage;
    }
    public Student(int gradeLevel, double gradePointAverage, boolean s, boolean l)
    {
        super(s, l);
        grade = gradeLevel;
        GPA = gradePointAverage;
    }
    public Student(int gradeLevel, double gradePointAverage, boolean s, 
            boolean l, String n, int a, boolean g)
    {
        super(s, l, n, a, g);
        grade = gradeLevel;
        GPA = gradePointAverage;
    }
    public double getGPA()
    {
        return GPA;
    }
    public int getGrade()
    {
        return grade;
    }
    public String toString()
    {
        return "Student = GPA: " + this.getGPA() + "   Grade Level: " + this.getGrade();
    }
}
