package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private DLinkList<E> elems = new DLinkList<>();

    @Override
    public E pop() {
        /** for stack list, each node is removed at the top of this list -> it's a pop
         * so, we call the method removeFirst of the class DLinkList*/
        return elems.removeFirst();
    }

    @Override
    public void push(E x) {
        /** for stack list, each new node is added at the top of the list -> it's a push
         * so, we call the method addFirst of the class DLinkList*/
        elems.addFirst(x);
    }

    @Override
    public int numOfElems() {
        /** the method numOfElems return the number of elements contain in the stack list
         * so, we call the method listLength of the class DLinkList*/
        return elems.listLength();
    }

    @Override
    public E peek() {
        /** the method peek return the value of the first node of the stack list
         * so, we call the method firstElem of the class DLinkList*/
        return elems.firstElem();
    }
}
