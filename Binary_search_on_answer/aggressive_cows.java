// Given an array nums of size n, which denotes the positions of stalls, and an integer k, which denotes the number of aggressive cows, assign stalls to k cows such that the minimum distance between any two cows is the maximum possible. Find the maximum possible minimum distance.

package Binary_search_on_answer;

import java.util.*;

public class aggressive_cows {

    public static void sort(int[] arr , int n) {

        for(int i = 0 ; i <= n - 2 ; i ++) {
            int min = i;
            for(int j = i ; j <= n - 1; j ++) {
                if(arr[j] < arr[min]) { 
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static int stall(int[] arr , int mid , int k) {

        int count = 1;
        int last = arr[0];

        for(int i = 1 ; i < arr.length ; i ++) {

            if(arr[i] - last >= mid) {
                count ++;
                last = arr[i];
            }
        }

        return count;
    }

    public static int cow_position(int[] arr , int n , int k) {

        sort(arr, n);

        int low = 1;
        int high = arr[n - 1];

        int result = high;

        while (low <= high) {
            
            int mid = low + (high - low) / 2;

            int ans = stall(arr, mid, k);

            if(ans >= k) {
                result = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter position of stalls : ");
        for(int i = 0 ; i < n ; i ++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number of aggressive cows : ");
        int k = sc.nextInt();

        int ans = cow_position(arr, n, k);

        System.out.println("Maximum space between 2 cows : " + ans);

        sc.close();
    }
    
}

// output 

// Enter size of array : 
// 6
// Enter position of stalls : 
// 0
// 3
// 4
// 7
// 10
// 9
// Enter number of aggressive cows : 
// 4
// Maximum space between 2 cows : 3

// Enter size of array : 
// 5
// Enter position of stalls : 
// 4
// 2
// 1
// 3
// 6
// Enter number of aggressive cows : 
// 2
// Maximum space between 2 cows : 5