package CodingQuesnthirty.linkedlist.revision;

class Node {

    Node next;
    int data;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


class ReverseLinkedList {
    //3,4,5,6,7
    //7,6,5,4,3
    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            //move one pointer ahead

            prev = current;
            current = next;
        }

        return prev;
    }

    static void pritNodeList(Node node) {
        while (node != null) {

            // System.out.println(node.data);

            System.out.println(node.data);
            node = node.next;
        }
    }


    static void main() {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);


        node = reverseList(node);
        pritNodeList(node);
    }
}