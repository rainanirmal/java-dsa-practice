// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value. If the target is not found in the array, return [-1, -1].

package Binary_search_on_1D_array;

import java.util.*;

public class first_and_last_occurance {

    public static void first_and_last(int[] arr , int n , int k) {
        
        int low = 0;
        int high = n - 1;

        int first = -1;
        int last = -1;
        
        while (low <= high) {
            
            int mid = low + (high - low) / 2;

            if (arr[mid] >= k) {
                first = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        low = 0;
        high = n - 1;
        while (low <= high) {
            
            int mid = low + (high - low) / 2;

            if (arr[mid] > k) {
                last = mid - 1;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        if (first == n - 1 || arr[first] != k) {
            System.out.println("The target is " + k + " , which is not present in the array. Therefore, the output is [-1, -1].");
        }
        else {
            System.out.println("The target is " + k + " , and it appears in the array so the output is [ " +first + " , " + last + " ]");
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

        System.out.println("Enter target : ");
        int k = sc.nextInt();

        first_and_last(arr, n, k);  

        sc.close();
    }
}

// output
// Enter size of array : 
// 6
// Enter elements of array : 
// 5
// 7
// 7
// 8
// 8
// 10
// Enter target : 
// 8
// The target is 8 , and it appears in the array so the output is [ 3 , 4 ]

// Enter size of array : 
// 6
// Enter elements of array : 
// 5
// 7
// 7
// 8
// 8
// 10
// Enter target : 

// 9    
// The target is 9 , which is not present in the array. Therefore, the output is [-1, -1].