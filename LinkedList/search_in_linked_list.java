// You are given the head of a singly linked list and an integer key.
// Return true if the key exists in the linked list, otherwise return false.

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

public class search_in_linked_list {

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

    private static boolean search_int(Node head , int x) {

        Node temp = head;
        boolean isPresent = false;

        while (temp != null) {
            if (temp.data == x) {
                isPresent = true;
                break;
            }
            temp = temp.next;
        }

        return isPresent;
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

        System.out.println("Enter element to search in linked list : ");
        int x = sc.nextInt();

        Node head = convertToLL(list);
        Node temp = head;

        System.out.println("Traversing array as a linked list : ");

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

        temp = head;

        boolean present = search_int(temp, x);

        if (present) {
            System.out.println("The key " + x + " is present in linked list");
        }
        else {
            System.out.println("The key " + x + " is not spresent in linked list");
        }

        sc.close();
    }
    
}

// output
// Enter the size of list : 
// 4
// Enter elements of list : 
// 1
// 2
// 3
// 4
// Enter element to search in linked list : 
// 1
// Traversing array as a linked list : 
// 1 -> 2 -> 3 -> 4 -> null
// The key 1 is present in linked list

// Enter the size of list : 
// 3
// Enter elements of list : 
// 1
// 2
// 3
// Enter element to search in linked list : 
// 6
// Traversing array as a linked list : 
// 1 -> 2 -> 3 -> null
// The key 6 is not spresent in linked list