package com.zipcodewilmington.singlylinkedlist;

import java.util.Comparator;

public class Node<T extends Comparable <T>> implements Comparable{
    private T data;
    private Node next;

    public Node(T data){
        this.data = data;
        next = null;
    }

    public T getData() {
        return data;
    }

    public Node getNextNode() {
        return next;
    }

    public void setNextNode(Node next) {
        this.next = next;
    }

    public int compareTo(Object o) {
        return 0;
    }
}
