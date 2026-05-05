package Sorting;

import java.util.*;

public class quick_sort {

    public static void quick(int[] arr , int low , int high) {

        if (low < high) {
            
            int partitionIndex = quick_partititon(arr, low, high);

            quick(arr, low , partitionIndex - 1);
            quick(arr, partitionIndex + 1, high);
        }
    }

    public static int quick_partititon(int[] arr , int low , int high) {

        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (i <= high && arr[i] <= pivot) {
                i++;
            }

            while (j >= low && arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                quick_swap(arr, i, j);
            }
        }

        quick_swap(arr, low , j);

        return j;
    }

    public static void quick_swap(int[] arr , int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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

        quick(arr, 0, n - 1);

        System.out.println("Sorted array : ");
        for(int i = 0 ; i < n ; i ++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
    
}
         
// output
// Enter size of array : 
// 8
// Enter elements of array : 
// 4
// 6
// 2
// 5
// 7
// 9
// 1
// 3
// Sorted array : 
// 1 2 3 4 5 6 7 9 