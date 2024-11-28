package com.New;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListOwn<E> {

    int size;
    Node<E> first;
    Node<E> last;

    //add
    public boolean add(E e){
        addLast(e);
        return true;
    }

    //size
    public int size(){
        return size;
    }

    void addLast(E e) {
        Node<E> l = last;
        Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    void addFirst(E e) {
        Node<E> f = first;
        Node<E> newNode = new Node<>(null, e, first);
        first = newNode;
        if (f == null)
            last = newNode;
        else
            f.next = newNode;
        size++;
    }

    @Override
    public String toString() {
        if (first == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<E> current = first;
        while (current != null) {
            sb.append(current.item);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }

    private static class Node<E>{
        E item;
        LinkedListOwn.Node<E> next;
        LinkedListOwn.Node<E> prev;

        Node(LinkedListOwn.Node<E> prev, E item, LinkedListOwn.Node<E> next){
            this.prev = prev;
            this.item = item;
            this.next = next;
        }
    }
}
