// Given the head of a singly linked list and an integer X, insert a node with value X at the head of the linked list and return 
// the head of the modified list.

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

public class insertion_at_head {

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

    private static Node insert_at_head(Node head , int value) {
        
        Node temp = new Node(value , head);
        return temp;
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

        System.out.println("Enter element to add at head of linked list : ");
        int x = sc.nextInt();

        Node head = convertToLL(list);
        Node temp = insert_at_head(head, x);

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");

        sc.close();
    }
    
}
