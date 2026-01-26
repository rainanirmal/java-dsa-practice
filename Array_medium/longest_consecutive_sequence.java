// Given an array nums of n integers.
// Return the length of the longest sequence of consecutive integers. The integers in this sequence can appear in any order.

package Array_medium;

import java.util.*;

class longest_consecutive_sequence {

    public static void consecutive(int[] arr , int n ) {

        for(int i = n - 1 ; i > 0 ; i --) {
            for(int j = 0 ; j < i ; j ++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int count = 1;
        int max = 1;

        for(int i = 0 ; i < n - 1 ; i ++) {
            if(arr[i + 1] == arr[i] + 1) {
                count++;
            }
            else {
                count = 1;
            }

            if(count > max) {
                max = count;
            }
        }

        System.out.println("Longest consecutive array length : " +max);
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

        consecutive(arr, n);

        sc.close();
    }
    
}