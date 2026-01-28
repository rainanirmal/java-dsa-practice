// Given an N * N 2D integer matrix, rotate the matrix by 90 degrees clockwise.
// The rotation must be done in place, meaning the input 2D matrix must be modified directly.

package Array_medium;

import java.util.*;

public class matrix_90_degree_rotate {

    public static void rotate(int[][] arr , int r , int c) {

        for(int i = 0 ; i < r ; i ++) {
            for(int j = i + 1 ; j < c ; j ++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        } // tranposing the matrix

        for(int i = 0 ; i < r ; i ++) {
            int left = 0;
            int right = r - 1;

            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int row = sc.nextInt();

        System.out.println("Enter number of columns : ");
        int column = sc.nextInt();

        int matrix[][] = new int[row][column];

        System.out.println("Enter elements of matrix : ");
        for(int i = 0 ; i < row ; i ++) {
            for(int j = 0 ; j < column ; j ++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original matrix : ");
        for(int i = 0 ; i < row ; i ++) {
            for(int j = 0 ; j < column ; j ++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        rotate(matrix, row, column);
        System.out.println("90 degree rotation of matrix : ");
        for(int i = 0 ; i < row ; i ++) {
            for(int j = 0 ; j < column ; j ++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

// output
// Enter number of rows : 
// 4
// Enter number of columns : 
// 4
// Enter elements of matrix : 
// 0
// 1
// 1
// 2
// 2
// 0
// 3
// 1
// 4
// 5
// 0
// 5
// 5
// 6
// 7
// 0
// Original matrix :
// 0 1 1 2
// 2 0 3 1
// 4 5 0 5
// 5 6 7 0
// 90 degree rotation of matrix :
// 5 4 2 0
// 6 5 0 1
// 7 0 3 1
// 0 5 1 2