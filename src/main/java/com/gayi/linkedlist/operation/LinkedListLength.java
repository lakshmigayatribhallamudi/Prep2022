package com.gayi.linkedlist.operation;

import com.gayi.linkedlist.model.SingleNode;
import com.gayi.linkedlist.util.LinkedListUtil;

public class LinkedListLength {

    public int getLength(SingleNode head) {
        if (head == null) {
            return 0;
        }
        return 1 + getLength(head.getNext());
    }

    public int getLengthUsingIteration(SingleNode head) {
        int count = 0;
        if (head == null) {
            return 0;
        }
        while (head != null) {
            count++;
            head = head.getNext();

        }
        return count;
    }

    public static void main(String[] args) {
        LinkedListUtil sl = new LinkedListUtil();
        SingleNode head = sl.buildIntegerLinkedList();
        sl.printLinkedList(head);
      LinkedListLength l = new LinkedListLength();
        System.out.println("length of a linked list" + l.getLength(head));
        System.out.println("length of a linked list" + l.getLengthUsingIteration(head));

    }
}
