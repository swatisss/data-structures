
package datastructures.linkedlist;

import static datastructures.linkedlist.CompareTwoLinkedList.compareLists;
import static datastructures.linkedlist.GetNthNodeFromTail.insertNodeAtTail;
import static datastructures.linkedlist.InsertElementAtTail.print;

public class DeleteNthNode {
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        if(position == 0){
            return head.next;
        }
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode curr = head;
        while(position > 0){
            prev= curr;
            curr= curr.next;
            position--;
        }
        prev.next = curr.next;
        return head;
    }

     public static void main(String[] args){
        SinglyLinkedListNode head = null;
        head = insertNodeAtTail(head, 20);
        head = insertNodeAtTail(head, 6);
        head = insertNodeAtTail(head, 2);
        head = insertNodeAtTail(head, 19);
        head = insertNodeAtTail(head, 7);
        head = insertNodeAtTail(head, 4);
        head = insertNodeAtTail(head, 15);
        print(head);
        head = deleteNode(head, 3);
        print(head);
    }
}
