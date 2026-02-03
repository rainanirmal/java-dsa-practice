// Given an integer array nums. Find the subarray with the largest product, and return the product of the elements present in that subarray. A subarray is a contiguous non-empty sequence of elements within an array

package Array_hard;

import java.util.*;

public class maximum_prduct_subarray {

    public static void max_product(int[] arr , int n) {

        int product = 1;
        int max_product = 0;

        int start = 1;
        int end = 1;

        for(int i = 0 ; i < n ; i ++) {
            product = 1;
            for(int j = i ; j < n ; j ++) {
                product = product * arr[j];
                if(product > max_product) {
                    max_product = product;
                    start = i;
                    end = j;
                }
            }
        }

        if(product == 1) {
            System.out.println("No maximum product subarray");
        }
        else {
            System.out.println("Maximum product subarray with product of " + max_product + " : ");
            System.out.print("[ ");
            for(int i = start ; i <= end ; i ++) {
                System.out.print(arr[i] + " ");
            }
            System.out.print("]");
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

        max_product(arr, n);

        sc.close();
    }
    
}

// output
// Enter size of array : 
// 6
// Enter elements of array : 
// 4
// 5
// 3
// 7
// 1
// 2
// Maximum product subarray with product of 840 : 
// [ 4 5 3 7 1 2 ]

// Enter size of array : 
// 5
// Enter elements of array : 
// 1
// 2
// 0
// 4
// 5
// Maximum product subarray with product of 20 : 
// [ 4 5 ]