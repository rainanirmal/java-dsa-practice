// You are given the head of a singly linked list. Your task is to return the number of nodes in the linked list.

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

public class length_of_linked_list {

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
        int count = 0;

        System.out.println("Traversing array as a linked list : ");

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
            count++;
        }
        System.out.println("null");

        System.out.println("Length of linked list : " + count);

        sc.close();
    }
    
}
