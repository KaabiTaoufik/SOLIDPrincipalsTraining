package com.directi.training.ocp.exercise;

public class ResourceAllocator
{

    public Slot allocate(Slot slot)
    {
        slot = slot.findFree();
        slot.markBusy();
        return slot;
    }

    public void free(Slot slot)
    {
        if(slot != null){
            slot.markFree();
        }
        else{
            System.out.println("ERROR: Attempted to free inexistant resource");
        }
    }

    private SpaceSlot findFreeSpaceSlot()
    {
        return new SpaceSlot();
    }

    private TimeSlot findFreeTimeSlot()
    {
        return new TimeSlot();
    }
}
