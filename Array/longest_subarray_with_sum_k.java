// Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. If no such sub-array exists, return 0.

package Array;

import java.util.*;

public class longest_subarray_with_sum_k {

    public static void logest_subarray(int[] arr , int n , int k) {

        int[] temp = new int[n];
        int z = 0;
        int sum = 0;
        int count = 0;

        int start = 0;
        int end = 0;

        for(int i = 0 ; i < n ; i ++) {
            sum = 0;
            count = 0;
            for(int j = i ; j < n ; j ++) {
                sum = sum + arr[j];
                count++;
                if(sum == k) {
                    temp[z++] = count;

                    if(count > 0) {
                        start = i;
                        end = j;
                    }
                }
            }
        }

        int max = temp[0];
        for(int i = 0 ; i < z ; i ++) {
            if(temp[i] > max) {
                max = temp[i];
            }
        }

        System.out.println("Longest subarray contains " + max+ " elements.");
        System.out.println("Elements are : ");
        for(int i = start ; i <= end ; i ++) {
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

        System.out.println("Enter sum : ");
        int k = sc.nextInt();

        logest_subarray(arr, n, k);

        sc.close();
    }
}

// output
// Enter size of array :
// 6
// Enter elements of array : 
// 10
// 5
// 2
// 1
// 7
// 9
// Enter sum : 
// 15
// Longest subarray contains 4 elements.
// Elements are :
// 5 2 1 7
