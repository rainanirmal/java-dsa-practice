// Given an integer array nums, sorted in ascending order (may contain duplicate values) and a target value k. Now the array is rotated at some pivot point unknown to you. Return True if k is present and otherwise, return False.

package Binary_search_on_1D_array;

import java.util.*;

public class search_in_rotated_duplicate_array {

    public static int search_in_duplicate_array(int[] arr , int n , int k) {

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            
            int mid = low + (high - low) / 2;

            if(arr[mid] == k) {
                return mid;
            }

            if(arr[low] <= arr[mid]) { // here it checked with arr[mid] because it is used to check whether the left side is sorted or right side
                if(arr[low] <= k && k < arr[mid]) // why k <= arr[mid] because we had checked whether arr[mid] == k or not 
                {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
            else {
                if(arr[low] < k && k <= arr[high]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }
        return -1;
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

        System.out.println("Enter target : ");
        int k = sc.nextInt();

        int result = search_in_duplicate_array(arr, n, k);

        if(result < 0) {
            System.out.println("Ther target value " + k + " is not present in the array");
        }
        else {
            System.out.println("Ther target value " + k + " is present in the array");
        }

        sc.close();
    }
}

// output
// Enter size of array : 
// 10
// Enter elements of array : 
// 7
// 8
// 1
// 2
// 3
// 3
// 3
// 4
// 5
// 6
// Enter target : 
// 3
// Ther target value 3 is present in the array

// Enter size of array : 
// 5
// Enter elements of array : 
// 4
// 5
// 1
// 2
// 3
// Enter target : 
// 8
// Ther target value 8 is not present in the array