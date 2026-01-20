// Given an integer array nums, move all the 0's to the end of the array. The relative order of the other elements must 
// remain the same.

package Array;

import java.util.*;

public class move_zero_to_end {

    public static void move_zero(int[] arr , int n) {

        int count = 0;

        System.out.println("Moving zeroes to end :");

        for(int i = 0 ; i < n ; i ++) {
            if(arr[i] == 0) {
                count++;
                continue;
            }
            else {
                System.out.print(arr[i] + " ");
            }
        }

        for(int i = 0 ; i < count ; i++) {
            System.out.print("0 ");
        }
        System.out.println();
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

        move_zero(arr, n);

        sc.close();
    }
}

//output
// Enter size of array : 
// 6
// Enter elements of array : 
// 0
// 1
// 4
// 0
// 5
// 2
// Moving zeroes to end :
// 1 4 5 2 0 0