// Given an integer array nums of size n, sorted in ascending order with distinct values. The array has been right rotated an unknown number of times, between 0 and n-1 (including). Determine the number of rotations performed on the array.

package Binary_search_on_1D_array;

import java.util.*;

public class count_of_array_rotation {

    public static void count(int[] arr , int  n) {

        int low = 0;
        int high = n - 1;

        if(arr[low] <= arr[high]) {
            System.out.println("No array rotation");
            return;
        }

        while(low < high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[high]) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
        int rotate = low;

        System.out.println("Total array rotation : " +rotate);
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

        count(arr, n);

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
// Total array rotation : 4

// Enter size of array : 
// 5
// Enter elements of array : 
// 4
// 5
// 0
// 1
// 2
// Total array rotation : 2