// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0. You must do it in place.

package Array_medium;

import java.util.*;

public class set_matrix_zero {

    public static void set_zero(int[][] arr , int r , int c) {

        int row = 0;
        int column = 0;

        for(int i = 0 ; i < r ; i ++) {
            for(int j = 0 ; j < c ; j ++) {
                if(arr[i][j] == 0) {
                    row = i;
                    column = j;
                }
            }
        }

        for(int k = 0 ; k < r ; k ++) {
            for(int l = 0 ; l < c ; l ++) {
                arr[k][column] = 0;
                arr[row][l] = 0;
            }
        }                
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int row = sc.nextInt();

        System.out.println("Enter number of columns : ");
        int column = sc.nextInt();

        int[][] matrix = new int[row][column];

        System.out.println("Enter elements of matrix : ");
        for(int i = 0 ; i < row ; i ++) {
            for(int j = 0 ; j < column ; j ++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original matrix : ");
        for(int i = 0 ; i < row ; i ++) {
            for(int j = 0 ; j < column ; j ++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        set_zero(matrix, row, column);

        System.out.println("After setting to zero : ");
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
// 3
// Enter number of columns : 
// 3
// Enter elements of matrix :
// 1
// 1
// 1
// 1
// 0
// 1
// 1
// 1
// 1
// Original matrix :
// 1 1 1
// 1 0 1
// 1 1 1
// After setting to zero :
// 1 0 1
// 0 0 0
// 1 0 1