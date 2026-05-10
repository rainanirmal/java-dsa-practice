// Given a 2-D array mat where the elements of each row are sorted in non-decreasing order, and the first element of a row is greater than the last element of the previous row (if it exists), and an integer target, determine if the target exists in the given mat or not.

package Binary_search_on_2D_array;

import java.util.*;

public class search_in_2D_array {

    public static boolean target(int[][] arr , int row , int col , int target) {
        int low = 0;
        int high = row * col - 1;

        while (low <= high) {
            
            int mid = low + (high - low) / 2;

            int r = mid / col;
            int c = mid % col;

            if (arr[r][c] == target) {
                return true;
            }
            else if (arr[r][c] > target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return false;
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

        System.out.println("Enter target : ");
        int target = sc.nextInt();

        boolean ans = target(matrix, row, col, target);

        System.out.println(ans);

        sc.close();
    }
}

// output 
// Enter number of rows : 
// 3
// Enter number of columns : 
// 4
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
// Enter target : 
// 8
// true

// Enter number of rows : 
// 2
// Enter number of columns : 
// 2
// Enter elements of matrix : 
// 1
// 2
// 3
// 4
// Enter target : 
// 8
// false