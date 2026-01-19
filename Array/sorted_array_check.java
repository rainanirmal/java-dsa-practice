// Given an array nums of n integers, return true if the array nums is sorted in non-decreasing order or else false.

package Array;

import java.util.*;

public class sorted_array_check {

    public static boolean shorted(int[] arr , int n) {

        for(int i = 0 ; i < n - 1 ; i ++) {
            if(arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
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

        if(shorted(arr, n)) {
            System.out.println("Sorted !!");
        }
        else {
            System.out.println("Not sorted !");
        }
        sc.close();
    }
}
