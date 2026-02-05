package Array_hard;

import java.util.*;

public class count_subarray_with_given_xor_k {

    public static void subarray_with_xor(int[] arr, int n, int k) {

        int count = 0;
        int xor = 0;

        System.out.println("The subarrays having XOR of their elements as " + k + " : ");
        for(int i = 0 ; i < n ; i++) {
            xor = 0;
            for (int j = i ; j < n ; j++) {
                xor = xor ^ arr[j];

                if (xor == k) {
                    count++;
                    System.out.print("[ ");
                    for(int x = i ; x <= j ; x++) {
                        System.out.print(arr[x] + " ");
                    }
                    System.out.print("]");
                    System.out.println();
                }
            }
        }
        System.out.println("Total : " + count);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter xor target : ");
        int k = sc.nextInt();

        subarray_with_xor(arr, n, k);

        sc.close();
    }
}

// output
// Enter size of array : 
// 5
// Enter elements of array : 
// 4
// 2
// 2
// 6
// 4
// Enter xor target : 
// 6
// The subarrays having XOR of their elements as 6 : 
// [ 4 2 ]
// [ 4 2 2 6 4 ]
// [ 2 2 6 ]
// [ 6 ]
// Total : 4

// Enter size of array : 
// 5
// Enter elements of array : 
// 5
// 6
// 7
// 8
// 9
// Enter xor target : 
// 5
// The subarrays having XOR of their elements as 5 : 
// [ 5 ]
// [ 5 6 7 8 9 ]
// Total : 2