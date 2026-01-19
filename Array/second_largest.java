// Given an array of integers nums, return the second-largest element in the array. If the second-largest 
// element does not exist, return -1.

package Array;

import java.util.*;

public class second_largest {

    public static int second(int[] arr , int n) {

        int max = arr[0];

        for(int i = 0 ; i < n ; i ++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        int max2 = arr[0];

        for(int i = 0 ; i < n ; i ++) {
            if(arr[i] == max) {
                continue;
            }

            if(arr[i] > max2) {
                max2 = arr[i];
            }   
        }

        if(max == max2) {
            return -1;
        }

        return max2;
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

        int result = second(arr, n);

        System.out.println("Second largest element : " + result);

        sc.close();
    }
}
