
package datastructures.linkedlist;
public class InsertElementAtHead {
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
        head = insertNodeAtHead(head, 141);
        print(head);
        head = insertNodeAtHead(head, 302);
        print(head);
        head = insertNodeAtHead(head, 164);
        print(head);
        head = insertNodeAtHead(head, 530);
        print(head);
        head = insertNodeAtHead(head, 474);
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
    
}
