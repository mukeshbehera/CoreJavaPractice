package com.New;

// Node class represents a node in the linked list
class Node2 {
    int data;       // Data stored in the node
    Node2 next;      // Reference to the next node in the list

    // Constructor to initialize a node with given data
    public Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class represents a singly linked list
public class LinkedListImplementationWithRemove {
    Node2 head;       // Reference to the head node of the list

    // Constructor to initialize an empty linked list
    public LinkedListImplementationWithRemove() {
        this.head = null;
    }

    // Method to add a new node to the linked list
    public void addNode(int data) {
        Node2 newNode = new Node2(data);  // Create a new node with the given data

        // If the list is empty, set the new node as the head
        if (head == null) {
            head = newNode;
        } else {
            Node2 temp = head;

            // Traverse to the end of the list and add the new node
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Method to remove a node with the given data from the linked list
    public void removeNode(int data) {
        Node2 current = head;
        Node2 prev = null;

        // Traverse through the list to find the node to remove
        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }

        // If the node is found, remove it
        if (current != null) {
            // If the node is the head, update the head
            if (prev == null) {
                head = current.next;
            } else {
                prev.next = current.next;
            }
        }
    }

    // Method to print the linked list
    public void printList() {
        Node2 temp = head;    // Temporary node for traversal

        // Traverse through the list and print the data in each node
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();  // Move to the next line after printing the list
    }

    public static void main(String[] args) {
        LinkedListImplementationWithRemove list = new LinkedListImplementationWithRemove();

        // Adding nodes to the linked list
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        // Printing the linked list
        System.out.println("Linked list:");
        list.printList();

        // Removing a node (e.g., remove node with data 3)
        list.removeNode(3);

        System.out.println("Linked list after removing node with data 3:");
        list.printList();
    }
}
