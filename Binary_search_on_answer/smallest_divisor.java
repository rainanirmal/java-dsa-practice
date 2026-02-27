// Given an array of integers nums and an integer limit as the threshold value, find the smallest positive integer divisor such that upon dividing all the elements of the array by this divisor, the sum of the division results is less than or equal to the threshold value.After dividing each element by the chosen divisor, take the ceiling of the result (i.e., round up to the next whole number).

package Binary_search_on_answer;

import java.util.*;

public class smallest_divisor {

    public static int high(int[] arr) {

        int high = arr[0];
        for(int i = 1 ; i < arr.length ; i ++) {
            if(arr[i] > high) {
                high = arr[i];
            }
        }

        return high;
    }

    public static boolean small(int[] arr , int mid , int k) {

        long ans = 0;

        for(int i = 0 ; i < arr.length ; i ++) {
            ans = ans + (arr[i] + mid - 1) / mid; 
            
            if (ans > k) {
                return false;
            }
        }
        
        return ans <= k;
    }

    public static int smallest_div(int[] arr , int n , int k) {

        int low = 1;
        int high = high(arr);

        int ans = high;

        while (low <= high) {
            
            int mid = low + (high - low) / 2;

            if (small(arr, mid, k)) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return ans;
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

        System.out.println("Enter limit : ");
        int k = sc.nextInt();

        int result = smallest_div(arr, n, k);

        System.out.println("Smallest divisor : " +result);

        sc.close();
    }
}

// output 
// Enter size of array : 
// 4
// Enter elements of array : 
// 8
// 4
// 2
// 3
// Enter limit : 
// 10
// Smallest divisor : 2

// Enter size of array : 
// 5
// Enter elements of array : 
// 1
// 2
// 3
// 4
// 5
// Enter limit : 
// 8
// Smallest divisor : 3