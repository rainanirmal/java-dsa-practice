// Given an integer array nums of even length consisting of an equal number of positive and negative integers.Return the answer array in such a way that the given conditions are met:
// Every consecutive pair of integers have opposite signs.
// For all integers with the same sign, the order in which they were present in nums is preserved.
// The rearranged array begins with a positive integer.

package Array_medium;

import java.util.*;

public class rearrange_array_elements_by_sign {

    // public static void rearrange(int[] arr , int n) {

    //     for(int i = 0 ; i < n ; i ++) {
    //         if(arr[i] > 0) {

    //         }
    //     }
    // }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of array : ");
        for(int i = 0 ; i < n ; i ++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
    }
}