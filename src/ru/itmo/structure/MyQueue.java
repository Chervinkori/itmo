package ru.itmo.structure;

/**
 * @author chervinko <br>
 * 15.06.2021
 */
public class MyQueue<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void push(T elem) {
        Node<T> newElem = new Node<>(elem);

        if (head == null)
            head = newElem;
        else {
            tail.next = newElem;
        }

        tail = newElem;
        size++;
    }

    public T pop() {
        if (size == 0)
            return null;

        T elem = head.data;
        head = head.next;
        if (head == null)
            tail = null;

        size--;

        return elem;
    }

    public int size() {
        return size;
    }

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }
}
