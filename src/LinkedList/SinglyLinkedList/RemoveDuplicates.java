package LinkedList.SinglyLinkedList;

/**
 * @author : codedsun
 * Created on 03/02/19
 */
public class RemoveDuplicates {
    private static class Node {
        int element;
        Node next;

        Node(int e) {
            this.element = e;
            next = null;
        }
    }

    static Node head = null;

    public static void main(String[] args) {

        //1->2->3->4->null
        head = new Node(1); //1->null
        head.next = new Node(1); //1->2->null
        head.next.next = new Node(2); //1->2->3->null
        printLinkedList(head);
        removeDuplicatesFromLinkedList(head);

    }

    static void printLinkedList(Node head) {
        //O(N) Complexity
        while (head != null) {
            System.out.print(head.element + " -> ");
            if (head.next == null) {
                System.out.print("null");
                System.out.println();
            }
            head = head.next;
        }
    }

    static void removeDuplicatesFromLinkedList(Node head) {
        Node temp = head;
        Node headRef = head;
        head = head.next;
        while (head != null) {
            if (temp.element == head.element) {
                temp.next = head.next;
            }
            temp = temp.next;
            head = head.next;
        }
        printLinkedList(headRef);
    }
}
