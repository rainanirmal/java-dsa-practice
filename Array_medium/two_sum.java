// Given an array of integers nums and an integer target. Return the indices(0 - indexed) of two elements in nums such that they add up to target.
// Each input will have exactly one solution, and the same element cannot be used twice.
package Array_medium;

import java.util.*;

public class two_sum {

    public static void sum(int[] arr , int n , int k) {
        
        int count = 0;
        int sum = 0;

        int z = 0;
        int[] temp = new int[n];

        int start = 0;
        int end = 0;

        for(int i = 0 ; i < n ; i ++) {
            count = 0;
            sum = 0;
            for(int j = i ; j < n ; j ++) {
                sum = sum + arr[j];
                count++;

                if(sum == k) {
                    temp[z++] = count;
                    start = i;
                    end = j;
                }
            }
        }

        for(int i = 0 ; i < z ; i ++) {
            if(temp[i] == 2) {
                System.out.println("Target indices : " +start+ " , " +end);
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

        System.out.println("Enter sum target : ");
        int k = sc.nextInt();

        sum(arr, n, k);

        sc.close();
    }
}

// output
// Enter size of array : 
// 5
// Enter elements of array : 
// 1
// 6
// 2
// 10
// 3
// Enter sum target : 
// 7
// Target indices : 0 , 1

// Enter size of array : 
// 5
// Enter elements of array : 
// 1
// 6
// 2
// 10
// 3
// Enter sum target : 
// 13
// Target indices : 3 , 4