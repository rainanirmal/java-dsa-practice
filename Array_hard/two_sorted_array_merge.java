// Given two integer arrays nums1 and nums2. Both arrays are sorted in non-decreasing order.
// Merge both the arrays into a single array sorted in non-decreasing order.

package Array_hard;

import java.util.*;

public class two_sorted_array_merge {

    public static void merge(int n1 , int n2 , int[] arr1 , int[] arr2) {

        int size = n1 + n2;
        int[] temp = new int[size];
        int z = 0;

        for(int i = 0 ; i < n1 ; i ++) {
            temp[z++] = arr1[i];
        }

        for(int i = 0 ; i < n2 ; i ++) {
            temp[z++] = arr2[i];
        }

        for(int i = z - 1 ; i > 0 ; i --) {
            for(int j = 0 ; j < i ; j ++) {
                if(temp[j] > temp[j + 1]) {
                    int tem = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = tem;
                }
            }
        }

        System.out.println("Merged sorted array : ");
        for(int i = 0 ; i < size ; i ++) {
            System.out.print(temp[i] + " ");
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array : ");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Enter elements of first array : ");
        for(int i = 0 ; i < n1 ; i ++) {
            arr1[i] = sc.nextInt();
        }
        
        System.out.println("Enter size of second array : ");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("Enter elements of second array : ");
        for(int i = 0 ; i < n2 ; i ++) {
            arr2[i] = sc.nextInt();
        }

        merge(n1, n2, arr1, arr2);

        sc.close();
    }
}

// output
// Enter size of first array : 
// 4
// Enter elements of first array : 
// 1
// -4
// -2
// 5
// Enter size of second array : 
// 3
// Enter elements of second array : 
// -3
// 0
// 2
// Merged sorted array : 
// -4 -3 -2 0 1 2 5