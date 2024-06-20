package com.New;

import java.util.ArrayList;

public class StackUsingArrayList<T> {
    private ArrayList<T> stack;

    // Constructor to initialize the ArrayList
    public StackUsingArrayList() {
        stack = new ArrayList<>();
    }

    // Pushes an element onto the stack
    public void push(T element) {
        stack.add(element);
    }

    // Pops and returns the top element from the stack
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop from an empty stack.");
        }
        int lastIndex = stack.size() - 1;
        return stack.remove(lastIndex);
    }

    // Peeks at the top element without removing it
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot peek into an empty stack.");
        }
        int lastIndex = stack.size() - 1;
        return stack.get(lastIndex);
    }

    // Checks if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Returns the number of elements in the stack
    public int size() {
        return stack.size();
    }

    // Searches for the specified element and returns its 1-based position from the top of the stack
    public int search(T element) {
        int index = stack.lastIndexOf(element);
        if (index == -1) {
            return -1; // Element not found in the stack
        }
        return stack.size() - index;
    }

    public static void main(String[] args) {
        StackUsingArrayList<Integer> stack = new StackUsingArrayList<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peeking and popping elements
        System.out.println("Peek: " + stack.peek()); // Should print 30
        System.out.println("Pop: " + stack.pop());   // Should print 30

        // Checking size and emptiness
        System.out.println("Size: " + stack.size());     // Should print 2
        System.out.println("Is Empty: " + stack.isEmpty());// Should print false

        // Searching for an element in the stack
        System.out.println("Search for 20: Position from top - " + stack.search(20)); // Should print 1
        System.out.println("Search for 50: Position from top - " + stack.search(50)); // Should print -1
    }
}
