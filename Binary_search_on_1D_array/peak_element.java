// Given an array arr of integers. A peak element is defined as an element greater than both of its neighbors.Formally, if arr[i] is the peak element, arr[i - 1] < arr[i] and arr[i + 1] < arr[i].

package Binary_search_on_1D_array;

import java.util.*;

public class peak_element {

    public static int peak (int[] arr , int n) {

        int low = 0;
        int high = n - 1;

        while (low < high) {
            
            int mid = low + (high - low) / 2;

            if(arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
        return arr[low];
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

        int result = peak(arr, n);

        System.out.println("Peak element : " +result);

        sc.close();
    }
    
}
// output
// Enter size of array : 
// 10
// Enter elements of array : 
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 5
// 1
// Peak element : 8

// Enter size of array : 
// 5
// Enter elements of array : 
// -2
// -1
// 3
// 4
// 5
// Peak element : 5