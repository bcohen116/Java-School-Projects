/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p4.pkg4;

/**
 *
 * @author Ben
 */
public class Pair 
{
    /**
     * Constructs a pair.
     * @param First the first value of a pair
     * @param Second the second value of a pair
     */
    private double first;
    private double second;
    private double sum;
    private double difference;
    private double product;
    private double average;
    private double distance;
    public Pair()
    {
        
    }
    public Pair(double First, double Second)
    {
        first = First;
        second = Second;
    }
    public double getSum()
    {
        sum = first + second;
        return sum;
    }
    public double getDifference()
    {
        difference = first - second;
        return difference;
        
    }
    public double getProduct()
    {
        product = first * second;
        return product;
    }
    public double getAverage()
    {
        average = (first + second) / 2.0;
        return average;
    }
    public double getDistance()
    {
        distance = Math.abs(first - second);
        return distance;
    }
    public double getMax()
    {
        if (first > second)
        {
            return first;
        }
        else
        {
            return second;
        }
    }
    public double getMin()
    {
                if (first < second)
        {
            return first;
        }
        else
        {
            return second;
        }
    }
}
