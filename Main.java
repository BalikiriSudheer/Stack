package com.stack2;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();


        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

      
        System.out.println("Queue elements:");
        queue.display();
    }
}
