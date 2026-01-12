// You are given an integer n. Return the value of n! or n factorial.

package Basics.Recursion;

import java.util.Scanner;

public class factorial_of_n {

    public static void factorial(int num , int n , int fact) {

        if(n > num) {
            System.out.println("Factorial of " +num+ " is : " +fact);
            return;
        }

        factorial(num, n + 1, fact * n);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        factorial(num, 1, 1);

        sc.close();
    }
}
