// Given an integer array nums. Return all triplets such that:
// i != j, i != k, and j != k
// nums[i] + nums[j] + nums[k] == 0.

package Array_hard;

import java.util.*; 

public class three_sum {

    public static void sum_3 (int[] arr , int n){

        for(int i = n - 1 ; i >= 0 ; i --) {
            for(int j = 0 ; j < i ; j ++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int sum = 0;

        System.out.println("Triplet subarray : ");
        for(int i = 0 ; i < n - 2 ; i ++) {
            sum = 0;
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            for(int j = i + 1 ; j < n - 1 ; j ++) {
                if (j > 1 && arr[j] == arr[j - 1]) {
                    continue;
                }
                for(int z = j + 1 ; z < n ; z ++) {
                    if (z > 2 && arr[z] == arr[z - 1]) {
                        continue;
                    }
                    sum = arr[i] + arr[j] + arr[z];
                    if(sum == 0) {
                        System.out.println("[ " + arr[i] + " , " + arr[j] + " , " + arr[z] + " ]");
                    }
                }
            }
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

        sum_3(arr, n);

        sc.close();
    }
}

// output
// Enter size of array : 
// 6
// Enter elements of array : 
// 2
// -2
// 0
// 3
// -3
// 5
// Triplet subarray : 
// [ -3 , -2 , 5 ]
// [ -3 , 0 , 3 ]
// [ -2 , 0 , 2 ]

// Enter size of array : 
// 5
// Enter elements of array : 
// -1
// 2
// -1 
// -1
// 3
// Triplet subarray : 
// [ -1 , -1 , 2 ]