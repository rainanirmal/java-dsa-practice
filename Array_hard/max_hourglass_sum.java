// The hourglass sum is the sum of the values in an hourglass. Calculate the hourglass sum of every hourglass in arr , then print the 
// maximum hourglass sum.

package Array_hard;

import java.util.*;

public class max_hourglass_sum {

    public static void max_sum(int[][] matrix , int row , int column) {
        
        int size = (row - 2) * (column - 2);
        int[] arr = new int[size];
        int t = 0;

        for(int i = 0 ; i < row - 2 ; i ++) {

            int index = 0;

            while (index < column - 2) {
                int count = 0;

                for(int j = index ; j <= index + 2 ; j ++) {
                    count = count + matrix[i][j];
                }

                count = count + matrix[i + 1][index + 1];

                for(int j = index ; j <= index + 2 ; j ++) {
                    count = count + matrix[i + 2][j];
                }

                index ++;
                arr[t] = count;
                t++;
            }
        }

        int highest = arr[0];

        for(int i = 0 ; i < t ; i ++) {
            if(arr[i] > highest) {
                highest = arr[i];
            }
        }

        System.out.println("Highest sum : " + highest);
    }

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

        max_sum(matrix, row, column);

        sc.close();

    }
    
}

// output 
// Enter number of rows : 
// 6
// Enter number of columns : 
// 6
// Enter elements of 0th row : 
// 1
// 1
// 1
// 0
// 0
// 0
// Enter elements of 1th row : 
// 0
// 1
// 0
// 0
// 0
// 0
// Enter elements of 2th row : 
// 1
// 1
// 1
// 0
// 0
// 0
// Enter elements of 3th row : 
// 0
// 0
// 2
// 4
// 4
// 0
// Enter elements of 4th row : 
// 0
// 0
// 0
// 2
// 0
// 0
// Enter elements of 5th row : 
// 0
// 0
// 1
// 2
// 4
// 0
// Highest sum : 19

// Enter number of rows : 
// 3
// Enter number of columns : 
// 3
// Enter elements of 0th row : 
// 2
// 4
// 4
// Enter elements of 1th row : 
// 0
// 2
// 0
// Enter elements of 2th row : 
// 1
// 2
// 4
// Highest sum : 19