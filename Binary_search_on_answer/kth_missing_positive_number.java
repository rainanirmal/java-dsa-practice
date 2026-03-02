package Binary_search_on_answer;

import java.util.*;

public class kth_missing_positive_number {

    public static int missing_num(int[] arr , int mid , int k) {

        int count = 0;

        for(int i = 0 ; i < arr.length ; i ++) {
            if (arr[i] == mid) {
                break;
            }

            if(arr[i] > (i + 1)) {
                count = arr[i] - (i + 1);

                if(count == k) {
                    break;
                }
            }
        }

        return count;
    }

    public static int missing(int[] arr , int n , int k) {

        int low = 1;
        int high = arr.length + k;

        int missing = high;

        while (low <= high) {
            
            int mid = low + (high - low) / 2;

            int ans = missing_num(arr, mid, k);

            if(ans <= k) {
                missing = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return missing;
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
