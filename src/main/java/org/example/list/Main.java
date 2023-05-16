package org.example.list;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        List<Integer> values = List.of(12, 23, 54, 234, 64, 324);
        for (var item : values) {
            Node<Integer> node = new Node<>();
            node.setValue(item);
            integerLinkedList.add(node);
        }


        var start = integerLinkedList.getHead();

        while (start != null) {
            System.out.println(start.getValue());
            start = start.getNext();
        }
    }
}
