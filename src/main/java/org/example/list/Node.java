package org.example.list;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Node<T> {
    private T value;
    private Node<T> next;
}
