// Given a square matrix, calculate the absolute difference between the sums of its diagonals.

package Array_hard;

import java.util.*;

public class matrix_diagonal_difference {

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

        sc.close();
    }
    
}
