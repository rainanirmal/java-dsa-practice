// Given a 2D array matrix that is row-wise sorted. The task is to find the median of the given matrix.

package Binary_search_on_2D_array;

import java.util.Scanner;

public class matrix_median {

    public static int high_element(int[][] matrix , int row , int column) {

        int high = matrix[0][0];

        for(int i = 0 ; i < row ; i ++) {
            for(int j = column - 1; j < column ; j ++) {
                if(high < matrix[i][j]) {
                    high = matrix[i][j];
                }
            }
        }

        return high;

    }

    public static void median(int[][] matrix, int row, int column) {
        int low = matrix[0][0];
        int high = high_element(matrix, row, column);

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

        // median(matrix, row, col);

        sc.close();
    }
}
