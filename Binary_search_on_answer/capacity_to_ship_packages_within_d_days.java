package Binary_search_on_answer;

import java.util.*;

public class capacity_to_ship_packages_within_d_days {

    public static int high(int[] arr) {

        int sum = 0;
        for(int i = 0 ; i < arr.length ; i ++) {
            sum = sum + arr[i];
        }

        return sum;
    }

    public static int capacity(int[] arr , int mid) {

        int day = 1;
        int sum = 0;

        for(int i = 0 ; i < arr.length ; i ++) {

            if(sum + arr[i] > mid) {
                day++;
                sum = arr[i];
            }
            else {
                sum = sum + arr[i];
            }
        }

        return day;
    }

    public static int d_days(int[] arr , int days) {

        int low = 1;
        int high = high(arr);

        int cap = high;

        while (low <= high) {
            
            int mid = low + (high - low) / 2;

            int ans = capacity(arr, mid);

            if (ans <= days) {
                cap = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return cap;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        System.out.println("Enter weight of ith package : ");
        for(int i = 0 ; i < n ; i ++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter days : ");
        int days = sc.nextInt();

        int result = d_days(arr, days);

        System.out.println("Minimum ship capacity : " +result);

        sc.close();
    }    
}

// output
// Enter size of array : 
// 6
// Enter weight of ith package : 
// 3
// 2
// 2
// 4
// 1
// 4
// Enter days : 
// 3
// Minimum ship capacity : 6

// Enter size of array : 
// 10
// Enter weight of ith package : 
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9   
// 10
// Enter days : 
// 5
// Minimum ship capacity : 15