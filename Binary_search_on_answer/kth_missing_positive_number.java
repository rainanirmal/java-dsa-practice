package Binary_search_on_answer;

import java.util.*;

public class kth_missing_positive_number {

    public static int missing(int[] arr , int n , int k) {

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            
            int mid = low + (high - low) / 2;

            int missing = arr[mid] - (mid + 1);

            if(missing < k ) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return low + k;
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

        System.out.println("Enter missing number kth position : ");
        int k = sc.nextInt();

        int result = missing(arr, n, k);

        System.out.println("Missing kth index number : " + result);


        sc.close();
    }    
}

// output
// Enter size of array : 
// 4
// Enter elements of array : 
// 3
// 5
// 7
// 10
// Enter missing number kth position : 
// 6
// Missing kth index number : 9

// Enter size of array : 
// 5
// Enter elements of array : 
// 1
// 4
// 6
// 8
// 99
// Enter missing number kth position : 
// 3
// Missing kth index number : 5