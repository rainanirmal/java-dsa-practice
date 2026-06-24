// Basic Linked List concept demonstration using arrays for visualization

package LinkedList;

import java.util.*;

class Node {

    int data;
    Node next;

    Node(int data , Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class basic_linked_list {

    private static Node convertToLL(int[] arr) {

        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i = 1 ; i < arr.length ; i ++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of list : ");
        int size = sc.nextInt();

        int[] list = new int[size];

        System.out.println("Enter elements of list : ");
        for(int i = 0 ; i < size ; i ++) {
            list[i] = sc.nextInt();
        }

        Node head = convertToLL(list);
        Node temp = head;

        System.out.println("Traversing array as a linked list : ");

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");

        System.out.println();

        sc.close();
    }

}

// output
// Enter the size of list : 
// 5
// Enter elements of list : 
// 1
// 2
// 3
// 4
// 5
// Traversing array as a linked list : 
// 1 -> 2 -> 3 -> 4 -> 5 -> null