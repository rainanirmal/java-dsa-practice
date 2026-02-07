// Given a sorted array of nums and an integer x, write a program to find the lower bound of x.
// The lower bound algorithm finds the first and smallest index in a sorted array where the value at that index is greater than or equal to a given key i.e. x.If no such index is found, return the size of the array.

package Binary_search_on_1D_array;

import java.util.*;

public class lower_bound {
    
    public static int lower(int[] arr , int n , int k) {

        for(int i = 0 ; i < n ; i ++) {
            if(arr[i] >= k) {
                return i;
            }
        }

        return n;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of array : ");
        for (int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target : ");
        int k = sc.nextInt();

        int lower = lower(arr, n, k);
        System.out.println("Index " + lower + " is the smallest index such that arr[" + lower + "] >= " + k);

        sc.close();
    }
}

// output
// Enter size of array : 
// 5
// Enter elements of array : 
// 3
// 5
// 8
// 15
// 19
// Enter target : 
// 9
// Index 3 is the smallest index such that arr[3] >= 9

// Enter size of array : 
// 4
// Enter elements of array : 
// 1
// 2
// 2
// 3
// Enter target : 
// 2
// Index 1 is the smallest index such that arr[1] >= 2