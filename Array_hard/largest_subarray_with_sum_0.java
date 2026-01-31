// You are given an integer array arr of size n which contains both positive and negative integers. Your task is to find the length of the longest contiguous subarray with sum equal to 0.

package Array_hard;

import java.util.*;

public class largest_subarray_with_sum_0 {

    public static void subarray(int[] arr , int n) {

        int start = 0;
        int end = 0;

        int count = 0;
        int max_count = 0;

        int sum = 0;

        for(int i = 0 ; i < n ; i ++) {
            sum = 0;
            count = 0;
            for(int j = i ; j < n ; j ++) {
                sum = sum + arr[j];
                count++;
                if(sum == 0) {
                    if(count > max_count) {
                        max_count = count;
                        start = i;
                        end = j;
                    }
                }
            }
        }

        System.out.println("Length of the longest contiguous subarray with sum equal to 0 is : " +max_count);
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

        subarray(arr, n);

        sc.close();
    }
}

// output
// Enter size of array : 
// 8
// Enter elements of array : 
// 15
// -2
// 2
// -8
// 1
// 7
// 10
// 23
// Length of the longest contiguous subarray with sum equal to 0 is : 5
// -2 2 -8 1 7