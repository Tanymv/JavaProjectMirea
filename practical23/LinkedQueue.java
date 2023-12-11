package practical23;

import java.util.NoSuchElementException;


interface Queue<T> {

    void enqueue(T element);

    T dequeue();

    T peek();

    boolean isEmpty();

    int size();

    void clear();
}

public class LinkedQueue<T> implements Queue<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
        }
    }

    public void enqueue(T element) {
        Node<T> newNode = new Node<>(element);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T removedElement = head.value;
        head = head.next;
        size--;
        if (isEmpty()) {
            tail = null;
        }
        return removedElement;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return head.value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
}

abstract class AbstractQueue<T> implements Queue<T> {
    public void enqueue(T element) {
        addElement(element);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return removeElement();
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return getFirstElement();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void clear() {
        while (!isEmpty()) {
            removeElement();
        }
    }

    protected abstract void addElement(T element);
    protected abstract T removeElement();
    protected abstract T getFirstElement();
}

