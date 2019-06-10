/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.linkedlist;

import static datastructures.linkedlist.GetNthNodeFromTail.insertNodeAtTail;
import static datastructures.linkedlist.InsertElementAtTail.print;

public class CompareTwoLinkedList {
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if(head1==null && head2== null){
            return true;
        }
        if(head1==null || head2== null){
            return false;
        }
        SinglyLinkedListNode cur1= head1;
        SinglyLinkedListNode cur2 = head2;
        while(cur1 != null && cur2 != null){
            if(cur1.data != cur2.data){
                return false;
            }
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        if(cur1 == null && cur2 == null){
            return true;
        }
        if(cur1 == null && cur2 != null){
            return false;
        }
        if(cur2 == null && cur1 != null){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        SinglyLinkedListNode head = null;
        head = insertNodeAtTail(head, 1);
        print(head);
        SinglyLinkedListNode head1 = null;
        head1 = insertNodeAtTail(head1, 1);
        head1 = insertNodeAtTail(head1, 2);
        print(head1);
        System.out.print(compareLists(head, head1));
    }
}
