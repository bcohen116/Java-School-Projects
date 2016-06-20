package com.Alarm_Clock;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main);
        TextView text = new TextView(this);
        text.setText("Hello World, Android");
        setContentView(text);
        AlarmClock a = new AlarmClock();
        a.runClock();
    }
}
