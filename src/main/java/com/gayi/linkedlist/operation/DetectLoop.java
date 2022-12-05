package com.gayi.linkedlist.operation;

import com.gayi.linkedlist.model.SingleNode;
import com.gayi.linkedlist.util.LinkedListUtil;

public class DetectLoop<T> {
    public boolean isLoopPresent(SingleNode<T> head) {
        SingleNode<T> s1 = head;
        SingleNode<T> s2 = head;
        while (s1 != null && s2 != null && s2.getNext() != null) {
            s1 = s1.getNext();
            s2 = s2.getNext().getNext();
            if (s1 == s2) {
                System.out.println("Loop found");
                return true;
            }
        }
        System.out.println("Loop not found");
        return false;
    }

    public static void main(String[] args) {
        DetectLoop<Integer> dl =new DetectLoop<>();
        dl.isLoopPresent(LinkedListUtil.buildLinkedListWithLoop());
        dl.isLoopPresent(LinkedListUtil.buildIntegerLinkedList());
    }
}
