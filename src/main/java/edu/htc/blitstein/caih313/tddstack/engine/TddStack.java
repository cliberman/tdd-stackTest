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

/*Implement the TddStack using an array of IStackable. Check that in (after you have checked in the above). All tests should run successfully in your project.

Notes/Hints:

Add two private instance variables to TddStack
an int to keep track of the current number of objects on the stack
an IStackable[] to store the objects that are pushed on the stack.
The public constructor should call the package private constructor.

More details: If you call the int that keeps track of current number of object on the stack "counter" and the array you are using to hold the objects "stackArray",
then to implement the TddStack, you could start your counter at -1. When the first object was pushed, then you'd increment your counter and place the object in the
first position in the array, stackArray[0]. On the next push you would increment the counter and place the object in the next position, at stackArray[1], and so on.
A pop call would return the object at stackArray[counter], null that element out, and decrement the counter.

Note that you may want to create more unit tests to be sure your code actually does everything it is supposed to do.*/
