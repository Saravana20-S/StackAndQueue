package com.bridgelabz.stacksandqueues;

import org.junit.Assert;
import org.junit.Test;

public class MyStackUC1Test {

    @Test
    public void given3Numbers_WhenPushedToStack_ShouldHaveLastElementOnTop() {
        // Create brand new standalone nodes
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);

        // Instantiate the Stack
        MyStack<Integer> myStack = new MyStack<>();

        // Push sequence: 70 first, then 30, then 56
        myStack.push(firstNode);
        myStack.push(secondNode);
        myStack.push(thirdNode);

        // Visually verify sequence shows 56->30->70
        myStack.printStack();

        // Assert/Verify that 56 is on top of the Stack
        Node<Integer> topNode = myStack.peek();
        Assert.assertEquals(thirdNode, topNode);

        // Assert the underlying links (56 -> 30 -> 70)
        Assert.assertEquals(secondNode, topNode.getNext());
        Assert.assertEquals(firstNode, topNode.getNext().getNext());
    }
}