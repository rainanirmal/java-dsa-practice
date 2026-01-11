//Given an integer N, return the number of digits in N.

package Basics;
import java.util.*;

public class digit_count {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int n = sc.nextInt();

        int temp = n;
        int count = 0;

        while(temp > 0 ) {
            temp = temp / 10;
            count++;
        }

        System.out.println("Number of digits in integer : " +count);

        sc.close();

    }
}
