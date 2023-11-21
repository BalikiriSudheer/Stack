package com.stack2;

public class Queue {
    LinkedList list;

    public Queue() {
        this.list = new LinkedList();
    }

    public void enqueue(int data) {
        // Internally calling append method on LinkedList
        list.append(data);
    }

    public void display() {
        Node current = list.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}



