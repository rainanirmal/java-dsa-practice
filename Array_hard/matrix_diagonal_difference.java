// Given a square matrix, calculate the absolute difference between the sums of its diagonals.

package Array_hard;

import java.util.*;

public class matrix_diagonal_difference {

    public static int diagonal_difference(int[][] matrix , int row , int column) {

        int left_diagonal = 0;
        int right_diagonal = 0;
        int ans = 0;

        for(int i = 0 ; i < row ; i ++) {
            for(int j = i ; j <= i ; j ++) {
                left_diagonal = left_diagonal + matrix[i][j];
            }
        }

        for(int i = 0 ; i < row ; i ++) {
            for(int j = row - 1 - i ; j <= row - 1 - i ; j ++) {
                right_diagonal = right_diagonal + matrix[i][j];
            }
        }

        ans = Math.abs(left_diagonal - right_diagonal);

        return ans;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int row = sc.nextInt();

        System.out.println("Enter number of columns : ");
        int column = sc.nextInt();

        int[][] matrix = new int[row][column];

        for(int i = 0 ; i < row ; i ++) {
            System.out.println("Enter elements of " + i + "th row : ");
            for(int j = 0 ; j < column ; j ++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int difference = diagonal_difference(matrix, row, column);

        System.out.println("Absolute difference between the sums of diagonals : " + difference);

        sc.close();
    }
    
}

// output 
// Enter number of rows : 
// 3
// Enter number of columns : 
// 3
// Enter elements of 0th row : 
// 1
// 2
// 3
// Enter elements of 1th row : 
// 4
// 5
// 6
// Enter elements of 2th row : 
// 9
// 8
// 9
// Absolute difference between the sums of diagonals : 2

// Enter number of rows : 
// 4
// Enter number of columns : 
// 4
// Enter elements of 0th row : 
// -1
// 1
// -7
// -8
// Enter elements of 1th row : 
// -10
// -8
// -5
// -2
// Enter elements of 2th row : 
// 0
// 9
// 7
// -1
// Enter elements of 3th row : 
// 4
// 4
// -2
// 1
// Absolute difference between the sums of diagonals : 1