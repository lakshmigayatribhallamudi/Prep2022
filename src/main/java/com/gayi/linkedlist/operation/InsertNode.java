package com.gayi.linkedlist.operation;

import com.gayi.linkedlist.model.SingleNode;
import com.gayi.linkedlist.util.LinkedListUtil;

public class InsertNode {
    SingleNode<Integer> node;

    public InsertNode(SingleNode node) {
        this.node = node;
    }

    public SingleNode insertAtBeginning(SingleNode head, int data) {
        SingleNode newNode = new SingleNode(data,null);
        newNode.setNext(head);
        return newNode;
    }

    public SingleNode insertAtEnd(SingleNode head, int data) {
        SingleNode temp = head;
        SingleNode newNode = new SingleNode(data,null);
        if (temp == null) {
            return newNode;
        }
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(newNode);
        return head;
    }

    public SingleNode insertAtAGivenNode(SingleNode head, SingleNode prev, int data) {
        SingleNode newNode = new SingleNode(data,null);
        newNode.setNext(prev.getNext());
        prev.setNext(newNode);
        return head;
    }

    public static void main(String[] args) {
        LinkedListUtil sl = new LinkedListUtil();
        SingleNode head = sl.buildIntegerLinkedList();
        System.out.println("Printing linked list");
        sl.printLinkedList(head);
        InsertNode in = new InsertNode(head);
        System.out.println("Insertion after beginning");
        sl.printLinkedList(in.insertAtBeginning(head, 9));
        System.out.println("Insertion after End");
        sl.printLinkedList(in.insertAtEnd(head, 11));
    }
}

