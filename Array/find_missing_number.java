// Given an integer array of size n containing distinct values in the range from 0 to n (inclusive), return the only number missing from the array within this range.

package Array;

import java.util.*;

public class find_missing_number {

    public static void mssing(int[] arr , int n) {

        int expected_sum = n * (n + 1) / 2;
        int sum = 0;
        
        for(int i = 0 ; i < n ; i ++) {
            sum = sum + arr[i];
        }

        int result = expected_sum - sum;

        System.out.println("Missing number in the range from 0 to " +n+ " is : " +result);
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

        mssing(arr, n);
        
        sc.close();

    }
}
