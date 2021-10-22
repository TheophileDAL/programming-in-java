package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueDLLBImplTest {
    MyQueue<Integer> queueOfInts = MyQueue.create();

    @BeforeEach
    void setUp() {
        /** we create a part of the queue list here */
        queueOfInts.enqueue(5);
        queueOfInts.enqueue(7);
        queueOfInts.enqueue(4);
    }

    @AfterEach
    void tearDown() {
        System.out.println("End of test");
    }

    @Test
    void enqueue(){
        /** it is the same principle as the Test addLast of the DLinkList,
         * we call the enqueue method with in argument a specific integer value
         * if this integer is equals to the value of the new last element of the list -> the test is successful */
        queueOfInts.enqueue(10);
        assertEquals(10, queueOfInts.peekLast());
    }

    @Test
    void dequeue(){
        /** it is the same principle as the Test removeFirst of the DLinkList,
         * we call the dequeue method
         * if the value returned by the method is equal to the right value to be removed in the queue
         * and if the new head is equal to the old second value -> the test is successful */
        assertEquals(5, queueOfInts.dequeue());
        assertEquals(7, queueOfInts.peek());
    }

    @Test
    void numOfElems(){
        /** if the method numOfElems return the right numbers of element in the queue list -> the test is successful */
        assertEquals(3, queueOfInts.numOfElems());
    }

    @Test
    void peek(){
        /** if the method peek return the right first element value of the queue list -> the test is successful */
        assertEquals(5, queueOfInts.peek());
    }

    @Test
    void peekLast(){
        /** if the method peekLast return the right last element value of the queue list -> the test is successful */
        assertEquals(4, queueOfInts.peekLast());
    }

}