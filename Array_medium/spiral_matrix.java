// Given an M * N matrix, print the elements in a clockwise spiral manner.
// Return an array with the elements in the order of their appearance when printed in a spiral manner.

package Array_medium;

import java.util.*;;

public class spiral_matrix {

    public static void spiral(int[][] arr , int r , int c) {

        int left = 0;
        int right = c - 1;
        int top = 0;
        int bottom = r  -1;

        System.out.println("Spiral matrix array : ");

        while (top <= bottom && left <= right) {

            for(int i = left ; i <= right ; i ++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;

            for(int i = top ; i <= bottom ; i ++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            if (top <= bottom) {
                for(int i = right ; i >= left ; i --) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }

            if (left <= right) {
                for(int i = bottom ; i >= top ; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
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

        spiral(matrix, row, column);

        sc.close();
    } 
}

// output
// Enter number of columns : 
// 3
// Enter elements of matrix : 
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// Original matrix : 
// 1 2 3
// 4 5 6
// 7 8 9
// Spiral matrix array :
// 1 2 3 6 9 8 7 4 5

// Enter number of rows : 
// 4
// Enter number of columns : 
// 5
// Enter elements of matrix : 
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
// 11
// 12
// 13
// 14
// 15
// 16
// 17
// 18
// 19
// 20
// Original matrix :
// 1 2 3 4 5
// 6 7 8 9 10
// 11 12 13 14 15
// 16 17 18 19 20
// Spiral matrix array :
// 1 2 3 4 5 10 15 20 19 18 17 16 11 6 7 8 9 14 13 12