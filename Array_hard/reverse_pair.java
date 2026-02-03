// Given an integer array nums. Return the number of reverse pairs in the array.
// An index pair (i, j) is called a reverse pair if:
// 0 <= i < j < nums.length
// nums[i] > 2 * nums[j]

package Array_hard;

import java.util.*;

public class reverse_pair {

    public static void reverse(int[] arr , int n) {

        boolean found = false;

        System.out.println("Reverse pairs : ");
        for (int i = 0 ; i < n - 1 ; i ++) {
            for(int j = i ; j < n ; j ++) {
                if(i < j && j < n){
                    if (arr[i] > arr[j] * 2) {
                        System.out.println("[ " + arr[i] + " , " + arr[j] + " ] ");
                        found = true;
                    }
                }
            }            
        }

        if(!found) {
            System.out.print("0");
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

        reverse(arr, n);

        sc.close();
    }
}

// output
// Enter size of array : 
// 5
// Enter elements of array : 
// 6
// 4
// 1
// 2
// 7
// Reverse pairs : 
// [ 6 , 1 ]
// [ 6 , 2 ]
// [ 4 , 1 ]

// Enter size of array : 
// 5
// Enter elements of array : 
// 5
// 4
// 4
// 3
// 3
// Reverse pairs : 
// 0