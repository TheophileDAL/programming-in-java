package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;

public class LinkedListBasedImpl implements StackOfInts { /*class*/

    Node head;

    public void getList(){
        Node save = head;
        while (save != null){
            System.out.println(save.elem);
            save = save.next;
        }
    }

    @Override
    public int pop() { /*method*/
        if (this.head != null){
            int value = this.head.elem;
            Node save = this.head.next ;
            this.head.next = null;
            this.head = save;
            return value;
        }
        throw new IllegalStateException("Stack null");
    }

    @Override
    public void push(int x) { /*method*/

        Node node = new Node(x);
        Node save = this.head;
        this.head = node;
        node.next = save;
    }

    @Override
    public int numOfElems() { /*method*/
        while (head != null){
            head = head.next;
            numOfElems++;
        }
        return numOfElems;
    }

    @Override
    public int peek() { /*method*/
        if (this.head != null){
            return head.elem;
        }
        throw new IllegalStateException("To be implemented");
    }

    private static class Node { /*static nested class Node*/
        int elem;
        Node next;

        public Node(int elem){
            this.elem = elem;
            this.next = null;
        }
    }

    private int numOfElems = 0;
}
