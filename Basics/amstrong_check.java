//Given an integer N, return true it is an Armstrong number otherwise return false.

package Basics;
import java.util.*;

public class amstrong_check {

    public static void amstrong(int n) {

        int temp = n;
        int digits = 0;
        double arm = 0;

        while(temp > 0 ) {
            temp = temp / 10;
            digits ++;
        }

        temp = n;
        
        while(temp > 0) {
            int digit = temp % 10;
            arm = arm + Math.pow(digit, digits);
            temp = temp / 10;
        }

        if(n == arm) {
            System.out.println("Entered number is a armstrong number.");
        }
        else {
            System.out.println("Entered number is not a armstrong number.");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        amstrong(num);

        sc.close();
    }
    
}
