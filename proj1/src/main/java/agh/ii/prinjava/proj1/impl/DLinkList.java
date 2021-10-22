package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {
    private Node<E> headNode;

    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;

        private Node(T elem){
            this.elem = elem;
            this.next = null;
            this.prev = null;
        }
    }

    public void addFirst(E elem){
        /** adding of an element at the top of the list :
         * - we create a node with the constructor of the Node class
         * - this node became the headNode of the list
         * - we don't forget to link the node between them with next and prev*/
        Node<E> addNode = new Node<>(elem);
        if (headNode == null){
            this.headNode = addNode;
        }
        else if (headNode != null){
            Node<E> save = headNode;
            headNode = addNode;
            addNode.next = save;
            save.prev = headNode;
        }
    }

    public void addLast(E elem){
        /** adding of an element at the bottom of the list :
         * - we create a node with the constructor of the Node class
         * - we browse the list until we find the node which have no other node next to it
         * - we reattach our new node to it (next and prev)*/
        Node<E> addNode = new Node<>(elem);
        if (headNode == null){
            this.headNode = addNode;
        }
        else{
            Node<E> save = headNode;
            while (save.next != null){
                save = save.next;
            }
            save.next = addNode;
            addNode.prev = save;
        }
    }

    public E removeFirst(){
        /** removing the first element of the list (the easiest move) :
         * - the head of the list take the value of the next node
         * - if this new head is not null, his prev node has to be null
         * - we return the value of the first node remove / null if the head list is null*/
        E returnValue =  null;
        if (headNode != null){
            returnValue = (E) headNode.elem;
            headNode = headNode.next;
            if (headNode != null){
                headNode.prev = null;
            }
        }
        return returnValue;
    }

    public E removeLast(){
        /** removing the last element of the list :
         * - after finding the node that we have to remove, we give to the next node of its prev node the value of "null"
         * - we return the value of the last node remove / null if the head list is null*/
        E returnValue = null;
        if (headNode != null){
            if (headNode.next == null){
                returnValue = headNode.elem;
                headNode = null;
            }
            else{
                Node<E> save = headNode;
                while (save.next.next != null){
                    save = save.next;
                }
                returnValue = save.next.elem;
                save.next = null;
            }
        }
        return returnValue;
    }

    @Override
    public String toString(){
        /** return the value of the list as a String :
         * - we create a String variable
         * - we add one by one the value that contain each node to the variable by browsing the list */
        String liste = "";
        if (headNode == null){
            liste = liste+"null";
        }
        else {
            Node<E> save = headNode;
            liste = liste+save.elem;
            while (save.next != null) {
                liste = liste+" <-> "+save.next.elem;
                save = save.next;
            }
        }
        return liste;
    }

    public int listLength(){
        /** return the length of the list :
         * - we browse the list until found the end and in the same time we increment a counter*/
        int length = 0;
        if (headNode != null){
            Node<E> save = headNode;
            length++;
            while (save.next != null){
                length++;
                save = save.next;
            }
        }
        return length;
    }

    public E firstElem(){
        if (headNode != null){
            return headNode.elem;
        }
        return null;
    }

    public E lastElem(){
        if (headNode != null){
            Node<E> save = headNode;
            while (save.next != null){
                save = save.next;
            }
            return save.elem;
        }
        return null;
    }



}
