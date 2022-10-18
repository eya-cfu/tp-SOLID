package com.directi.training.lsp.exercise_refactored;

public class ElectronicDuck implements IDuck
{
    private boolean _on = false;

    @Override
    public void quack() throws IDuckException
    {
        if (_on) {
            System.out.println("Electronic duck quack");
        } else {
            throw new IDuckException("Can't quack when off");
        }
    }

    @Override
    public void swim() throws IDuckException
    {
        if (_on) {
            System.out.println("Electronic duck swim");
        } else {
            throw new IDuckException("Cant swim when off");
        }
    }

    public void turnOn()
    {
        _on = true;
    }

    public void turnOff()
    {
        _on = false;
    }


}
