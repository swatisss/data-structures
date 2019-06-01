/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.linkedlist;

public class GetNthNodeFromTail {
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        if (head == null)
            return 0;
        int size =0;
        SinglyLinkedListNode curr = head;
        while(curr != null){
            size++;
            curr = curr.next;
        }
        int ele = size -positionFromTail;
        int o =1;
        curr = head;
        while(o != ele){
           curr = curr.next;
           o++;;
        }
        return curr.data;
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
    public static void main(String[] s){
        SinglyLinkedListNode head = null;
        print(head);
        head = insertNodeAtTail(head, 4);
        print(head);
        head = insertNodeAtTail(head, 3);
        print(head);
        head = insertNodeAtTail(head, 2);
        print(head);
        head = insertNodeAtTail(head, 1);
        print(head);
       System.out.println(getNode(head, 2));
        
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
}
