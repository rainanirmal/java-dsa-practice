package Sorting;

import java.util.*;

public class bubble_sort {
    
    public static void bubble(int[] arr , int n) {

        // for(int i = n - 1 ; i >= 1 ; i --) {
        //     for(int j = 0 ; j <= i - 1; j ++) {
        //         if(arr[j] > arr[j + 1]) {
        //             int temp = arr[j + 1];
        //             arr[j + 1] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }


        for(int i = 1 ; i < n ; i ++) {
            int didSwap = 0;
            for(int j = 0 ; j < n - i - 1 ; j ++) {
                if (arr[j] > arr[j + 1]) {
                    bubble_swap(arr, j);
                    didSwap = 1;
                }
            }
            if (didSwap == 0) {
                break; //used to break the loop if elements are already in sorted order
            }
        }
    } 

    public static void bubble_swap(int[] arr , int j) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
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

        bubble(arr, n);

        System.out.println("Sorted array : ");
        for(int i = 0 ; i < n ; i ++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
