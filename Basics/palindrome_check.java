package Basics;
import java.util.*;

public class palindrome_check {
    
    public static void palindrom(int n) {

        int temp = n;
        int rev = 0;

        while(temp > 0 ) {
            int digit = temp % 10;
            rev = (rev * 10) + digit;
            temp = temp / 10;
        }

        if(n == rev) {
            System.out.println("The reverse of " +n+ " is " +rev+ " therefore it is a palindrome number.");
        }
        else {
            System.out.println("The reverse of " +n+ " is " +rev+ " therefore it is not a palindrome number.");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        palindrom(num);

        sc.close();
    }
}
