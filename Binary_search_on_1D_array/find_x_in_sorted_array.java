// Given a sorted array of integers nums with 0-based indexing, find the index of a specified target integer. If the target is found in the array, return its index. If the target is not found, return -1

package Binary_search_on_1D_array;

import java.util.*;

class find_x_in_sorted_array {

    public static int find_x(int[] arr , int n , int k) {

        int left = 0;
        int right = n - 1;

        while (left <= right) {
            
            int mid = (left + (right - left) / 2);

            if(k == arr[mid]) {
                return mid;
            }
            else if (k > arr[mid]) {
                left = mid + 1;                
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
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

        int index = find_x(arr, n, k);

        if (index > 0) {
            System.out.println("The target integer " + k + " exists in array and its index is " +index);
        }
        else {
            System.out.println("The target integer " + k + " does not exists in array");   
        }
        sc.close();
    }
}

// output

// Enter size of array : 
// 6
// Enter elements of array : 
// -1
// 0
// 3
// 5
// 9  
// 12
// Enter target : 
// 9       
// The target integer 9 exists in array and its index is 4

// Enter size of array : 
// 4
// Enter elements of array : 
// 1
// 2
// 3
// 4
// Enter target : 
// 8
// The target integer 8 does not exists in array