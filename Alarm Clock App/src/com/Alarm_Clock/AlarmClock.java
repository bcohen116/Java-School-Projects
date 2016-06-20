/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Alarm_Clock;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Ben
 */
public class AlarmClock extends Activity
{
    @Override
    public void onCreate(Bundle icicle) 
    {
        super.onCreate(icicle);
        TextView text = new TextView(this);
        text.setText("Alarm Clock");
        setContentView(text);
        AlarmClock a = new AlarmClock();
        a.runClock();
    }
    private int hour = 12;
    private int minute = 0;
    private boolean amPm = true; //True = am, False = pm

    private int aHour = 12;
    private int aMinute = 0;
    private boolean aAmPm = true; //True = am, False = pm
    private boolean onOff = true; //True = on, False = off
    
    Runnable r = new Runnable()
    {
        public void run() 
        {
            modTime();
        }
    };
    
    private void modTime()
    {
        minute += 1;
        if (minute == 60)
        {
            if (hour == 12)
            {
                hour = 1;
                amPm = !amPm;
            }
            else
                hour += 1;
            minute = 0;
        }
        if (hour == aHour && minute == aMinute && aAmPm == amPm)
            activateAlarm();
        System.out.println("" + toString());
    }

    private void activateAlarm()
    {
        //use enrique's method to play a playlist here.
        System.out.println("Wake Up!");
    }

    public void runClock()
    {
        System.out.println("" + toString());
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(r, 1, 1, TimeUnit.MINUTES);
    }
    
    /**Sets the time for the clock. Enter in the format: hr, min, am(true)/pm(false).*/
    public void setTime(int pHour, int pMinute, boolean pAmPm)
    {
        hour = pHour;
        minute = pMinute;
        amPm = pAmPm;
    }

    /**Sets the time for the alarm to activate. Enter in the format: hr, min, am(true)/pm(false).*/
    public void setAlarm(int pHour, int pMinute, boolean pAmPm)
    {
        aHour = pHour;
        aMinute = pMinute;
        aAmPm = pAmPm;
    }

    /** Enter true to turn the alarm on and false to turn the alarm off.*/
    public void toggleAlarm(boolean pOnOff)
    {
        //use to stop music after alarm activates as well as when they press
            //the on/off button in GUI interface.
        onOff = pOnOff;
    }
    
    private int getHr()
    {
        return hour;
    }
    
    private String getMin()
    {
        if (minute < 10)
            return "0" + minute;
        return "" + minute;
    }
    
    private String getAmPm()
    {
        if (amPm)
            return "am";
        return "pm";
    }
    
    public String toString()
    {
        return "" + getHr() + " : " + getMin() + " " + getAmPm();
    }
    
    private int getaHr()
    {
        return aHour;
    }
    
    private String getaMin()
    {
        if (aMinute < 10)
            return "0" + aMinute;
        return "" + aMinute;
    }
    
    private String getaAmPm()
    {
        if (aAmPm)
            return "am";
        return "pm";
    }
    
    public String getAlarm()
    {
        return "" + getaHr() + " : " + getaMin() + " " + getaAmPm();
    }
}
