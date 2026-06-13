// Given the head of a singly linked list and an integer X, insert a node with value X at the head of the linked list and return 
// the head of the modified list.

package LinkedList;

import java.util.*;

public class insertion_at_head {

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

        sc.close();
    }
    
}
