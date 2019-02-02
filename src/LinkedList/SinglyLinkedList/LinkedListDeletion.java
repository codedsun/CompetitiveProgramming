package LinkedList.SinglyLinkedList;

/**
 * @author : codedsun
 * Created on 03/02/19
 */

public class LinkedListDeletion {

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
        head.next = new Node(2); //1->2->null
        head.next.next = new Node(3); //1->2->3->null
        head.next.next.next = new Node(4); //1->2->3->4->null
        printLinkedList(head);

        //Deletion of the whole linkedlist then do * head = null

        //Deletion of specific key
        deleteKey(2, head);

        //Deletion at specific position
        deletionAtPosition(1, head);

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

    private static void deleteKey(int element, Node head) {
        //O(N) complexity
        //@param : element = The key to be deleted from the linkedlist
        Node prev = head;
        Node temp = head;
        head = head.next;
        if (prev.element == element) {
            temp = temp.next;
            printLinkedList(temp);
            return;
        }
        while (head != null) {
            if (head.element == element) {
                prev.next = head.next;
            }
            prev = prev.next;
            head = head.next;
        }
        printLinkedList(temp);
    }

    private static void deletionAtPosition(int position, Node head) {
        //O(N) Complexity
        Node temp = head;
        int count = 1;
        while (head != null) {
            if (count == position) {
                deleteKey(head.element, temp);
                return;
            }
            count++;
            head = head.next;
        }
    }

}
