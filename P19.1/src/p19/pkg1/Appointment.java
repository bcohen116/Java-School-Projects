/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p19.pkg1;

/**
 *
 * @author 151146
 */
public class Appointment 
{
    private String description;
    private String month;
    private int day;
    private int startHours;
    private int startMinutes;
    private int endHours;
    private int endMinutes;
    public Appointment(String pDescription, String pMonth, int pDay, int pStartHours, int pStartMinutes, String pFirstTimeOfDay, int pEndHours, int pEndMinutes)
    {
        description = pDescription;
        month = pMonth;
        day = pDay;
        startHours = pStartHours;
        startMinutes = pStartMinutes;
        endHours = pEndHours;
        endMinutes = pEndMinutes;
    }
    public String getStartTime()
    {
        return startHours + ":" + startMinutes;
    }
    public String getEndTime()
    {
        return endHours + ":" + endMinutes;
    }
    public String getDate()
    {
        return month + day;
    }
    public boolean checkAvailability(Appointment other)
    {
        // does not work because if the time is inbetween these times, it won't check for it.
        if (this.getStartTime().equals(other.getStartTime()) && this.getDate().equals(other.getDate())
                && this.getEndTime().equals(other.getEndTime()))
            return false;
        return true;
    }
}
