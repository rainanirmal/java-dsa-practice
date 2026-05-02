package Sorting;

import java.util.*;

public class recursive_bubble_sort {

    public static void bubble_sort(int[] arr , int n) {

        if (n <= 0) {
            return;
        }

        for(int i = 0 ; i < n - 1 ; i ++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        bubble_sort(arr, n - 1);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of array : ");
        for(int i = 0 ; i < n ; i ++) {
            arr[i] = sc.nextInt();
        }

        bubble_sort(arr, n);

        System.out.println("Sorted array : ");
        for(int i = 0 ; i < n ; i ++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

// output
// Enter size of array : 
// 6
// Enter elements of array : 
// 13
// 46
// 24
// 52
// 20
// 9
// Sorted array : 
// 9 13 20 24 46 52
// Enter size of array : 
// 4
// Enter elements of array : 
// 4
// 3
// 2
// 1
// Sorted array : 
// 1 2 3 4 