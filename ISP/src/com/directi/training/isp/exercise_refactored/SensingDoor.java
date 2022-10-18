package com.directi.training.isp.exercise_refactored;


public class SensingDoor extends Door
{

    public SensingDoor(Sensor sensor)
    {
        sensor.register(this);
    }

    public void proximityCallback()
    {
        _opened = true;
    }
}
