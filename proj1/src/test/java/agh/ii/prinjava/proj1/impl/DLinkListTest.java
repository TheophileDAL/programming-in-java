package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DLinkListTest<E> {
    DLinkList<Integer> dLinkList = new DLinkList<>();

    @BeforeEach
    void setUp() {
        /** we create a part of the list here */
        dLinkList.addFirst(5);
        dLinkList.addFirst(7);
        dLinkList.addLast(4);
    }

    @AfterEach
    void tearDown() {
        System.out.println("End of test");
    }

    @Test
    void addFirst(){
        /** we add an integer at the beginning of the list with the method addFirst
         * if this integer is equals with the first element of the list -> the test is successful */
        dLinkList.addFirst(3);
        assertEquals(3,dLinkList.firstElem());
    }

    @Test
    void addLast(){
        /** we add an integer at the beginning of the list with the method addLast
         * if this integer is equals with the last element of the list -> the test is successful */
        dLinkList.addLast(3);
        assertEquals(3,dLinkList.lastElem());
    }

    @Test
    void removeFirst(){
        /** we remove the first element of the list with the method removeFirst
         * if the value return by the method is equal to the right value to be removed
         * and if the new head is equal to the old second value -> the test is successful */
        assertEquals(7, dLinkList.removeFirst());
        assertEquals(5,dLinkList.firstElem());
    }

    @Test
    void removeLast(){
        /** we remove the last element of the list with the method removeLast
         * if the value return by the method is equal to the right value to be removed
         * and if the new last element is equal to the old before last value -> the test is successful */
        assertEquals(4, dLinkList.removeLast());
        assertEquals(5,dLinkList.lastElem());
    }

    @Test
    void display(){
        /** the return of toString has to be the value of each node of the list (created before) in order with <-> between them */
        assertEquals("7 <-> 5 <-> 4",dLinkList.toString());
    }
}