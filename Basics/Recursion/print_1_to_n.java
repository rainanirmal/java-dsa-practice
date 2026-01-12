package Basics.Recursion;

import java.util.*;

public class print_1_to_n {
    
    public static void print_n(int num , int n) {

        if(n == num + 1) {
            return;
        }

        System.out.println("Number : " +n);

        print_n(num, n + 1);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a num : ");
        int num = sc.nextInt();

        print_n(num, 1);

        sc.close();
    }
}
