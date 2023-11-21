package com.stack;

import java.util.LinkedList;

public class Stack {
    Node top; // Top of the stack

    // Method to add a new element to the stack (push)
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Method to print the elements of the stack
    public void display() {
        Node current = top;
        System.out.println("Stack elements:");

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}



