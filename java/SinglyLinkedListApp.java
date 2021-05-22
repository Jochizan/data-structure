import com.tda.SinglyLinkedList;
import com.tda.SinglyLinkedListNode;

import java.util.Scanner;
import java.io.*;

public class SinglyLinkedListApp {

    private static final Scanner scanner = new Scanner(System.in);

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newHead = new SinglyLinkedListNode(data);

        if (head == null) {
            head = newHead;
        } else {
            SinglyLinkedListNode node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = newHead;
        }
        return head;
    }

    public static void main(String[] args) throws IOException {
        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, llistItem);

            llist.head = llist_head;
        }

        SinglyLinkedListNode.printSinglyLinkedList(llist.head, " -> ");
        scanner.close();
    }
}
