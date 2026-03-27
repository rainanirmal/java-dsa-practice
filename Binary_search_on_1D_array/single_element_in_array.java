// Given an array nums sorted in non-decreasing order. Every number in the array except one appears twice. Find the single number in the array.

package Binary_search_on_1D_array;

import java.util.*;

public class single_element_in_array {

    public static int single_element(int[] arr , int n) {

        int low = 0;
        int high = n - 1;

        while (low < high) {
            
            int mid = low + (high - low) / 2;

            if (mid % 2 != 0) {
                mid = mid - 1;
            }

            if(arr[mid] == arr[mid + 1]) {
                low = mid + 2;
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

        int result = single_element(arr, n);

        System.out.println("Single element : " +result);
        sc.close();
    }
}

// output
// Enter size of array : 
// 11
// Enter elements of array : 
// 1
// 1
// 2
// 2
// 3
// 3
// 4
// 5
// 5
// 6
// 6
// Single element : 4

// Enter size of array :
// 5
// Enter elements of array :
// 1
// 1
// 3
// 5
// 5
// Single element : 3