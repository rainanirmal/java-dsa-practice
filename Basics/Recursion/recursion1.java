// Given an integer N, write a program to print your name N times.

package Basics.Recursion;

import java.util.*;

public class recursion1 {
    
    public static void print_name(String name , int count , int n) {
        
        if(count == n + 1) {
            return;
        }

        System.out.println("Name : " +name+ " , Count : " +count);

        print_name(name, count + 1, n);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name : ");
        String name = sc.next();

        System.out.println("Enter number : ");
        int n = sc.nextInt();

        print_name(name, 1, n);

        sc.close();
    }
}
