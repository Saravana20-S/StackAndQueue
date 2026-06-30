package com.bridgelabz.stacksandqueues;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueUC3Test {

    @Test
    public void given3Numbers_WhenEnqueued_ShouldFormCorrectQueueSequence() {
        // Create fresh generic nodes
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);

        // Instantiate the Queue
        MyQueue<Integer> myQueue = new MyQueue<>();

        // Enqueue sequence: 56, then 30, then 70
        myQueue.enqueue(firstNode);
        myQueue.enqueue(secondNode);
        myQueue.enqueue(thirdNode);

        // Visually verify sequence shows 56->30->70
        myQueue.printQueue();

        // Assert/Verify that 56 remains at the front (head) of the queue
        Assert.assertEquals(firstNode, myQueue.getHead());

        // Assert the sequential links across the line
        Assert.assertEquals(secondNode, myQueue.getHead().getNext());
        Assert.assertEquals(thirdNode, myQueue.getHead().getNext().getNext());
    }
}