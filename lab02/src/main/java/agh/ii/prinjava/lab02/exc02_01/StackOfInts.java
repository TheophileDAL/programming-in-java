package agh.ii.prinjava.lab02.exc02_01;

/**
 * Stack of integers - Abstract Data Type (ADT)
 */

public interface StackOfInts { /*interface*/
    int pop();

    void push(int x);

    default boolean isEmpty() {
        return numOfElems() == 0; } /* StackOfInts's method -> return true if numOfElems is 0 else false*/

    int numOfElems();

    int peek();

    void getList();
}
