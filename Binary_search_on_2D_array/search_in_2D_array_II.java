// Given a 2D array matrix where each row is sorted in ascending order from left to right and each column is sorted in ascending order from top to bottom, write an efficient algorithm to search for a specific integer target in the matrix.

package Binary_search_on_2D_array;

import java.util.Scanner;

public class search_in_2D_array_II {

    public static boolean target_2D(int[] row , int target) {

        int low = 0;
        int high = row.length - 1;

        while (low <= high) {
            
            int mid = low + (high - low) / 2;

            if (row[mid] == target) {
                return true;
            }
            else if (row[mid] > target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return false;
    }

    public static boolean search_in_2D(int[][] arr , int target) {

        int row = arr.length;
        int col = arr[0].length;

        for(int i = 0 ; i < row ; i ++) {
            if (target >= arr[i][0] && target <= arr[i][col - 1]) {
                if (target_2D(arr[i] , target)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int row = sc.nextInt();

        System.out.println("Enter number of columns : ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        System.out.println("Enter elements of matrix : ");
        for(int i = 0 ; i < row ; i ++) {
            for(int j = 0 ; j < col ; j ++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter target : ");
        int target = sc.nextInt();

        if (search_in_2D(matrix , target)) {
            System.out.println(target + " exists in matrix");
        }
        else {
            System.out.println(target + " does not exists in matrix");
        }

        sc.close();
    }
}

// output 
// Enter number of rows : 
// 2
// Enter number of columns : 
// 2
// Enter elements of matrix : 
// 14
// 18
// 15
// 20
// Enter target : 
// 18
// 18 exists in matrix

// Enter number of rows : 
// 5
// Enter number of columns : 
// 5
// Enter elements of matrix : 
// 1
// 4
// 7
// 11
// 15
// 2
// 5
// 8
// 12
// 19
// 3
// 6
// 9 
// 16
// 22
// 10
// 13
// 14
// 17
// 24
// 18
// 21
// 23
// 26
// 30
// Enter target : 
// 5
// 5 exists in matrix