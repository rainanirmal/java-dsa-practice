// Given an integer array nums of size N, sorted in ascending order with distinct values, and then rotated an unknown number of times (between 1 and N), find the minimum element in the array.

package Binary_search_on_1D_array;

import java.util.*;

public class minimum_in_rotated_array {

    public static int minimum(int[] arr , int n) {

        int low = 0;
        int high = n - 1;

        if(arr[low] < arr[high]) {
            return arr[low];
        }

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] > arr[high]) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
        return arr[low];
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

        int result = minimum(arr, n);

        System.out.println("Minimum element : " + result);

        sc.close();
    }
}

// output
// Enter size of array : 
// 8
// Enter elements of array : 
// 4
// 5
// 6
// 7
// 0
// 1
// 2
// 3
// Minimum element : 0

// Enter size of array : 
// 7
// Enter elements of array : 
// 4
// 5
// 6
// 7
// -7
// 1
// 2
// Minimum element : -7