// Given a sorted array nums and an integer x. Find the floor and ceil of x in nums. The floor of x is the largest element in the array which is smaller than or equal to x. The ceiling of x is the smallest element in the array greater than or equal to x. If no floor or ceil exists, output -1.

package Binary_search_on_1D_array;

import java.util.*;

public class floor_and_ceil {

    public static void f_and_c (int[] arr , int n , int k) {

        int floor = -1;
        int ceil = -1;

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            
            int mid = low + (high - low) / 2;

            if(arr[mid] == k) {
                floor = arr[mid];
                ceil = arr[mid];
                break;
            } 

            if (arr[mid] > k) {
                ceil = arr[mid];
                high = mid - 1;                
            }
            else {
                floor = arr[mid];
                low = mid + 1;
            }
        }

        System.out.println("Floor : " +floor);
        System.out.println("Ceil : " +ceil);
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

        f_and_c(arr, n, k); 

        sc.close();
    }
}

// output

// Enter size of array :
// 6
// Enter elements of array :
// 3
// 4
// 4
// 7
// 8
// 10
// Enter target :
// 5
// Floor : 4
// Ceil : 7

// Enter size of array : 
// 7
// Enter elements of array : 
// 2
// 4
// 6
// 8
// 10
// 12
// 14
// Enter target : 
// 1
// Floor : -1
// Ceil : 2