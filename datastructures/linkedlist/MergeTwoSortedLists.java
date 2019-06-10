/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.linkedlist;

import static datastructures.linkedlist.GetNthNodeFromTail.insertNodeAtTail;
import static datastructures.linkedlist.ReverseLinkedList.print;

public class MergeTwoSortedLists {

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1 == null && head2 == null) {
            return null;
        }
        SinglyLinkedListNode c1 = head1;
        SinglyLinkedListNode c2 = head2;
        SinglyLinkedListNode dummy = new SinglyLinkedListNode();
        dummy.data = 0;
        dummy.next= null;
        SinglyLinkedListNode l3 = dummy; 
        while( c1 != null && c2 != null){
            if( c1.data <= c2.data){
             
                    l3.next = c1;
      
                c1 = c1.next;
            }
            else{
              
                    l3.next = c2;
                     c2 = c2.next;  
                }
                l3 = l3.next;
               
            }
        if( c1 == null && c2 != null){
            l3.next = c2;
        }
         if( c2 == null && c1 != null){
            l3.next = c1;
        }
//        System.out.println(" c1 "+c1);
//        System.out.println(" c2 "+c2);
//         System.out.println(" n "+n);
//          System.out.println(" p "+p);
        return dummy.next;
    }

    public static void main(String[] args) {
        SinglyLinkedListNode head = null;
        SinglyLinkedListNode head1 = null;
        head = insertNodeAtTail(head, 1);
        head = insertNodeAtTail(head, 2);
        head = insertNodeAtTail(head, 3);
        print(head);
        head1 = insertNodeAtTail(head1, 2);
        head1 = insertNodeAtTail(head1, 3);
        head1 = insertNodeAtTail(head1, 4);
        print(head1);
        print(mergeLists(head, head1));
    }

}
