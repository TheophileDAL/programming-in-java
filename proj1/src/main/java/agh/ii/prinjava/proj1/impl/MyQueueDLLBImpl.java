package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems = new DLinkList<>();

    @Override
    public void enqueue(E x) {
        /** for queue list, each new node is added at the end -> it's an enqueue
         * so, we call the method addLast of the class DLinkList*/
        elems.addLast(x);
    }

    @Override
    public E dequeue() {
        /** for queue list, each node is removed at the top of the list -> it's a dequeue
         * so, we call the method removeFirst of the class DLinkList*/
        return elems.removeFirst();
    }

    @Override
    public int numOfElems() {
        /** the method numOfElems return the number of elements contain in the queue list
         * so, we call the method listLength of the class DLinkList*/
        return elems.listLength();
    }

    @Override
    public E peek() {
        /** the method peek return the value of the first node of the queue list
         * so, we call the method firstElem of the class DLinkList*/
        return elems.firstElem();
    }

    @Override
    public E peekLast(){
        /** the method peekLast return the value of the last node of the queue list
         * so, we call the method lastElem of the class DLinkList*/
        return elems.lastElem();
    }
}
