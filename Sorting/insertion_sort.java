package Sorting;

import java.util.*;

public class insertion_sort {

    public static void insertion(int[] arr , int n) {

        for(int i = 0 ; i < n ; i ++) {
            int j = i ;
            while(j > 0 && arr[j - 1] > arr[j]) {
                insertion(arr, j);
                j --;
            }
        }
    }
    
    public static void insertion_swap(int[] arr , int j) {
        int temp = arr[j - 1];
        arr[j - 1] = arr[j];
        arr[j] = temp;
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

        insertion(arr, n);

        System.out.println("Sorted array : ");
        for(int i = 0 ; i < n ; i ++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

// output
// Enter size of array : 
// 5
// Enter elements of array : 
// 7
// 4
// 1
// 5
// 3
// Sorted array : 
// 1 3 4 5 7 