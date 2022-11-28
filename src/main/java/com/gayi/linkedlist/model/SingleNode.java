package com.gayi.linkedlist.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class SingleNode<T> {

    T data;
    SingleNode<T> next;

}
