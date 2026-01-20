// Given an integer array nums sorted in non-decreasing order, remove all duplicates in-place so that each unique element appears only once.
// Return the number of unique elements in the array.

package Array;

import java.util.*;

public class unique_elements {

    public static void unique(int[] arr , int n) {

        for(int i = 0 ; i < n ; i ++) {
            int min = i;
            for(int j = i + 1 ; j < n ; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp; 
        }

        int count = 0;

        System.out.println("Unique elements : ");
        for(int i = 1 ; i < n ; i ++) {
            if(arr[count] != arr[i]) {
                System.out.print(arr[count] + " ");
                count++;
            }
        }
        System.out.print(arr[count]);
        System.out.println();
        count++;
        System.out.println("Number of unique elements : " +count);
    } 
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of array  :");
        for(int i = 0 ; i < n ; i ++) {
            arr[i] = sc.nextInt();
        }

        unique(arr, n);

        sc.close();
    }
}

// Output
// Enter size of array : 
// 5
// Enter elements of array  :
// 1
// 2
// 9
// 9
// 3
// Unique elements : 
// 1 2 3 9
// Number of unique elements : 4