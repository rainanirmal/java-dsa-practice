// Given an integer array nums of size n, return the majority element of the array.
// The majority element of an array is an element that appears more than n/2 times in the array. The array is guaranteed to have a majority element.

package Array_medium;

import java.util.*;

class majority_element {

    public static void majority(int[] arr , int n) {

        int count = 0;
        int[] temp = new int[n];
        int z = 0;

        for(int i = 0 ; i < n ; i ++) {
            count = 0;
            for(int j = 0 ; j < n ; j ++) {
                if(arr[j] == arr[i]) {
                    count++;
                }
            }
            temp[z++] = count;
        }

        for(int i = 0 ; i < z ; i ++) {
            if(temp[i] > n / 2) {
                System.out.println("The number "+arr[i]+ " appears " +temp[i]+ " times in " +n+ " sized array");
                return;
            }
        }

        System.out.println("No majority elements found");
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

        majority(arr, n);

        sc.close();
    }

}

// output
// Enter size of array : 
// 9
// Enter elements of array : 
// 7
// 0
// 0
// 1
// 7
// 7
// 2
// 7
// 7
// The number 7 appears 5 times in 9 sized array