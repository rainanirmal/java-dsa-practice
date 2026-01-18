// Given an array of integers nums, return the value of the largest element in the array

package Array;

import java.util.*;

public class largest_element {

    public static int largest(int[] arr , int n) {

        int max = arr[0];

        for(int i = 0 ; i < n ; i ++) {
            if(arr[i] > max) {
                max = arr[i];
            } 
        }

        return max;
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

        int result = largest(arr, n);

        System.out.println("Largest element : " +result);

        sc.close();
    }
}