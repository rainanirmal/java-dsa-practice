// Given a sorted array of nums and an integer x, write a program to find the upper bound of x.
// The upper bound of x is defined as the smallest index i such that nums[i] > x.
// If no such index is found, return the size of the array.

package Binary_search_on_1D_array;

import java.util.*;

class upper_bound {

    public static int upper(int[] arr , int n , int k) {

        for(int i = 0 ; i < n ; i ++) {
            if (arr[i] > k) {
                return i;
            }
        }

        return n;
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

        int upper = upper(arr, n, k);
        System.out.println("Index " + upper + " is the smallest index such that arr[" + upper + "] > " + k);

        sc.close();
    }
}

// output
// Enter size of array : 
// 4
// Enter elements of array : 
// 1
// 2
// 2
// 3
// Enter target : 
// 2
// Index 3 is the smallest index such that arr[3] > 2