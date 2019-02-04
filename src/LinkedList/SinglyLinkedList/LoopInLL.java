package LinkedList.SinglyLinkedList;

import java.util.ArrayList;

/**
 * @author : codedsun
 * Created on 03/02/19
 */
public class LoopInLL {
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
        head.next.next.next.next = new Node(5); //1->2->3->4->null
        head.next.next.next.next.next = head.next;
      //  printLinkedList(head);
        findLoopInLL(head);

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

    static void findLoopInLL(Node head) {
        ArrayList<Node> addresses = new ArrayList<>();
        boolean loopFound = false;
        while (head != null) {
            if (addresses.contains(head)) {
                loopFound = true;
                break;
            }
            addresses.add(head);
            head = head.next;

        }
        if (loopFound) {
            System.out.println("Loop Found");
        } else {
            System.out.println("No Loop Found");
        }
    }

}
