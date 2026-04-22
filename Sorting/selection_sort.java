// select minimum and swap

package Sorting;

import java.util.*;

public class selection_sort {

    public static void selection(int arr[] , int n) {
        for(int i = 0 ; i <= n - 2 ; i ++) {
            int min = i;
            for(int j = i ; j <= n - 1; j ++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr, i, min);
        }
    }

    public static void swap(int arr[] , int i , int min) {
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
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

        selection(arr, n);

        System.out.println();

        System.out.println("Sorted array : ");
        for(int i = 0 ; i <= n - 1 ; i ++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
    
}

// output
// Enter size of array : 
// 5
// Enter elements of array : 
// 5
// 4
// 4
// 1
// 1

// Sorted array : 
// 1 1 4 4 5 