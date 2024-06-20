package com.collection;

public class LinkList<T> {
    private Node<T> head;
    private int size;

    LinkList(){
        this.size = 0;
    }
    private static class Node<T>{
        T element;
        Node<T> next;
        Node(T element){
            this.element = element;
            this.next = null;
        }
    }

    // add - first
    public void addFirst(T element){
        Node<T> newNode = new Node<>(element);
        size++;
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add - last
    public void addLast(T element){
        Node<T> newNode = new Node<>(element);
        size++;
        if(head == null){
            head = newNode;
            return;
        }

        Node<T> currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    // remove - first
    public void removeFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        size--;
        head = head.next;
    }

    // remove - last
    public void removeLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node<T> secondlastNode = head;
        Node<T> lastNode = head.next;
        while(lastNode.next != null){
            secondlastNode = secondlastNode.next;
            lastNode = lastNode.next;
        }

        secondlastNode.next = null;
    }

    // remove index
    public void remove(int index){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if(index == 0){
            head = head.next;
        } else {
            Node<T> currentNode = head;
            Node<T> previousNode = null;
            for (int i = 0; i < index; i++) {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
            previousNode.next = currentNode.next;
        }
        size--;
    }

    // print
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node<T> currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.element+", ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    // print size
    public int size(){
        return size;
    }

    public static void main(String[] args) {
        LinkList<Integer> ll = new LinkList<>();

        ll.addFirst(20);
        ll.addFirst(10);
        ll.printList();
        System.out.println("Size: "+ll.size);
        System.out.println();

        ll.addLast(30);
        ll.addLast(40);
        ll.printList();
        System.out.println("Size: "+ll.size);
        System.out.println();

        ll.remove(2);
        ll.printList();
        System.out.println("Size: "+ll.size);
        System.out.println();

        ll.removeFirst();
        ll.printList();
        System.out.println("Size: "+ll.size);
        System.out.println();

        ll.removeLast();
        ll.printList();
        System.out.println("Size: "+ll.size);
        System.out.println();
    }
}
