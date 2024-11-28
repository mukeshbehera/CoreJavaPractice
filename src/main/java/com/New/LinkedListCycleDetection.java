package com.New;

class LinkedListCycleDetection {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // If the list is empty or only one node, no cycle is possible.
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // Move slow pointer by one step.
            fast = fast.next.next;    // Move fast pointer by two steps.

            if (slow == fast) {
                return true; // Cycle detected.
            }
        }

        return false; // No cycle found.
    }

    public static void main(String[] args) {
        // Creating a linked list with a cycle for testing
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Creates a cycle.

        System.out.println("Cycle detected: " + hasCycle(node1)); // Output: true

        // Creating a linked list without a cycle for testing
        ListNode nodeA = new ListNode(1);
        ListNode nodeB = new ListNode(2);
        nodeA.next = nodeB;

        System.out.println("Cycle detected: " + hasCycle(nodeA)); // Output: false
    }
}
