// Given an integer array nums and a non-negative integer k, rotate the array to the left by k steps.

package Array;

import java.util.*;

public class left_rotate_by_k {

    public static void left_k(int[] arr , int n , int k) {

        for(int j = 1 ; j <= k ; j ++) {
            for(int i = 0 ; i < n - 2; i ++) {
                if(i == 0) {
                    int temp = arr[n - 1];
                    arr[n - 1] = arr[i];
                    arr[i] = temp;
                }

                int temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }

            System.out.print(j+ " step left rotate of array : ");
            for(int i = 0 ; i < n ; i ++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
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

        System.out.println("Enter number of times to rotate : ");
        int k = sc.nextInt();

        left_k(arr, n , k);

        sc.close();
    }
}

//output
// Enter size of array : 
// 6
// Enter elements of array :
// 1
// 2
// 3
// 4
// 5
// 6
// Enter number of times to rotate :
// 3
// 1 step left rotate of array : 2 3 4 5 6 1
// 2 step left rotate of array : 3 4 5 6 1 2
// 3 step left rotate of array : 4 5 6 1 2 3