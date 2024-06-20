package com.New;

// Node class represents a node in the linked list
class Node {
    int data;       // Data stored in the node
    CycleNode next;      // Reference to the next node in the list

    // Constructor to initialize a node with given data
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class represents a singly linked list
public class ReverseLinkedList {
    CycleNode head;       // Reference to the head node of the list

    // Constructor to initialize an empty linked list
    public ReverseLinkedList() {
        this.head = null;
    }

    // Method to reverse the linked list
    public void reverse() {
        CycleNode current = head;    // Current node during traversal
        CycleNode prev = null;       // Previous node during traversal
        CycleNode next = null;       // Next node during traversal

        // Traverse through the list and reverse the links
        while (current != null) {
            next = current.next;    // Save the next node
            current.next = prev;     // Reverse the link

            // Move to the next nodes in the list
            prev = current;
            current = next;
        }

        head = prev;   // Update the head to the last node (which is now the first)
    }

    // Method to print the linked list
    public void printList() {
        CycleNode temp = head;    // Temporary node for traversal

        // Traverse through the list and print the data in each node
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();  // Move to the next line after printing the list
    }

    // Method to add a new node to the linked list
    public void addNode(int data) {
        CycleNode newNode = new CycleNode(data);  // Create a new node with the given data

        // If the list is empty, set the new node as the head
        if (head == null) {
            head = newNode;
        } else {
            CycleNode temp = head;

            // Traverse to the end of the list and add the new node
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Main method to test the linked list operations
    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();

        // Adding nodes to the linked list
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        System.out.println("Original linked list:");
        list.printList();

        // Reversing the linked list
        list.reverse();

        System.out.println("Reversed linked list:");
        list.printList();
    }
}
