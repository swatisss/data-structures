/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.linkedlist;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author RQCN8130
 */
public class RemoveDuplicatesElementsFromList {

    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {

        if (head == null) {
            return null;
        }
        Map<Integer, Integer> valueToCount = new HashMap<>();
        SinglyLinkedListNode cur = head;
        while (cur != null) {
            if (valueToCount.containsKey(cur.data)) {
                int count = valueToCount.get(cur.data) + 1;
                valueToCount.put(cur.data, count);
            } else {
                valueToCount.put(cur.data, 1);
            }
            cur = cur.next;
        }
        cur = head;
        SinglyLinkedListNode prev = null;
        while (cur != null) {
            int times = valueToCount.get(cur.data);
            if (times > 1) {
                SinglyLinkedListNode next = cur;
                while (times > 1) {
                    next = next.next;
                    times--;
                }
                cur = next;
                if(prev == null){
                    head = cur;
                }
                else{prev.next = cur;}

            }
            prev = cur;
            cur = cur.next;
        }
        //System.out.println("printing head here");
        //print(head);
        return head;

    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode last = new SinglyLinkedListNode();
        last.data = data;
        last.next = null;
        if (head == null) {
            return last;
        }
        if (head.next == null) {
            head.next = last;
            return head;
        }
        SinglyLinkedListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = last;
        return head;
    }

    public static void main(String[] s) {
        SinglyLinkedListNode head = null;
        //head = insertNodeAtTail(head, 1);
        //head = insertNodeAtTail(head, 6);
        head = insertNodeAtTail(head, 3);
        head = insertNodeAtTail(head, 3);
        head = insertNodeAtTail(head, 3);
        head = insertNodeAtTail(head, 4);
        head = insertNodeAtTail(head, 5);
        head = insertNodeAtTail(head, 5);
        print(head);
        head = removeDuplicates(head);
        print(head);

    }

    static void print(SinglyLinkedListNode head) {
        SinglyLinkedListNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ->");
            curr = curr.next;
        }
        System.out.print("NULL");
        System.out.println();
    }
    
}
