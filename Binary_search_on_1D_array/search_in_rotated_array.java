// Given an integer array nums, sorted in ascending order (with distinct values) and a target value k. The array is rotated at some pivot point that is unknown. Find the index at which k is present and if k is not present return -1.

package Binary_search_on_1D_array;

import java.util.*;

public class search_in_rotated_array {

    public static int search_in_rotated(int[] arr , int n , int k) {

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            
            int mid = low + (high - low) / 2;

            if(arr[mid] == k) {
                return mid;
            }

            if (arr[low] <= arr[mid]) { 
                if(arr[low] <= k && k < arr[mid]) {
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

        int result = search_in_rotated(arr, n, k);

        System.out.println("Target index : " + result);

        sc.close();
    }
}

// output
// Enter size of array : 
// 7
// Enter elements of array : 
// 4
// 5
// 6
// 7
// 0
// 1
// 2
// Enter target : 
// 0
// Target index : 4

// Enter size of array : 
// 7
// Enter elements of array : 
// 4
// 5
// 6
// 7
// 0
// 1
// 2
// Enter target : 
// 3
// Target index : -1