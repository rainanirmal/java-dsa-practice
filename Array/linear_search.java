// Given an array of integers nums and an integer target, find the smallest index (0 based indexing) where the target 
// appears in the array. If the target is not found in the array, return -1.

package Array;

import java.util.*;

public class linear_search {
    
    public static void search(int[] arr , int n , int element) {

        for(int i = 0 ; i < n ; i ++) {
            if(arr[i] == element) {
                System.out.println("The first occurence of " +element+ " is : " +i);
                break;
            }
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

        System.out.println("Enter element to find index : ");
        int element = sc.nextInt();

        search(arr, n, element);

        sc.close();
    }
}
