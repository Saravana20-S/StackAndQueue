package com.bridgelabz.stacksandqueues;

public class MyStack<T> {
    private Node<T> top; // Acts as the head of our internal LinkedList

    public MyStack() {
        this.top = null;
    }

    // UC1: Push method internally links nodes like a prepend LinkedList operation
    public void push(Node<T> newNode) {
        if (this.top == null) {
            this.top = newNode;
        } else {
            // Point new node to the current top element
            newNode.setNext(this.top);
            // Move top pointer to our newly added node
            this.top = newNode;
        }
    }

    // Helper method to peek at the top element without removing it
    public Node<T> peek() {
        return this.top;
    }

    // Helper method to print the stack sequence
    public void printStack() {
        StringBuffer stackFormat = new StringBuffer("Stack Structure: ");
        Node<T> tempNode = top;
        while (tempNode != null) {
            stackFormat.append(tempNode.getData());
            if (tempNode.getNext() != null) stackFormat.append("->");
            tempNode = tempNode.getNext();
        }
        System.out.println(stackFormat);
    }

    // UC2: Method to remove and return the top element of the stack (Pop)
    public Node<T> pop() {
        if (this.top == null) {
            return null;
        }
        Node<T> tempNode = this.top;
        // Shift top pointer to the next node down
        this.top = this.top.getNext();
        return tempNode;
    }

    // UC2: Helper method to check if the stack is completely empty
    public boolean isEmpty() {
        return this.top == null;
    }
}