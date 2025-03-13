package com.New;

public class ReverseLinkedList2 {

    // Definition for a singly linked list node
    static class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // Function to reverse the linked list
    public static ListNode reverse(ListNode head) {
        ListNode previous = null; // Previous node (initially null)
        ListNode current = head; // Current node (starts at head)
        ListNode next; // To keep track of the next node

        while (current != null) {
            next = current.next; // Save the next node
            current.next = previous; // Reverse the current node's pointer
            previous = current; // Move previous one step forward
            current = next; // Move current one step forward
        }

        // Return the new head (previous will be the new head after the loop)
        return previous;
    }

    // Function to print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        printList(head);

        // Reverse the linked list
        head = reverse(head);

        System.out.println("Reversed Linked List:");
        printList(head);
    }
}
