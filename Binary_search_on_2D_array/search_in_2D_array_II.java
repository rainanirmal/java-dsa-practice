// Given a 2D array matrix where each row is sorted in ascending order from left to right and each column is sorted in ascending order from top to bottom, write an efficient algorithm to search for a specific integer target in the matrix.

package Binary_search_on_2D_array;

import java.util.Scanner;

public class search_in_2D_array_II {

    public static boolean target_2D(int[] r , int target) {

        return false;

    }

    public static boolean search_in_2D(int[][] arr , int r , int c , int target) {

        for(int i = 0 ; i < r ; i ++) {
            if (target >= arr[i][0] && target <= arr[i][c]) {
                return target_2D(arr[r], target);
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

        sc.close();
    }
}
