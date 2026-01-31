// Given an integer array nums of size n. Return all elements which appear more than n/3 times in the array. The output can be returned in any order.

package Array_hard;

import java.util.*;

public class majority_element_II {

    public static void majority_II (int[] arr , int n) {

        int count = 0;
        int z = 0;
        int[] temp = new int[n];
        Set<Integer> set = new HashSet<>(); 
    
        for(int i = 0 ; i < n ; i ++) {
            count = 0;
            for(int j = 0 ; j < n ; j ++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            temp[z++] = count;
        }

        for(int i = 0 ; i < z ; i ++) {
            if (temp[i] > n / 3) {
                set.add(arr[i]);               
            }
        }

        System.out.println("Majority elements that appeared more than " +n+ " / 3 : " + set);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements f array : ");
        for (int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        majority_II(arr, n);

        sc.close();
    }
}

// output
// Enter size of array : 
// 7
// Enter elements f array : 
// 1
// 2
// 1
// 1
// 3
// 2
// 2
// Majority elements that appeared more than 7 / 3 : [1, 2]