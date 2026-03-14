// You are given A painters and an array C of N integers where C[i] denotes the length of the ith board. Each painter takes B units of time to paint 1 unit of board. You must assign boards to painters such that:

// Each painter paints only contiguous segments of boards.
// No board can be split between painters.
// The goal is to minimize the time to paint all boards

package Binary_search_on_answer;

import java.util.*;

public class painter_partition {

    public static int max(int[] arr) {

        int max = arr[0];

        for(int i = 0 ; i < arr.length ; i ++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int high(int[] arr , int b){

        int result = 0;

        for(int i = 0 ; i < arr.length ; i ++) {
            result = result + (arr[i] * b);
        }

        return result;
    }

    public static int time_to_paint(int[] arr , int mid , int b) {

        int count = 1;
        int length = 0;

        for(int i = 0 ; i < arr.length ; i ++) {
            if (length + arr[i] > mid) {
                count ++;
                length = arr[i];
            }
            else {
                length = length + arr[i];
            }
        }

        return count;
    }

    public static int time_to_paint_all_boards(int[] arr , int n , int a , int b) {

        int low = max(arr) * b;
        int high = high(arr, b);

        int result = high;

        while (low <= high) {
            
            int mid = low + (high - low) / 2;

            int ans = time_to_paint(arr, mid, b);

            if(ans <= a) {
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

        System.out.println("Enter number of painters : ");
        int a = sc.nextInt();

        System.out.println("Enter number of boards : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter length of each board : ");
        for(int i = 0 ; i < n ; i ++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter time of painter take to paint 1 unit of board : ");
        int b = sc.nextInt();

        int result = time_to_paint_all_boards(arr, n, a, b);

        System.out.println("Minimum time to build boards : " + result);

        sc.close();
    }
}

// output 
// Enter number of painters : 
// 2
// Enter number of boards : 
// 2
// Enter length of each board : 
// 1
// 10
// Enter time of painter take to paint 1 unit of board : 
// 5
// Minimum time to build boards : 50

// Enter number of painters : 
// 10
// Enter number of boards : 
// 4
// Enter length of each board : 
// 1
// 8
// 11
// 3
// Enter time of painter take to paint 1 unit of board : 
// 1
// Minimum time to build boards : 11