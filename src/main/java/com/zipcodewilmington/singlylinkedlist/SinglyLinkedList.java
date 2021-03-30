package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList <T extends Comparable<T>>{
    protected Node head;
    protected Node end;
    private Integer size;

    public SinglyLinkedList(T head) {
        this.head = new Node<T>(head);
        size = 1;
    }
    public void add(T data){
        Node<T> newEnd = new Node<T>(data);
        if(size.equals(1)){
            head.setNextNode(newEnd);
            end = newEnd;
        }
        else {
            end.setNextNode(newEnd);
            end = end.getNextNode();
        }
        size++;
    }

    public void remove(Integer index){
        Node current = head;
        Integer counter = 0;
        while(current != null){
            if(index.equals(0)){
                head = current.getNextNode();
                size -= 1;
                break;
            }
            else if (counter == index -1){
                if(current.getNextNode().getNextNode() == null){
                    current.setNextNode(null);
                }
                else{
                    current.setNextNode(get(index + 1));
                }
                size -= 1;
                break;
            }
            counter++;
            current = current.getNextNode();
        }
    }

    public Node get(Integer index) {
        Node current = head;
        for(int j = 0; j < size; j++){
            if(j == index){
                return current;
            }
            current = current.getNextNode();
        }
        return null;
    }

    public Boolean contains(T data){
        Node current = head;
        while(current != null){
            if(current.getData().equals(data)){
                return true;
            }
            current = (current.getNextNode());
        }
        return false;
    }

    public Integer find(T data){
        Node current = head;
        Integer counter = 0;
        while(current != null){
            if(current.getData().equals(data)){
                return counter;
            }
            counter++;
            current = (current.getNextNode());
        }
        return -1;
    }

    public Integer length(){
        return size;
    }


}
