package edu.htc.blitstein.caih313.tddstack.engine;

import edu.htc.blitstein.caih313.tddstack.IStackable;

public class TddStack implements IStackable {
    static final int DEFAULT_DEPTH = 100;
    int stackDepth;
    private static int counter = -1;
   public IStackable[] stackArray;
   private int currentOccupancy;

    public TddStack() {
        this(DEFAULT_DEPTH);
    }

    TddStack(int stackDepth) {
        this.stackDepth = stackDepth;
        stackArray = new IStackable[stackDepth];
        currentOccupancy = -1;
    }

    boolean isEmpty() {
        return currentOccupancy == -1;
    }

    boolean isFull() {
        return currentOccupancy == (stackDepth-1);
    }

    void push(IStackable iStackable) {
       if (!isFull()) {
            currentOccupancy += 1;
            stackArray[currentOccupancy] = iStackable;
        }
    }

    IStackable pop() {
        IStackable retval = null;
        if (!isEmpty()) {
            retval = stackArray[currentOccupancy];
            currentOccupancy -= 1;
        }
        return retval;
    }
}