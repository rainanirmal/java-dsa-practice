//Given a binary array nums, return the maximum number of consecutive 1s in the array.
// A binary array is an array that contains only 0s and 1s.

package Array;

import java.util.*;

public class max_consecutive_one {
    
    public static void consecutive_count(int[] arr , int n) {

        int count = 0;
        int[] temp = new int[n];
        int j = 0;

        for(int i = 0 ; i < n ; i ++) {
            if(arr[i] == 1) {
                count++;
            }
            if(arr[i] == 0) {
                temp[j++] = count;
                count = 0;
            }
        }

        int max_count = temp[0];
        for(int i = 0 ; i < j ; i ++) {
            if(temp[i] > max_count) {
                max_count = temp[i];
            }
        }

        System.out.println("Maximum number of consecutive 1s in the array is : " +max_count);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter binary elements : ");
        for(int i = 0 ; i < n ; i ++) {
            arr[i] = sc.nextInt();
        }

        consecutive_count(arr, n);
        
        sc.close();
    }
}

//output
// Enter size of array :
// 8
// Enter binary elements :
// 1
// 1
// 0
// 0
// 1
// 1
// 1
// 0
// Maximum number of consecutive 1s in the array is : 3