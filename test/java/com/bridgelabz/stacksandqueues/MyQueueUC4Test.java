package com.bridgelabz.stacksandqueues;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueUC4Test {

    @Test
    public void given3NumbersInQueue_WhenDequeued_ShouldRemoveFromFrontUntilEmpty() {
        // Setup baseline nodes
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);

        // Instantiate the Queue and add elements
        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.enqueue(firstNode);
        myQueue.enqueue(secondNode);
        myQueue.enqueue(thirdNode);

        System.out.println("--- Starting Queue Dequeue Operations ---");
        myQueue.printQueue();

        // 1. First Dequeue: Should remove 56
        Node<Integer> dequeued1 = myQueue.dequeue();
        System.out.println("Dequeued: " + dequeued1.getData());
        myQueue.printQueue();
        Assert.assertEquals(firstNode, dequeued1);
        Assert.assertEquals(secondNode, myQueue.getHead());

        // 2. Second Dequeue: Should remove 30
        Node<Integer> dequeued2 = myQueue.dequeue();
        System.out.println("Dequeued: " + dequeued2.getData());
        myQueue.printQueue();
        Assert.assertEquals(secondNode, dequeued2);
        Assert.assertEquals(thirdNode, myQueue.getHead());

        // 3. Third Dequeue: Should remove 70 and empty the queue
        Node<Integer> dequeued3 = myQueue.dequeue();
        System.out.println("Dequeued: " + dequeued3.getData());
        myQueue.printQueue();
        Assert.assertEquals(thirdNode, dequeued3);

        // Assert queue is completely empty
        Assert.assertTrue(myQueue.isEmpty());
        Assert.assertNull(myQueue.getHead());
    }
}