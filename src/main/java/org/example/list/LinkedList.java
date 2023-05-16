package org.example.list;

import lombok.Getter;

@Getter
public class LinkedList<T> {
    private Node<T> tail;
    private Node<T> head;

    public void add(Node<T> element) {
        if (head == null) {
            head = element;
            tail = element;
            head.setNext(tail);
        } else {
            tail.setNext(element);
            tail = element;
        }
    }

    public Node<T> get(int index) {
        var mIndex = 0;
        var element = head;
        while (element.getNext() != null) {
            element = element.getNext();
            mIndex++;
            if (index == mIndex) {
                return element;
            }
        }
        return null;
    }
}
