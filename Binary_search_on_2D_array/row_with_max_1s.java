// Given a non-empty grid mat consisting of only 0s and 1s, where all the rows are sorted in ascending order, find the index of the row with the maximum number of ones.
// If two rows have the same number of ones, consider the one with a smaller index. If no 1 exists in the matrix, return -1.

package Binary_search_on_2D_array;

import java.util.*;

public class row_with_max_1s {

    public static int lower(int[] arr , int col , int x) {
        int low = 0;
        int high = col - 1;
        int ans = col;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static int row_index(int[][] arr , int row , int col) {
        int index = -1;
        int max_count = 0;

        for(int i = 0 ; i < row ; i ++) {
            int count = col - lower(arr[i], col, 1);

            if(count > max_count) {
                max_count = count;
                index = i;
            }
        }

        return index;
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

        int max = row_index(matrix, row, col);

        System.out.println("Row with maximum 1 index : " + max);

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
// 0
// 1
// 1
// 0
// 0
// 0
// Row with maximum 1 index : 0

// Enter number of rows : 
// 2
// Enter number of columns : 
// 2
// Enter elements of matrix : 
// 0
// 0
// 0
// 0
// Row with maximum 1 index : -1