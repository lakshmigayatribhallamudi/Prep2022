package com.gayi.linkedlist.operation;

import com.gayi.linkedlist.model.SingleNode;

import static com.gayi.linkedlist.util.LinkedListUtil.buildIntegerLinkedList;
import static com.gayi.linkedlist.util.LinkedListUtil.printLinkedList;

public class SearchElement<T> {

    public boolean searchUsingIteration(T data, SingleNode head) {
        while (head != null) {
            if (head.getData() == data) {
                System.out.println("Element found using iteration");
                return true;
            }
            head = head.getNext();
        }
        System.out.println("Element not found");
        return false;
    }

    public boolean searchUsingRecursion(T data, SingleNode head) {
        if (head == null) {
            System.out.println("Element not found using recursion");
            return false;
        }
        if (head.getData() == data) {
            System.out.println("Element found using recursion");
            return true;
        }
        return searchUsingRecursion(data, head.getNext());
    }

    public static void main(String[] args) {
        SearchElement<Integer> se = new SearchElement<>();
        SingleNode sn = buildIntegerLinkedList();
        printLinkedList(sn);
        se.searchUsingRecursion(2, sn);
        se.searchUsingIteration(4, sn);
        se.searchUsingIteration(9, sn);
        se.searchUsingRecursion(15, sn);
    }
}
