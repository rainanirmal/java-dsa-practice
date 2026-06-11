// The hourglass sum is the sum of the values in an hourglass. Calculate the hourglass sum of every hourglass in arr , then print the 
// maximum hourglass sum.

package Array_hard;

import java.util.*;

public class max_hourglass_sum {

    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int row = sc.nextInt();

        System.out.println("Enter number of columns : ");
        int column = sc.nextInt();

        int[][] matrix = new int[row][column];

        // max_sum(matrix, row, column);

        sc.close();

    }
    
}
