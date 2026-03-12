// Given an integer array a of size n and an integer k. Split the array a into k non-empty subarrays such that the largest sum of any subarray is minimized. Return the minimized largest sum of the split.

package Binary_search_on_answer;

import java.util.*;

public class split_array_with_largest_sum {

    public static int max (int[] arr) {

        int max = arr[0];

        for(int i = 0 ; i < arr.length ; i ++) {
            if(arr[i] > max) {
                max = arr[i];
            } 
        }

        return max;
    }

    public static int sum(int[] arr) {

        int sum = 0;

        for(int i = 0 ; i < arr.length ; i ++) {
            sum = sum + arr[i];
        }

        return sum;
    }

    public static int split(int[] arr , int mid , int k) {

        int recent = 0;
        int count = 1;

        for(int i = 0 ; i < arr.length ; i ++) {
            if(recent + arr[i] > mid) {
                count++;;
                recent = arr[i];
            }
            else {
                recent = recent + arr[i];
            }
        }

        return count;
    }

    public static int sub_array(int[] arr , int n , int k) {
        
        int low = max(arr);
        int high = sum(arr);

        int result = high;
        
        while (low <= high) {
            
            int mid = low + (high - low) / 2;

            int ans = split(arr, mid, k);

            if(ans <= k ) {
                result = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return result;
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

        System.out.println("Enter number of subarrays to be created : ");
        int k = sc.nextInt();

        int result = sub_array(arr, n, k);

        System.out.println("Number of subarray : " +result);

        sc.close();
    }
}

// output
// Enter size of array : 
// 5
// Enter elements of array : 
// 1
// 2
// 3
// 4
// 5
// Enter number of subarrays to be created : 
// 3
// Number of subarray : 6

// Enter size of array : 
// 3
// Enter elements of array : 
// 3
// 5
// 1
// Enter number of subarrays to be created : 
// 3
// Number of subarray : 5