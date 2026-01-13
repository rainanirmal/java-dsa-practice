// Given an array arr of n elements. The task is to reverse the given array. The reversal of array should be inplace.

package Basics.Recursion;

import java.util.Scanner;

public class reverse_array {
    
    public static void reverse(int[] arr , int start , int end) {

        if(start >= end) {
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse(arr, start + 1, end - 1);

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements : ");
        for(int i = 0 ; i < n ; i ++) {
            arr[i] = sc.nextInt();
        }

        reverse(arr, 0, n - 1);

        System.out.println("Reversed array : ");
        for(int i = 0 ; i < n ; i ++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
