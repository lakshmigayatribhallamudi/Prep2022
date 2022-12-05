package com.gayi.linkedlist.util;

import com.gayi.linkedlist.model.SingleNode;

public class LinkedListUtil {

    public static SingleNode<Integer> buildIntegerLinkedList() {
        SingleNode<Integer> head = new SingleNode<Integer>(1, (new SingleNode(2, new SingleNode(3, new SingleNode(4, new SingleNode(5, new SingleNode(7, new SingleNode(8, null))))))));
        return head;
    }

    public static SingleNode<Integer> buildLinkedListWithLoop() {
        SingleNode<Integer> head = new SingleNode<Integer>(1, null);
        head.setNext(new SingleNode(2, new SingleNode(3, new SingleNode(4, new SingleNode(5, head)))));
        return head;
    }

    public static void main(String[] args) {
        SingleNode head = buildIntegerLinkedList();
        SingleNode temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public static void printLinkedList(SingleNode head) {
        SingleNode temp = head;
        if (temp == null) {
            return;
        }
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

}
