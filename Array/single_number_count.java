// Given an array of nums of n integers. Every integer in the array appears twice except one integer. Find the number that appeared once in the array.

package Array;

import java.util.*;

public class single_number_count {

    public static void number_count(int[] arr , int n ) {
         
        for(int i = 0 ; i < n ; i ++) {
            int count = 0;
            for(int j = 0 ; j < n ; j ++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }

            if(count == 1) {
                System.out.println(arr[i] + " appeared only once");
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

        number_count(arr, n);

        sc.close();
    }
}

// output
// Enter size of array :
// 7
// Enter elements of array :
// 1
// 2
// 2
// 4
// 3
// 1
// 4
// 3 appeared only once