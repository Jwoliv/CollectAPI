package org.example.queue;

import lombok.Getter;

@Getter
public class Queue<T> {
    private Node<T> top;
    public void put(Node<T> obj) {
        if (top == null) {
            top = obj;
        } else {
           var value = top;
           var added = true;
           while (added) {
               if (value.getNext() == null) {
                   value.setNext(obj);
                   added = false;
               }
               else {
                   value = value.getNext();
               }
           }
        }
    }

    public Node<T> pop() {
        if (top == null) {
            throw new IndexOutOfBoundsException();
        } else {
            var value = top;
            top = top.getNext();
            return value;
        }
    }

}
