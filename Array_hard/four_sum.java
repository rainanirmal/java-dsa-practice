// Given an integer array nums and an integer target. Return all quadruplets [nums[a], nums[b], nums[c], nums[d]] such that: a, b, c, d are all distinct valid indices of nums

package Array_hard;

import java.util.*;

public class four_sum {

    public static void sum_4(int[] arr , int n , int k) {

        for(int i = n - 1 ; i >= 0 ; i--) {
            for(int j = 0 ; j < i ; j ++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int sum = 0;
        boolean found = false;

        System.out.println("Quadruplets subarray with target " + k + " is : ");
        for(int i = 0 ; i < n - 3 ; i ++) {
            sum = 0;
            if(arr[i] > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            for(int j = i + 1 ; j < n - 2 ; j ++) {
                if(arr[j] > 1 && arr[j] == arr[j - 1]) {
                continue;
                }
                for(int z = j + 1 ; z < n - 1 ; z ++) {
                    if(arr[z] > 2 && arr[z] == arr[z - 1]) {
                    continue;
                    }
                    for(int t = z + 1 ; t < n ; t ++) {
                        if(arr[t] > 3 && arr[t] == arr[t - 1]) {
                        continue;
                        }
                        sum = arr[i] + arr[j] + arr[z] + arr[t];
                        if(sum == k) {
                            System.out.println("[ " + arr[i] + " , " + arr[j] + " , " + arr[z] + " , "+ arr[t] +" ]");
                            found = true;
                        }
                    }
                }
            }
        }
        if(!found) {
            System.out.println("[]");
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

        sum_4(arr, n, k);
        
        sc.close();
    }
}

// output
// Enter size of array : 
// 5
// Enter elements of array : 
// -1
// -1
// 2
// 3
// 1
// Enter target : 
// 15
// Quadruplets subarray with target 15 is : 
// []

// Enter size of array : 
// 6
// Enter elements of array : 
// 1
// -2
// 3
// 5
// 7
// 9
// Enter target : 
// 7
// Quadruplets subarray with target 7 is : 
// [ -2 , 1 , 3 , 5 ]