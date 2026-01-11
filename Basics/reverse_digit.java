// Given an integer N return the reverse of the given number.
// Note: If a number has trailing zeros, then its reverse will not include them.
//  For e.g , reverse of 10400 will be 401 instead of 00401.

package Basics;
import java.util.*;

public class reverse_digit {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer : ");
        int n = sc.nextInt();

        int temp = n;
        int rev = 0;

        while (temp > 0) {
            int digit = temp % 10;
            rev = (rev * 10) + digit;
            temp = temp / 10;
        }

        System.out.println("Reverse order : " +rev);

        sc.close();
    }
}