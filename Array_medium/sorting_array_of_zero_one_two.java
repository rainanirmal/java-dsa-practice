// Given an array nums consisting of only 0, 1, or 2. Sort the array in non-decreasing order.
// The sorting must be done in-place, without making a copy of the original array.

package Array_medium;

import java.util.*;

public class sorting_array_of_zero_one_two {

    public static void sort_zero_one_two(int[] arr , int n) {

        int start = 0;
        int mid = 0;
        int end = n - 1;

        while (mid <= end) {

            if(arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[start];
                arr[start] = temp;
                mid ++;
                start ++;
            }

            else if(arr[mid] == 1) {
                mid ++;
            }

            else {
                int temp = arr[mid];
                arr[mid] = arr[end];
                arr[end] = temp;
                end--;
            }
        }

        System.out.println("Sorted array : ");
        for(int i = 0 ; i < n ; i ++) {
            System.out.print(arr[i] + " ");
        }
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

        sort_zero_one_two(arr, n);

        sc.close();
    }
}

// output
// Enter size of array : 
// 5
// Enter elements of array : 
// 1
// 0
// 2
// 1
// 0
// Sorted array : 
// 0 0 1 1 2 