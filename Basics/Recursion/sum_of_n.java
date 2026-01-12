// Given an integer N, return the sum of first N natural numbers. Try to solve this using recursion.

package Basics.Recursion;

import java.util.*;

public class sum_of_n {
    
    public static void print_sum(int num , int n , int sum) {

        if(n > num) {
            System.out.println("Sum from 1 to " +num+ " is : " +sum);
            return;
        }

        print_sum(num, n + 1, sum + n);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        print_sum(num, 1, 0);

        sc.close();
    }
}
