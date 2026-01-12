// Given an integer n, write a function to print all numbers from n to 1 (inclusive) using recursion.

package Basics.Recursion;

import java.util.*;

public class print_n_to_1 {
    
    public static void print_num(int num) {

        if(num == 0) {
            return;
        }

        System.out.println("Number : " +num);

        print_num(num - 1);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        print_num(num);

        sc.close();
    }
}
