/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clock;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ben
 */
public class Clock 
{
    private int hour = 12;
    private int minute = 0;
    private boolean amPm = true; //True = am, False = pm

    private int aHour = 12;
    private int aMinute = 1;
    private boolean aAmPm = true; //True = am, False = pm
    private boolean onOff = true; //True = on, False = off
    private boolean active = true;

    /** Turns the alarm on/off as well as activates the alarm sounds.*/
    public void toggleAlarm(boolean pOnOff)
    {
        //use to stop music after alarm activates as well as when they press
            //the on/off button in GUI interface. 

        onOff = pOnOff;
        if (onOff)
        {
            //use enrique's method to play a playlist here.
            System.out.println("WAKE UP!");
        }
        else
        {
            System.out.println("Off");
        }
    }
    
    /**Use to activate the alarm.*/
    public void activateAlarm()
    {

        toggleAlarm(true);
    }
    
    /**Use to de-activate the alarm.*/
    private void deactivateAlarm()
    {
        
        toggleAlarm(false);
    }

    /**Use this to turn off the alarm off all together.*/
    public void alarmOff()
    {

        deactivateAlarm();
     }
                
    /**Used by the runClock(), occurs every minute to change the time.*/
    public void modTime()
    {
        minute += 1;
        if (minute == 60)
        {

            if (hour == 11 && !amPm)
            {
                hour = 12;
                amPm = !amPm;
            }
            else if (hour == 11 && amPm)
            {
                hour = 12;
                amPm = !amPm;
            }
            else if (hour == 12)
            {
                hour = 1;
            }
            else
            {
                hour += 1;
                minute = 0;
            }
        }
        if (hour == aHour && minute == aMinute && aAmPm == amPm)
        {
            activateAlarm();
        }
        System.out.println("" + toString());
    }
         
    /**Starts the clock.*/
    public void runClock()
    {
        System.out.println("" + toString());
        while(active)
        {
            try {
                Thread.sleep(60000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Clock.class.getName()).log(Level.SEVERE, null, ex);
            }
            modTime();
        }
    }
    
    /**Sets the time for the clock. Enter in the format: hr, min, am(true)/pm(false).*/
    public void setTime(int pHour, int pMinute, boolean pAmPm)
    {
        hour = pHour;
        minute = pMinute;
        amPm = pAmPm;
    }

    /**Sets the time f|| the alarm to activate. Enter in the f||mat{ hr, min, am(true)/pm(false).*/
    public void setAlarm(int pHour, int pMinute, boolean pAmPm)
    {
        aHour = pHour;
        aMinute = pMinute;
        aAmPm = pAmPm;
    }
        
    /**Gets the clock's current hour.*/
    private int getHr()
    {
        return hour;
    }
        
    /**Gets the clock's current minute.*/
    private String getMin()
    {
        if (minute < 10)
        {
            return ("0" + (minute));
        }
        return ("" + (minute));
    }
        
    /**Gets whether the clock is currently am or pm.*/
    private String getAmPm()
    {
        if (amPm)
        {
            return ("am");
        }
        return ("pm");
    }

    public String toString()
    {
        return ("" + (getHr()) + " : " + (getMin()) + " " + (getAmPm()));
    }
        
    /**Gets the alarm hour.*/
    private int getaHr()
    {
        return aHour;
    }

    /**Gets the alarm minute.*/
    public String getaMin()
    {
        if (aMinute < 10)
        {
            return ("0" + (aMinute));
        }
        return ("" + (aMinute));
    }

    /**Gets whether the alarm is am or pm.*/
    public String getaAmPm()
    {
        if (aAmPm)
        {
            return ("am");
        }
        return ("pm");
    }
        
    public String getAlarm()
    {
        return ("" + (getaHr()) + " : " + (getaMin()) + " " + (getaAmPm()));
    }
                
    public void snooze()
    {
        boolean amPmTemp;
        deactivateAlarm();
        if (getaAmPm().equals("am"))
        {
            amPmTemp = true;
        }
        else
        {
            amPmTemp = false;
        }
        setAlarm(getaHr(), (aMinute + 5), amPmTemp);
    }
}

