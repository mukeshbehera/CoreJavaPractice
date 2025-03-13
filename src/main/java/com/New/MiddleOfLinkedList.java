package com.New;

public class MiddleOfLinkedList {

    static class MyNode {
        int value;
        MyNode next;

        MyNode(int value) {
            this.value = value;
            this.next = null;
        }
    }

    static MyNode findMiddle(MyNode head){
        MyNode slow = head;
        MyNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        MyNode node1 = new MyNode(1);
        MyNode node2 = new MyNode(2);
        MyNode node3 = new MyNode(3);
        MyNode node4 = new MyNode(4);
        MyNode node5 = new MyNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        int middle = findMiddle(node1).value;
        System.out.println("value = " + middle);
    }
}
