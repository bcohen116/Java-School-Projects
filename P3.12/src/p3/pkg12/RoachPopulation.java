/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p3.pkg12;

/**
 *
 * @author Ben
 */
public class RoachPopulation 
{
    private double population;
    
    public RoachPopulation(int initialPopulation)
    {
        population = initialPopulation;
    }
    public void waitForDoubling()
    {
        population = (population * 2);
    }
    public void spray()
    {
        population = (int)(population - ((population / 10)));
    }
    public double getRoaches()
    {
        return population;
    }
}
