package LinkedList_Doubly;

import java.util.*;

public class basic_double_linked_list {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of list : ");
        int size = sc.nextInt();

        int[] list = new int[size];

        System.out.println("Enter elements of list : ");
        for(int i = 0 ; i < size ; i ++) {
            list[i] = sc.nextInt();
        }

        sc.close();
        
    }
    
}
