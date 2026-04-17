package CodingQuesnthirty.linkedlist;


import org.w3c.dom.Node;

import java.util.LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

}

public class ReverseLinkedList {

    // Function to reverse linked list
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next; // save next
            current.next = prev;          // reverse
            prev = current;               // move prev
            current = next;               // move current
        }

        return prev;
    }

    // Utility function to print list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // Creating linked list: 1 -> 2 -> 3 -> 4 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.print("Original List: ");
        printList(head);

        // Reverse the list
        head = reverseList(head);

        System.out.print("Reversed List: ");
        printList(head);
    }
}
