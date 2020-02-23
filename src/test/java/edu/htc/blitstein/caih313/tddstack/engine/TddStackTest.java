package edu.htc.blitstein.caih313.tddstack.engine;

import edu.htc.blitstein.caih313.tddstack.resource.campus.Faculty;
import edu.htc.blitstein.caih313.tddstack.IStackable;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TddStackTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testPublicConstructor() {
        TddStack firstStack = new TddStack();
        assertEquals(firstStack.DEFAULT_DEPTH, firstStack.stackDepth);
    }

    @Test
    public void testIsEmpty() {
        TddStack firstStack = new TddStack();
        assertEquals(true, firstStack.isEmpty());
    }

    @Test
    public void testIsFull() {
        TddStack firstStack = new TddStack();
        assertEquals(false, firstStack.isFull());
    }

    @Test
    public void testPop() {
        TddStack firstStack = new TddStack();
        IStackable poppedVariable = firstStack.pop();
        assertNull(poppedVariable);
    }

    @Test
    public void testPushThenNotEmpty() {
        TddStack firstStack = new TddStack();
        IStackable iStackable1 = new Faculty();
        firstStack.push(iStackable1);
        boolean isEmpty = firstStack.isEmpty();
        assertFalse(isEmpty);
    }

    @Test
    public void testFullWithThree() {
        TddStack firstStack = new TddStack(3);
        IStackable iStackable1 = new Faculty();
        firstStack.push(iStackable1);
        IStackable iStackable2 = new Faculty();
        firstStack.push(iStackable2);
        IStackable iStackable3 = new Faculty();
        firstStack.push(iStackable3);
        assertTrue(firstStack.isFull());
    }

    @Test
    public void testPopIsPush() {
        TddStack tddStack = new TddStack();
        //Faculty implements IStackable
        IStackable iStackableOrig = new Faculty();
        tddStack.push(iStackableOrig);
        IStackable iStackablePopped = tddStack.pop();
        assertEquals(iStackableOrig, iStackablePopped);
    }
}



/*Navigate to TddStackTest and implement the following tests:
check that creating a TddStack with the public constructor sets the stackDepth to DEFAULT_DEPTH (not 100, but TddStack.DEFAULT_DEPTH).
check that calling isEmpty() on a newly created stack returns "true"
check that calling isFull() on a newly created stack returns "false"
check that calling pop() on a newly created stack returns "null"
For the next few tests, you'll need to instantiate a TddStack. You will also need to instantiate one or more IStackable objects.
check that when a IStackable is pushed on the TddStack, then isEmpty() returns false
Instantiate a TddStack with a depth of 3. Implement a test that checks that isFull() returns true when three IStackable objects are pushed onto it
Check into git and give me the link to your git project.*/