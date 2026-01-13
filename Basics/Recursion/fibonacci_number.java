package Basics.Recursion;

import java.util.*;

public class fibonacci_number {
    
    public static void fibonacci(int num , int a , int b) {

        if(num == 0) {
            return;
        }

        System.out.print(a + " ");
        
        fibonacci(num - 1 , b, a + b);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        fibonacci(num, 0, 1);

        sc.close();
    }
}
