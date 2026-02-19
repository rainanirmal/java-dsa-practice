// A monkey is given n piles of bananas, where the 'ith' pile has nums[i] bananas. An integer h represents the total time in hours to eat all the bananas.
// Each hour, the monkey chooses a non-empty pile of bananas and eats k bananas. If the pile contains fewer than k bananas, the monkey eats all the bananas in that pile and does not consume any more bananas in that hour.
// Determine the minimum number of bananas the monkey must eat per hour to finish all the bananas within h hours.

package Binary_search_on_answer;

import java.util.*;

public class koko_eating_bananas {

    public static int max(int[] arr) {

        int max = arr[0];
        for(int i = 1 ; i < arr.length ; i ++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
    
    public static int hour(int[] arr , int mid) {

        int totalhour = 0;
        for(int i = 0 ; i < arr.length ; i ++) {
            totalhour = totalhour + (arr[i] + mid - 1 / mid);
        }

        return totalhour;
    }

    public static int koko(int[] arr,int h) {

        int low = 1;
        int high = max(arr);

        int ans = high;

        while (low <= high) {
            
            int mid = low + (high - low) / 2;

            int hour = hour(arr, mid);

            if (hour <= h) {
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

        System.out.println("Enter total number of piles : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter number of bananas of each piles : ");
        for(int i = 0 ; i < n ; i ++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter total time in hour : ");
        int h = sc.nextInt();

        int result = koko(arr, h);

        System.out.println("Minimum speed of eating banana per hour is : " +result);

        sc.close();
    }
}

// output 
// Enter total number of piles : 
// 4
// Enter number of bananas of each piles :
// 7
// 15
// 6
// 3
// Enter total time in hour :
// 8
// Minimum speed of eating banana per hour is : 5

// Enter total number of piles : 
// 5
// Enter number of bananas of each piles : 
// 25
// 12
// 8
// 14
// 19
// Enter total time in hour : 
// 5
// Minimum speed of eating banana per hour is : 25