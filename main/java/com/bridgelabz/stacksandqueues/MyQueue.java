package com.bridgelabz.stacksandqueues;

public class MyQueue<T> {
    private Node<T> head;
    private Node<T> tail;

    public MyQueue() {
        this.head = null;
        this.tail = null;
    }

    // UC3: Enqueue method internally appends nodes to the tail of the LinkedList
    public void enqueue(Node<T> newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        if (this.tail == null) {
            this.tail = newNode;
        } else {
            // Link current tail's next to the incoming node
            this.tail.setNext(newNode);
            // Move tail pointer to the brand new node
            this.tail = newNode;
        }
    }

    // Helper method to get the front element
    public Node<T> getHead() {
        return this.head;
    }

    // Helper method to print the queue structure
    public void printQueue() {
        StringBuffer queueFormat = new StringBuffer("Queue Structure: ");
        Node<T> tempNode = head;
        while (tempNode != null) {
            queueFormat.append(tempNode.getData());
            if (tempNode.getNext() != null) queueFormat.append("->");
            tempNode = tempNode.getNext();
        }
        System.out.println(queueFormat);
    }


    // UC4: Method to remove and return the front element of the queue (Dequeue)
    public Node<T> dequeue() {
        if (this.head == null) {
            return null;
        }
        Node<T> tempNode = this.head;
        // Shift head pointer to the next node in line
        this.head = this.head.getNext();

        // If the queue becomes completely empty, set tail to null too
        if (this.head == null) {
            this.tail = null;
        }
        return tempNode;
    }

    // UC4: Helper method to check if the queue is empty
    public boolean isEmpty() {
        return this.head == null;
    }
}