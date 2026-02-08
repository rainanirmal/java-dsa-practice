// You are given a sorted array of integers arr and an integer target. Your task is to determine how many times target appears in arr.Return the count of occurrences of target in the array.

package Binary_search_on_1D_array;

import java.util.*;

public class occurrence_count {

    public static void count(int[] arr , int n , int k) {

        int low = 0;
        int high = n - 1;

        int count = 0;
        int first = -1;
        int last = -1;

        while (low <= high) {
            
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                first = mid;
                high = mid - 1;
            }

            if(arr[mid] >= k) {
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

            if (arr[mid] == k) {
                last = mid;
                low = mid + 1;
            }

            if(arr[mid] > k) {
                last = mid - 1;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        if(first != -1) {
            count = last - first + 1;
        }

        System.out.println("Count : " + count);
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

        count(arr, n, k);

        sc.close();
    }    
}

// output
// Enter size of array : 
// 7
// Enter elements of array : 
// 0
// 0
// 1
// 1
// 1
// 2
// 3
// Enter target : 
// 1
// Count : 3

// Enter size of array : 
// 5
// Enter elements of array : 
// 4
// 4
// 4
// 4
// 4
// Enter target : 
// 4
// Count : 5