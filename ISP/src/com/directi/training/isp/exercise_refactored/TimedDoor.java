package com.directi.training.isp.exercise_refactored;

public class TimedDoor extends Door
{
    private static final int TIME_OUT = 100;

    public TimedDoor(Timer timer)
    {
        timer.register(TIME_OUT, this);
    }

    public void timeOutCallback()
    {
        _locked = true;
    }   
}
