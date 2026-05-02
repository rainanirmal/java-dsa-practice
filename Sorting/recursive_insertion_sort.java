package Sorting;

import java.util.*;

public class recursive_insertion_sort {

    public static void insertion_sort(int[] arr , int n , int j) {

        if (j >= n) {
            return;
        }

        int i = j;

        while (i > 0 && arr[i - 1] > arr[i]) {
            int temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
            i--;
        }

        insertion_sort(arr, n, j + 1);
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

        insertion_sort(arr, n, 0);

        System.out.println("Sorted array : ");
        for(int i = 0 ; i < n ; i ++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

// output
// Enter size of array : 
// 7
// Enter elements of array : 
// 14
// 9
// 15
// 12
// 6
// 8
// 13
// Sorted array : 
// 6 8 9 12 13 14 15

// Enter size of array : 
// 5
// Enter elements of array : 
// 5
// 4
// 3
// 2
// 1
// Sorted array : 
// 1 2 3 4 5