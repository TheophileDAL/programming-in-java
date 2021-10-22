package agh.ii.prinjava.lab02.exc02_01.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListBasedImplTest {

    LinkedListBasedImpl list = new LinkedListBasedImpl();

    @Test
    void pop() {
        System.out.println("Test pop begin");
        list.push(1);
        list.push(3);
        list.push(2);
        System.out.println("List values before pop : ");
        list.getList();
        list.pop();
        System.out.println("List values after pop : ");
        list.getList();
    }

    @Test
    void push() {
        System.out.println("Test push begin");
        list.push(1);
        list.push(3);
        list.push(2);
        System.out.println("List values : ");
        list.getList();
    }

    @Test
    void numOfElems() {
        System.out.println("Test numOfElems begin");
        list.push(1);
        list.push(3);
        list.push(2);
        System.out.println("number of elements : "+list.numOfElems());
    }

    @Test
    void peek() {
        System.out.println("Test peek begin");
        list.push(1);
        list.push(3);
        list.push(2);
        System.out.println("value of the first node : "+list.peek());
    }
}