// Given a sorted array arr of size n, containing integer positions of n gas stations on the X-axis, and an integer k, place k new gas stations on the X-axis.
// The new gas stations can be placed anywhere on the non-negative side of the X-axis, including non-integer positions.
// Let dist be the maximum distance between adjacent gas stations after adding the k new gas stations.
// Find the minimum value of dist.
// Your answer will be accepted if it is within 1e-6 of the true value.

package Binary_search_on_answer;

import java.util.*;

public class max_distance_to_gas_station {

    public static int high(int[] arr) {
        int max = 0;

        for(int i = 0 ; i < arr.length - 1 ; i ++) {
            if (arr[i + 1] - arr[i] > max) {
                max = arr[i + 1] - arr[i];
            }
        }

        return max;
    }

    public static int min_distance_between_gas_station(int[] arr , double mid) {

        int count = 0;

        for(int i = 0 ; i < arr.length - 1 ; i ++) {

            double gap = arr[i + 1] - arr[i];

            count = count + (int) (gap / mid);
        }

        return count;
    }

    public static double minimum_distance(int[] arr , int n , int k) {

        double low = 0;
        double high = high(arr);

        while (high - low > 1e-6) {
            
            double mid = (low + high) / 2.0;

            int result = min_distance_between_gas_station(arr, mid);

            if(result > k) {
                low = mid;
            }
            else {
                high = mid;
            }
        }

        return high;
        
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter position of gas station : ");
        for(int i = 0 ; i < n ; i ++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number of new gas station to be placed : ");
        int k = sc.nextInt();

        double result = minimum_distance(arr, n, k);

        System.out.print("Minimum distance : ");
        System.out.printf("%.1f", result);
        
        sc.close();
    }
}

// output 
// Enter size of array : 
// 10
// Enter position of gas station : 
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
// Enter number of new gas station to be placed :
// 10
// Minimum distance : 0.5

// Enter size of array : 
// 10
// Enter position of gas station : 
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
// Enter number of new gas station to be placed : 
// 1
// Minimum distance : 1.0