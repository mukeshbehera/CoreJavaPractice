package com.New;

class DoublyLinkedList {

    // Node class for the doubly linked list
    static class Node {
        int value;
        Node prev;
        Node next;

        Node(int value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }

    // Head and tail of the doubly linked list
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Add a node to the front of the list
    public void pushFront(int value) {
        Node newNode = new Node(value);

        if (head == null) { // List is empty
            head = tail = newNode;
        } else {
            newNode.next = head; // Link the new node to the current head
            head.prev = newNode; // Link the current head back to the new node
            head = newNode; // Update head
        }
    }

    // Add a node to the back of the list
    public void pushBack(int value) {
        Node newNode = new Node(value);

        if (tail == null) { // List is empty
            head = tail = newNode;
        } else {
            newNode.prev = tail; // Link the new node to the current tail
            tail.next = newNode; // Link the current tail to the new node
            tail = newNode; // Update tail
        }
    }

    // Print the list from front to back
    public void print() {
        Node current = head;
        System.out.print("Doubly Linked List: ");
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Print the list from back to front (optional, for demonstration)
    public void printReverse() {
        Node current = tail;
        System.out.print("Reverse List: ");
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Test pushFront
        list.pushFront(10);
        list.pushFront(20);
        list.pushFront(30);
        System.out.println("After pushFront operations:");
        list.print();

        // Test pushBack
        list.pushBack(40);
        list.pushBack(50);
        System.out.println("After pushBack operations:");
        list.print();

        // Print in reverse
        System.out.println("Printing in reverse:");
        list.printReverse();
    }
}
