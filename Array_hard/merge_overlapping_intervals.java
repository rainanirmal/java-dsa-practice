// Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals and return an array of the non-overlapping intervals that cover all the intervals in the input.You can return the intervals in any order.

package Array_hard;

import java.util.*;

public class merge_overlapping_intervals {

    public static void merge_overlapping(int[][] arr , int n) {

        for(int i = 1 ; i < n ; i ++) {
            for(int j = 0 ; j <= 0 ; j ++) {
                if(arr[i][j] < arr[i - 1][j]) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[i - 1][j];
                    arr[i - 1][j] = temp;

                    int temp1 = arr[i][j + 1];
                    arr[i][j + 1] = arr[i - 1][j + 1];
                    arr[i - 1][j + 1] = temp1;
                }
            }
        }

        System.out.println("Sorted intervals : ");
        for(int i = 0 ; i < n ; i ++) {
            System.out.println("[ " + arr[i][0] + " , " + arr[i][1] + " ]");
        }

        System.out.println("Merged overlapping subintervals : ");
        for(int i = 0 ; i < n - 1; i ++) {
            for(int j = 0 ; j <= 0 ; j ++) {
                if(arr[i][j + 1] > arr[i + 1][j]) {
                    arr[i + 1][j] = arr[i][j];
                }
                else {
                    System.out.println("[ " + arr[i][j] + " , " + arr[i][j + 1] + " ]");
                }
            }
        }
        System.out.println("[ " + arr[n - 1][0] + " , " + arr[n - 1][1] + " ]");
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of intervals : ");
        int n = sc.nextInt();

        int arr[][] = new int[n][2];

        System.out.println("Enter elements of intervals (start , end) : ");
        for(int i = 0 ; i < n ; i ++) {
            System.out.println("Enter for " +(i + 1)+ " interval : ");
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        System.out.println("Entered intervals : ");
        for(int i = 0 ; i < n ; i ++) {
            System.out.println("[ " + arr[i][0] + " , " + arr[i][1] + " ]");
        }

        merge_overlapping(arr, n);

        sc.close();
    }
}

// output
// Enter number of intervals : 
// 4
// Enter elements of intervals (start , end) : 
// Enter for 1 interval : 
// 1
// 5
// Enter for 2 interval : 
// 3
// 6
// Enter for 3 interval :
// 8
// 10
// Enter for 4 interval :
// 15
// 18
// Entered intervals :
// [ 1 , 5 ]
// [ 3 , 6 ]
// [ 8 , 10 ]
// [ 15 , 18 ]
// Sorted intervals :
// [ 1 , 5 ]
// [ 3 , 6 ]
// [ 8 , 10 ]
// [ 15 , 18 ]
// Merged overlapping subintervals :
// [ 1 , 6 ]
// [ 8 , 10 ]
// [ 15 , 18 ]

// Enter number of intervals : 
// 4
// Enter elements of intervals (start , end) : 
// Enter for 1 interval : 
// 5
// 7
// Enter for 2 interval : 
// 1
// 3
// Enter for 3 interval : 
// 4
// 6
// Enter for 4 interval : 
// 8
// 10
// Entered intervals : 
// [ 5 , 7 ]
// [ 1 , 3 ]
// [ 4 , 6 ]
// [ 8 , 10 ]
// Sorted intervals :
// [ 1 , 3 ]
// [ 4 , 6 ]
// [ 5 , 7 ]
// [ 8 , 10 ]
// Merged overlapping subintervals :
// [ 1 , 3 ]
// [ 4 , 7 ]
// [ 8 , 10 ]