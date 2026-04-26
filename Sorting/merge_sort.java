package Sorting;

import java.util.*;

public class merge_sort {

    public static void merge_divide(int[] arr , int low , int high) {
        if (low == high) {
            return;
        }

        int mid = (low + high) / 2;

        merge_divide(arr, low, mid);
        merge_divide(arr, mid + 1, high);
        merge(arr, low, mid, high);
       
    }

    public static void merge(int[] arr , int low , int mid , int high) {

        int temp[] = new int[high - low + 1];
        int t = 0;
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                temp[t] = arr[left];
                left++;
                t++;
            }
            else {
                temp[t] = arr[right];
                right++;
                t++;
            }
        }

        while (left <= mid) {
            temp[t] = arr[left];
            left++;
            t++;
        }

        while (right <= high) {
            temp[t] = arr[right];
            right++;
            t++;
        }

        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i]; //copying back to original array
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

        merge_divide(arr, 0, n - 1);

        System.out.println("Sorted array : ");
        for(int i = 0 ; i < n ; i ++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

// output
// Enter size of array : 
// 9
// Enter elements of array : 
// 3
// 1
// 2
// 4
// 1
// 5
// 2
// 6
// 4
// Sorted array : 
// 1 1 2 2 3 4 4 5 6 