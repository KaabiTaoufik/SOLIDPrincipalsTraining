package com.directi.training.ocp.exercise;

public abstract class Slot
{
    public abstract Slot findFree();
    public abstract void markBusy();
    public abstract void markFree();
}
