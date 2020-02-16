package edu.htc.blitstein.caih313.tddstack.engine;

import edu.htc.blitstein.caih313.tddstack.IStackable;

public class TddStack implements IStackable {
    static long DEFAULT_DEPTH = 100;
    long stackDepth;

    TddStack(long stackDepth) {
    }

    public TddStack() {

    }

    public static boolean isEmpty() {
    return false;
    }

    public static boolean isFull() {
    return false;
    }

    public void push(IStackable iStackable) {

    }

    public IStackable pop() {
    return null;
    }
}
