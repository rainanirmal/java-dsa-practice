// Given an integer array nums. Return the number of inversions in the array.Two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j

package Array_hard;

import java.util.*;

public class inversion_count {

    public static void inversion(int[] arr , int n) {
        
        int count = 0;

        for(int i = 0 ; i < n ; i ++) {
            for(int j = 0 ; j < n ; j ++) {
                if(arr[i] > arr[j] && i < j) {
                    count++;
                }
            }
        }

        System.out.println("Inversion count : " +count);
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

        inversion(arr, n);

        sc.close();
    }
}

// output
// Enter size of array : 
// 6
// Enter elements of array : 
// 2
// 3
// 7
// 1
// 3
// 5
// Inversion count : 5

// Enter size of array : 
// 6
// Enter elements of array : 
// -10
// -5
// 6
// 11
// 15
// 17
// Inversion count : 0