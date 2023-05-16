package org.example.stack;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = List.of(12, 42, 63, 67);
        for (var item : list) {
            Node<Integer> node = new Node<>();
            node.setValue(item);
            stack.push(node);
        }

        while (stack.getTop() != null) {
            System.out.println(stack.pop().getValue());
        }
    }
}