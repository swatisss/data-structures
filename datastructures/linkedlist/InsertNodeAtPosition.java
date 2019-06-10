/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.linkedlist;

import static datastructures.linkedlist.InsertElementAtHead.print;
    
public class InsertNodeAtPosition {
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode last = new SinglyLinkedListNode();
        last.data = data;
        last.next = null;
        if(head == null){
            return last;
        }
        last.next = head;
        return last;
    }
    public static void main(String[] s){
      SinglyLinkedListNode head = null;
        print(head);
        head = insertNodeAtHead(head, 7);
        print(head);
        head = insertNodeAtHead(head, 13);
        print(head);
        head = insertNodeAtHead(head, 16);
        print(head);
        head = insertNodeAtGivenPosition(head,1,2);
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

    private static SinglyLinkedListNode insertNodeAtGivenPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode node = new SinglyLinkedListNode();
        node.data = data;
        node.next = null;    
        if(head == null){
            return node;
        }
        int pos = 0;
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode curr = head;
        while(pos < position && curr != null){
            prev = curr;
            curr = curr.next;
//            System.out.print("prev is "+ prev.data);
//            System.out.print("current is "+ curr.data);
//            System.out.println();
            pos++;
        }
        prev.next = node;
        node.next = curr;
        return head;
    }
}
