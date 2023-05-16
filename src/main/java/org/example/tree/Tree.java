package org.example.tree;

import lombok.Getter;

@Getter
public class Tree {
    private Node head;

    public void add(Node node) {
        if (head == null) {
            head = node;
        } else {
            var item = recursiveFindParent(head, node);
            if (item != null) {
                if (item.getValue() > node.getValue()) {
                    item.setRight(node);
                } else {
                    item.setLeft(node);
                }
            }
        }
    }

    public Node recursiveFindParent(Node current, Node newNode) {
        if (current == null || newNode == null) return null;

        var value = newNode.getValue();
        Node child;
        if (value > current.getValue()) {
            child = current.getRight();
        } else {
            child = current.getLeft();
        }

        if (child == null) {
            return current;
        } else {
            return recursiveFindParent(child, newNode);
        }
    }
}
