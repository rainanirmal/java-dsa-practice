// You are given an integer n. You need to check if the number is prime or not.

package Basics;
import java.util.*;

public class prime_check {
    
    public static void prime(int n) {

        boolean isPrime = true;

        if(n == 0 || n == 1) {
            isPrime = false;
        }
        else {
            for(int i = 2 ; i <= n/2 ; i ++) {
                if(n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime) {
            System.out.println(n +" is a prime number.");
        }
        else {
            System.out.println(n + " is not a prime number.");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        prime(n);

        sc.close();
    }
}
