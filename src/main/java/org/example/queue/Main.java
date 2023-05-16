package org.example.queue;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        List<Integer> list = List.of(12, 13, 14, 15, 16, 17, 18);
        for (var item : list) {
            Node<Integer> node = new Node<>();
            node.setValue(item);
            queue.put(node);
        }

        while (queue.getTop() != null) {
            System.out.println(queue.pop().getValue());
        }
    }
}
