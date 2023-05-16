package org.example.queue;

import lombok.*;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Node<T> {
    private T value;
    private Node<T> next;

}
