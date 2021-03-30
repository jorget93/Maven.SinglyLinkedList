package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void testConstructor(){
        //Arrange
        SinglyLinkedList<String> newList = new SinglyLinkedList<String>("first");

        //Assert
        Assert.assertEquals(Integer.valueOf(1),newList.length());
    }

    @Test
    public void testAdd(){
        //Arrange
        SinglyLinkedList<String> newList = new SinglyLinkedList<String>("first");

        //Action
        newList.add("second");
        newList.add("third");
        newList.add("fourth");
        Integer expected = 4;
        Integer actual = newList.length();

        //Assert
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGet(){
        //Arrange
        SinglyLinkedList<String> newList = new SinglyLinkedList<String>("first");

        //Action
        newList.add("second");
        newList.add("third");
        newList.add("fourth");

        Node actual = (Node) newList.get(1);

        //Assert
        Assert.assertEquals("second", actual.getData());
    }

    @Test
    public void testRemove(){
        //Arrange
        SinglyLinkedList<String> newList = new SinglyLinkedList<String>("first");

        //Action
        newList.add("second");
        newList.add("third");
        newList.add("fourth");

        newList.remove(1);

        //Assert
        Assert.assertEquals(Integer.valueOf(3), newList.length());
    }

    @Test
    public void testContains(){
        //Arrange
        SinglyLinkedList<String> newList = new SinglyLinkedList<String>("first");

        //Action
        newList.add("second");
        newList.add("third");
        newList.add("fourth");

        //Assert
        Assert.assertTrue(newList.contains("third"));
    }

    @Test
    public void testFind(){
        //Arrange
        SinglyLinkedList<String> newList = new SinglyLinkedList<String>("first");

        //Action
        newList.add("second");
        newList.add("third");
        newList.add("fourth");

        //Assert
        Assert.assertEquals(Integer.valueOf(1), newList.find("second"));
    }
}
