// Given an integer array nums, return a list of all the leaders in the array.
// A leader in an array is an element whose value is strictly greater than all elements to its right in the given array. The rightmost element is always a leader. The elements in the leader array must appear in the order they appear in the nums array.

package Array_medium;

import java.util.*;

public class leaders_in_array {

    public static void leaders(int[] arr , int n ) {

        System.out.println("Leaders of array : ");
        for (int i = 0; i < n - 1; i++) {
            boolean lead = true;
            for(int j = i + 1 ; j < n ; j ++) {
                if (arr[j] > arr[i]) {
                    lead = false;
                    break;
                }
            }
            if (lead) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.print(arr[n - 1]);
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
    
        leaders(arr, n);

        sc.close();
    }
}

// output
// Enter size of array : 
// 6
// Enter elements of array : 
// 1
// 2
// 5
// 3
// 1
// 2
// Leaders of array : 
// 5 3 2

// Enter size of array : 
// 6
// Enter elements of array : 
// -3
// 4
// 5
// 1
// -4
// -5
// Leaders of array : 
// 5 1 -4 -5