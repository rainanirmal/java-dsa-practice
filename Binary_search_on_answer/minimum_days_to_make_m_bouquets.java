// Given n roses and an array nums where nums[i] denotes that the 'ith' rose will bloom on the nums[i]th day, only adjacent bloomed roses can be picked to make a bouquet. Exactly k adjacent bloomed roses are required to make a single bouquet. Find the minimum number of days required to make at least m bouquets, each containing k roses. Return -1 if it is not possible.

package Binary_search_on_answer;

import java.util.*;

public class minimum_days_to_make_m_bouquets {

    public static int low(int[] arr) {
        int low = arr[0];

        for(int i = 0 ; i < arr.length ; i ++) {
            if (arr[i] < low) {
                low = arr[i];
            }
        }

        return low;
    }

    public static int high(int[] arr) {

        int high = arr[0];
        for(int i = 1 ; i < arr.length ; i ++) {
            if(arr[i] > high) {
                high = arr[i];
            }
        }

        return high;
    }

    public static boolean days(int[] arr , int mid , int m , int k) {

        int flower = 0;
        int bouquets = 0;

        for(int i = 0 ; i < arr.length ; i ++) {

            if (arr[i] <= mid) {
                flower++;

                if (flower == k) {
                    bouquets++;
                    flower = 0;
                }
            }
            else {
                flower = 0;
            }
        }

        if (bouquets >= m) {
            return true;
        }
        else {
            return false;
        }
    }

    public static int min_days(int[] arr , int n , int m , int k) {

        int low = low(arr);
        int high = high(arr);

        int ans = -1;

        while (low <= high) {
            
            int mid = low + (high - low) / 2;

            if (days(arr, mid, m, k)) {
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

        System.out.println("Enter number of roses : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter days of bloom : ");
        for(int i = 0 ; i < n ; i ++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number of required bloomed roses : ");
        int k = sc.nextInt();

        System.out.println("Enter number of bouquets : ");
        int m = sc.nextInt();

        int result = min_days(arr, n, m, k);

        System.out.println("Minimum days to make " + m + " bouquets : " + result);

        sc.close();
    }    
}

// output
// Enter number of roses : 
// 8
// Enter days of bloom : 
// 7
// 7
// 7
// 7
// 13
// 11
// 12
// 7
// Enter number of required bloomed roses :
// 3
// Enter number of bouquets :
// 2
// Minimum days to make 2 bouquets : 12

// Enter number of roses : 
// 5
// Enter days of bloom : 
// 1
// 10
// 3
// 10
// 2
// Enter number of required bloomed roses : 
// 2
// Enter number of bouquets : 
// 3
// Minimum days to make 3 bouquets : -1