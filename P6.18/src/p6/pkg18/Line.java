/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p6.pkg18;

/**
 *
 * @author Ben
 */
public class Line 
{
    private int slope;
    private int intercept;
    private int yPoint;
    private int xPoint;
    private boolean isVertical = false;
    private boolean isHorizontal = false;
    
    public Line()
    {
        
    }
    //m = slope
    public Line(int x, int y, int m)
    {
        slope = m;        
        if (slope == 0)
            isHorizontal = true;
        intercept = y - (slope * x);
        yPoint = y;
        xPoint = x;

    }
    public Line(int x1, int y1, int x2, int y2)
    {
        if (x1 == x2)
        {
            isVertical = true;
        }
        if(y1 == y2)
            isHorizontal = true;
        else if (x1 != x2)
        {
        slope = ((y2 - y1)/(x2 - x1));
        }
        intercept = y1 - (slope * x1);
        yPoint = y1;
        xPoint = x1;
    }
    //m = slope, b = y intercept
    public Line(int m, int b)
    {
        slope = m;
        intercept = b;
        yPoint = b;
        xPoint = 0;
        if (slope == 0)
            isHorizontal = true;
    }
    //a = x value that vertical line is on.
    public Line(int a)
    {
        xPoint = a;
        isVertical = true;
    }
    
    public boolean intersects(Line other)
    {        
        if (isParrallel(other))
        {
            return false;
        }
        return true;
    }
    public boolean equals(Line other)
    {
        if(isVertical && other.isVertical && xPoint == other.xPoint)
        {
            return true;
        }
        else if (isHorizontal && other.isHorizontal && yPoint == other.yPoint)
        {
            return true;
        }
        else if(isVertical == false && (yPoint = (slope * xPoint) + intercept) == 
                (other.yPoint = (other.slope * other.xPoint) + other.intercept))
        {
            return true;
        }
        else if (isVertical == false && slope == other.slope && intercept == other.intercept)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isParrallel(Line other)
    {
        if (isHorizontal && other.isHorizontal)
            return true;
        else if(isVertical && other.isVertical)
        {
            return true;
        }
        if (slope != 0 && other.slope != 0 && slope == other.slope)
        {
            return true;
        }
        else
            return false;
    }
}
