package Binary_search_on_1D_array;

import java.util.*;

public class search_insert_position {
    
    public static void insert_position(int[] arr , int n , int k) {

        for(int i = 0 ; i < n ; i ++) {
            if(arr[i] == k) {
                System.out.println("The target value " + k +" is found at index " + i + " in the sorted array");
            }
            else if((arr[i] <  k) && (arr[i + 1] > k)) {
                System.out.println("The target value " + k + " is not found in the array. However, it should be inserted at index " + (i + 1) + " to maintain the sorted order of the array");
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

        System.out.println("Enter target : ");
        int k = sc.nextInt();

        insert_position(arr, n, k);
 
        sc.close();
    }
}

// output
// Enter size of array : 
// 4
// Enter elements of array : 
// 1
// 3
// 4
// 6
// Enter target : 
// 2
// The target value 2 is not found in the array. However, it should be inserted at index 1 to maintain the sorted order of the array

// Enter size of array : 
// 4
// Enter elements of array : 
// 2
// 5
// 7
// 9
// Enter target : 
// 9
// The target value 9 is found at index 3 in the sorted array