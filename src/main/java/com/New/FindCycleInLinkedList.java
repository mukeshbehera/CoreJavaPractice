package com.New;

class CycleNode {
    int data;
    CycleNode next;

    public CycleNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class FindCycleInLinkedList {
    CycleNode head;

    public FindCycleInLinkedList() {
        this.head = null;
    }

    // Method to add a new node to the linked list
    public void addNode(int data) {
        CycleNode newNode = new CycleNode(data);
        if (head == null) {
            head = newNode;
        } else {
            CycleNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Method to detect a cycle in the linked list
    public boolean hasCycle() {
        CycleNode slow = head;
        CycleNode fast = head;

        // Use the "tortoise and hare" approach
        while (fast != null && fast.next != null) {
            slow = slow.next;       // Move slow by one step
            fast = fast.next.next;  // Move fast by two steps

            // If there is a cycle, slow and fast will meet at some point
            if (slow == fast) {
                return true;  // Cycle detected
            }
        }

        return false;  // No cycle found
    }

    public static void main(String[] args) {
        FindCycleInLinkedList list = new FindCycleInLinkedList();

        // Adding nodes to the linked list
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        // Creating a cycle for testing
        list.head.next.next.next.next.next = list.head.next; // Creates a cycle: 5 -> 2

        // Checking for a cycle
        boolean hasCycle = list.hasCycle();
        if (hasCycle) {
            System.out.println("The linked list has a cycle.");
        } else {
            System.out.println("The linked list does not have a cycle.");
        }
    }
}
