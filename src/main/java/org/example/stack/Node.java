package org.example.stack;

import lombok.*;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Node<T> {
    private T value;
    private Node<T> prev;
}
