package com.directi.training.lsp.exercise;

public class ElectronicDuck implements IDuck
{
    private boolean _on = false;

    public void quack() {
        if(_on == false)
        {
            turnOn();
            electronicQuack();
            turnOff();
        }
        else{
            electronicQuack();
        }
    } 
    public void swim() {
        if(_on == false)
        {
            turnOn();
            electronicSwim();
            turnOff();
        }
        else{
            electronicSwim();
        }
    }

    public void electronicQuack()
    {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            throw new RuntimeException("Can't quack when off");
        }
    }

    public void electronicSwim()
    {
        if (_on) {
            System.out.println("Electronic duck swim");
        } else {
            throw new RuntimeException("Can't swim when off");
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
