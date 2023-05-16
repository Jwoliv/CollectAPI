package org.example.stack;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Stack<T> {
    private Node<T> top;

    public void push(Node<T> obj) {
        if (top != null) {
            obj.setPrev(top);
        }
        top = obj;
    }
    public Node<T> pop() {
        if (top == null) {
            throw new ArrayIndexOutOfBoundsException();
        }
        else {
            var value = top;
            top = top.getPrev();
            return value;
        }
    }
}
