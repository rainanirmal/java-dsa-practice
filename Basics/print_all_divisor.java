//Given an integer N, return all divisors of N.

package Basics;

import java.util.ArrayList;
import java.util.*;

public class print_all_divisor {
    
    public static void divisor(int n) {

        ArrayList<Integer> divi = new ArrayList<>();

        for(int i = 1 ; i <= n ; i ++) {
            if(n % i == 0) {
                divi.add(i);
            }
        }

        System.out.println("List of " +n+ " divisors : " +divi);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        divisor(n);

        sc.close();

    }
}
