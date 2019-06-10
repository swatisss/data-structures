/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.linkedlist;



public class ReverseLinkedList {
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        if(head == null){
            return head;
        }
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode next = null;
        SinglyLinkedListNode cur = head;
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
        return head;
    }
    public static void main(String[] s){
        SinglyLinkedListNode head = null;
        print(head);
        head = insertNodeAtTail(head, 141);
        print(head);
        head = insertNodeAtTail(head, 302);
        print(head);
        head = insertNodeAtTail(head, 164);
        print(head);
        head = insertNodeAtTail(head, 530);
        print(head);
        head = insertNodeAtTail(head, 474);
        print(head);
        head = reverse(head);
        print(head);
    }
    static void print(SinglyLinkedListNode head){
        SinglyLinkedListNode curr = head;
        while(curr!= null){
            System.out.print(curr.data+" ->");
            curr = curr.next;
        }
        System.out.print("NULL");
        System.out.println();
    }
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode last = new SinglyLinkedListNode();
        last.data = data;
        last.next = null;
        if(head == null){
            return last;
        }
        if(head.next == null){
            head.next = last;
            return head;
        }
        SinglyLinkedListNode curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = last;
        return head;
    }
}
