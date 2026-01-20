// Given an integer array nums, rotate the array to the left by one.

package Array;

import java.util.*;

public class left_rotate_by_one {

    public static void left_rotate(int[] arr , int n) {

        for(int i = 0 ; i < n - 2 ; i ++) {
            if(i == 0) {
                int temp = arr[n - 1];
                arr[n - 1] = arr[i];
                arr[i] = temp;
            }

            int temp = arr[i + 1];
            arr[i + 1] = arr[i];
            arr[i] = temp;
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

        left_rotate(arr, n);

        System.out.println("Left rotated array by one : ");
        for(int i = 0 ; i < n ; i ++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
    
}

// Enter size of array : 
// 5
// Enter elements of array : 
// 1
// 2
// 3
// 4
// 5
// Left rotated array by one : 
// 2 3 4 5 1