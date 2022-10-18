package com.directi.training.isp.exercise_refactored;

public class Door
{
    boolean _locked;
    boolean _opened;

    public void lock()
    {
        _locked = true;
    }

    public void unlock()
    {
        _locked = false;
    }

    public void open()
    {
        if (!_locked) {
            _opened = true;
        }
    }

    public void close()
    {
        _opened = false;
    }
}
