package org.example.tree;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Node {
    private Integer value;
    private Node left;
    private Node right;
}
