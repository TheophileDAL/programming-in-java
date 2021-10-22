package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackDLLBImplTest {
    MyStack<Integer> stackOfInts = MyStack.create();

    @BeforeEach
    void setUp() {
        /** we create a part of the stack list here */
        stackOfInts.push(5);
        stackOfInts.push(7);
        stackOfInts.push(4);
    }

    @AfterEach
    void tearDown() {
        System.out.println("End of test");
    }

    @Test
    void push(){
        /** it is the same principle as the Test addFirst of the DLinkList,
         * we call the push method with in argument a specific integer value
         * if this integer is equals to the value of the new first element of the list -> the test is successful */
        stackOfInts.push(10);
        assertEquals(10, stackOfInts.peek());
    }

    @Test
    void pop(){
        /** it is the same principle as the Test removeFirst of the DLinkList,
         * we call the pop method
         * if the value returned by the method is equal to the right value to be removed in the stack list
         * and if the new head is equal to the old second value -> the test is successful */
        assertEquals(4, stackOfInts.pop());
        assertEquals(7, stackOfInts.peek());
    }

    @Test
    void numOfElems(){
        /** if the method numOfElems return the right numbers of element in the stack list -> the test is successful */
        assertEquals(3, stackOfInts.numOfElems());
    }

    @Test
    void peek(){
        /** if the method peek return the right first element value of the stack list -> the test is successful */
        assertEquals(4, stackOfInts.peek());
    }
}