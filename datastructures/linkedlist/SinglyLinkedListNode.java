/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.linkedlist;

class SinglyLinkedListNode {
  int data;
  SinglyLinkedListNode next;

    @Override
    public String toString() {
        return "SinglyLinkedListNode{" + "data=" + data + ", next=" + next + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SinglyLinkedListNode other = (SinglyLinkedListNode) obj;
        if (this.data != other.data) {
            return false;
        }
        return true;
    }
    
    
}
