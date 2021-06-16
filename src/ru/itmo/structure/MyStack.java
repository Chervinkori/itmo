package ru.itmo.structure;

/**
 * @author chervinko <br>
 * 15.06.2021
 */
public class MyStack<T> {
    private Node<T> head;
    private int size;

    public void push(T elem) {
        Node<T> newElem = new Node<>(elem);

        if (head != null) {
            newElem.next = head;
        }

        head = newElem;

        size++;
    }

    public T pop() {
        if (head == null)
            return null;

        T elem = head.data;
        head = head.next;

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
