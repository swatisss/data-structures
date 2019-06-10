/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.linkedlist;

import static datastructures.linkedlist.GetNthNodeFromTail.insertNodeAtTail;
import static datastructures.linkedlist.InsertElementAtTail.print;

public class MergePointOfTwoLists {
    
      static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
       int l1 = findLenthOfLinkedList(head1);
       int l2 = findLenthOfLinkedList(head1);
       SinglyLinkedListNode c1 =head1;
       SinglyLinkedListNode c2 = head2; 
       if(l1 > l2){
           int diff = l1 -l2;
           while(diff!=0){
               c1 = c1.next;
               diff--;
           }
       }
       else if( l2> l1){
          int diff = l2 -l1;
           while(diff!=0){
               c2 = c2.next;
               diff--;
           } 
       }
       while( c1.data != c2.data && c1!= null && c2 != null){
           c1 = c1.next;
           c2 = c2.next;
        }
        return c1.data;

    }
    static int findLenthOfLinkedList(SinglyLinkedListNode head){
        if(head == null){
            return 0;
        }
        int len = 0;
        SinglyLinkedListNode c = head;
        while(c != null){
            len++;
            c = c.next;
        }
        return len;
    }
    public static void main(String[] args){
        SinglyLinkedListNode head = null;
        head = insertNodeAtTail(head, 1);
        head = insertNodeAtTail(head, 2);
        head = insertNodeAtTail(head, 3);
        print(head);
        System.out.println(findLenthOfLinkedList(head));
        SinglyLinkedListNode head1 = null;
        head1 = insertNodeAtTail(head1, 11);
        //head1 = insertNodeAtTail(head1, 2);
        head1 = insertNodeAtTail(head1, 3);
        print(head1);
        System.out.println(findLenthOfLinkedList(head1));
        System.out.print(findMergeNode(head, head1));
    }
    
}
