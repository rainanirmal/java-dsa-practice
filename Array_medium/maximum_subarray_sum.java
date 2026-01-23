// Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.
// A subarray is a contiguous non-empty sequence of elements within an array.

package Array_medium;

import java.util.*;

public class maximum_subarray_sum {

    public static void max_subarray(int[] arr , int n) {

        int sum = 0;
        int max_sum = 0;
        int start = 0;
        int end = 0;

        for(int i = 0 ; i < n ; i ++) {
            sum = 0;
            for(int j = i ; j < n ; j ++) {
                sum = sum + arr[j];

                if(sum > max_sum) {
                    max_sum = sum;

                    start = i;
                    end = j;
                }
            }
        }

        System.out.println("Subarray from " +start+ " to " +end+ " has largest sum : " +max_sum);
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

        max_subarray(arr, n);

        sc.close();
    }
    
}
