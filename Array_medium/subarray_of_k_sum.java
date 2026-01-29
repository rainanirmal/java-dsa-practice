// Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

package Array_medium;

import java.util.*;

public class subarray_of_k_sum {

    public static void sum_of_sub(int[] arr , int n , int k) {

        int sum = 0;
        int count = 0;

        for (int i = 0; i <  n ; i++) {
            sum = 0;
            for(int j = i ; j < n ; j ++) {
                sum = sum + arr[j];
                if(sum == k) {
                    System.out.print("Subarray of sum " +k+ " is : ");
                    for(int m = i ; m <= j ; m ++) {
                        System.out.print(arr[m] + " ");
                    }
                    System.out.println();
                    count ++;
                }
            }
        }

        System.out.println("Total number of subarrays of sum " + k + " is : " + count);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of array : ");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter sum : ");
        int k = sc.nextInt();

        sum_of_sub(arr, n, k);

        sc.close();
    }
    
}

// output
// Enter size of array : 
// 5
// Enter elements of array : 
// 3
// 5
// 7
// 9
// 10
// Enter sum : 
// 15
// Subarray of sum 15 is : 
// 3 5 7
// Total number of subarrays of sum 15 is : 1