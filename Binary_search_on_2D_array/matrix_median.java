// Given a 2D array matrix that is row-wise sorted. The task is to find the median of the given matrix.

package Binary_search_on_2D_array;

import java.util.Scanner;

public class matrix_median {
    
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

        sc.close();
    }
}
