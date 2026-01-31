// Given two integers r and c, return the value at the rth row and cth column (1-indexed) in a Pascal's Triangle.

package Array_hard;

import java.util.*;

public class pascals_triangle {

    public static void pascal(int r , int c) {

        int arr[][] = new int[r][r];

        for(int i = 0 ; i < r ; i ++) {
            arr[i][0] = 1;
            arr[i][i] = 1;

            for(int j = 1 ; j <= i ; j ++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }

        System.out.println("Pascal's triangle : ");
        for(int i = 0 ; i < r ; i ++) {
            for(int j = 0 ; j <= i ; j ++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Element at rth , cth index : " + arr[r - 1][c - 1]);
        
    } 
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rth index : ");
        int r = sc.nextInt();

        System.out.println("Enter cth index: ");
        int c = sc.nextInt();

        pascal(r, c);

        sc.close();
    }
}

// output
// Enter rth index : 
// 4
// Enter cth index: 
// 2
// Pascal's triangle : 
// 1
// 1 1
// 1 2 1
// 1 3 3 1
// Element at rth , cth index : 3