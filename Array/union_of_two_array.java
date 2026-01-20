// Given two sorted arrays nums1 and nums2, return an array that contains the union of these two arrays. 
// The elements in the union must be in ascending order.
// The union of two arrays is an array where all values are distinct and are present in either the first array,
//  the second array, or both.

package Array;

import java.util.*;

public class union_of_two_array {

    public static void union(int arr1[] , int n1 , int arr2[] , int n2) {

        int i = 0;
        int j = 0;
        int k = 0;
        int[] temp = new int[n1 + n2];

        while(i < n1 && j < n2) {

            if(arr1[i] < arr2[j]) {
                if(k == 0 || temp[k - 1] != arr1[i]) {
                    temp[k++] = arr1[i];
                }
                i++;
            }
            else if(arr1[i] > arr2[j]) {
                if(k == 0 || temp[k - 1] != arr2[j]) {
                    temp[k++] = arr2[j];
                }
                j++;
            }
            else { // when both have same element
                if(k == 0 || temp[k - 1] != arr1[i]) {
                    temp[k++] = arr1[i];
                }
                i++;
                j++;
            }
        }

        while(i < n1) {
            if(k == 0 || temp[k - 1] != arr1[i]) {
                temp[k++] = arr1[i];
            }
            i++;
        }

        while(j < n2) {
            if(k == 0 || temp[k - 1] != arr2[j]) {
                temp[k++] = arr2[j];
            }
            j++;
        }

        System.out.println("Union of the sorted array : ");
        for(int r = 0 ; r < k ; r ++) {
            System.out.print(temp[r] + " ");
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

        System.out.println();

        System.out.println("Enter size of second array : ");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("Enter elements of second array : ");
        for(int i = 0 ; i < n2 ; i ++) {
            arr2[i] = sc.nextInt();
        }

        union(arr1, n1, arr2, n2);

        sc.close();
    }
}

//output
// Enter size of first array : 
// 6
// Enter elements of first array : 
// 3
// 4
// 6
// 7
// 9
// 9

// Enter size of second array :
// 5
// Enter elements of second array :
// 1
// 5
// 7
// 8
// 8
// Union of the sorted array :
// 1 3 4 5 6 7 8 9