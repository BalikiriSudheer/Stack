package com.stack1;

public class Main {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        stack.push(56);
        stack.push(30);
        stack.push(70);

        System.out.println("Peek: " + stack.peek()); // Should print 70

        System.out.println("Pop until the stack is empty:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
