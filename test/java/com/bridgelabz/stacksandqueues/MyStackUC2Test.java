package com.bridgelabz.stacksandqueues;

import org.junit.Assert;
import org.junit.Test;

public class MyStackUC2Test {

    @Test
    public void given3NumbersInStack_WhenPoppedTillEmpty_ShouldReturnNullAtTheEnd() {
        // Setup baseline nodes
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);

        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(firstNode);
        myStack.push(secondNode);
        myStack.push(thirdNode);

        System.out.println("--- Starting Stack Pop Operations ---");
        myStack.printStack();

        // Loop through the Stack, peeking and popping until empty
        while (!myStack.isEmpty()) {
            Node<Integer> peekedNode = myStack.peek();
            System.out.println("Top element (Peek): " + peekedNode.getData());

            Node<Integer> poppedNode = myStack.pop();
            System.out.println("Removed element (Pop): " + poppedNode.getData());

            myStack.printStack();
            System.out.println("-----------------------------------");
        }

        // Assert/Verify that the stack is completely empty and top is null
        Assert.assertTrue(myStack.isEmpty());
        Assert.assertNull(myStack.peek());
    }
}