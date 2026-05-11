// Given a 0-indexed n x m matrix mat where no two adjacent cells are equal, find any peak element mat[i][j] and return the array [i, j].A peak element in a 2D grid is an element that is strictly greater than all of its adjacent neighbours to the left, right, top, and bottom.
// Assume that the entire matrix is surrounded by an outer perimeter with the value -1 in each cell.
// Note: As there can be many peak values, 1 is given as output if the returned index is a peak number, otherwise 0.

package Binary_search_on_2D_array;

import java.util.Scanner;

public class search_peak_element_II {
    
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
