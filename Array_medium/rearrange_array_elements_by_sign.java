// Given an integer array nums of even length consisting of an equal number of positive and negative integers.Return the answer array in such a way that the given conditions are met:
// Every consecutive pair of integers have opposite signs.
// For all integers with the same sign, the order in which they were present in nums is preserved.
// The rearranged array begins with a positive integer.

package Array_medium;

import java.util.*;

public class rearrange_array_elements_by_sign {

    public static void rearrange(int[] arr , int n) {

        int a = 0;
        int b = 1;
        int[] temp = new int[n];

        for(int i = 0 ; i < n ; i ++) {
            if(arr[i] > 0 ) {
                temp[a] = arr[i];
                a = a + 2;
            }
            else {
                temp[b] = arr[i];
                b = b + 2;
            }
        }

        System.out.println("Rearranged array : ");
        for(int i = 0 ; i < n ; i ++) {
            System.out.print(temp[i] + " ");
        }
   }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter even size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of array : ");
        for(int i = 0 ; i < n ; i ++) {
            arr[i] = sc.nextInt();
        }

        rearrange(arr, n);

        sc.close();
    }
}

// output
// Enter even size of array : 
// 6
// Enter elements of array : 
// 2
// 4
// 5
// -1
// -3
// -4
// Rearranged array : 
// 2 -1 4 -3 5 -4