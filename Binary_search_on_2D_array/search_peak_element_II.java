// Given a 0-indexed n x m matrix mat where no two adjacent cells are equal, find any peak element mat[i][j] and return the array [i, j].A peak element in a 2D grid is an element that is strictly greater than all of its adjacent neighbours to the left, right, top, and bottom.
// Assume that the entire matrix is surrounded by an outer perimeter with the value -1 in each cell.
// Note: As there can be many peak values, 1 is given as output if the returned index is a peak number, otherwise 0.

package Binary_search_on_2D_array;

import java.util.Scanner;

public class search_peak_element_II {

    public static void peak_element(int[][] arr , int row , int column) {
        
        int low = 0;
        int high = column - 1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            int max = 0;

            for(int i = 0 ; i < row ; i ++) {
                if(arr[i][mid] > arr[max][mid]) {
                    max = i;
                }
            }

            int current = arr[max][mid];

            int left = -1;
            if(mid - 1 >= 0) {
                left = arr[max][mid - 1];
            }

            int right = -1;
            if(mid + 1 < column) {
                right = arr[max][mid + 1];
            }

            if(current > left && current > right) {
                System.out.println("Peak element : " + current );
                System.out.println("Index : [" + max + "][" + mid + "]");
                return;
            }
            else if(current < left) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
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

        peak_element(matrix, row, col);

        sc.close();
    }
}

// output
// Enter number of rows : 
// 3
// Enter number of columns : 
// 3
// Enter elements of matrix : 
// 10
// 20
// 15
// 21
// 30
// 14
// 7
// 16
// 32
// Peak element : 30
// Index : [1][1]

// Enter number of rows : 
// 2
// Enter number of columns : 
// 2
// Enter elements of matrix : 
// 10
// 7
// 11
// 7
// Peak element : 11
// Index : [1][0]