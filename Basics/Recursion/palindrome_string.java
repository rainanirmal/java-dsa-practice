// Given a string s, return true if the string is palindrome, otherwise false.

package Basics.Recursion;

import java.util.*;

public class palindrome_string {
    
    public static boolean palindrome(String s , int start  , int end) {

        if(start >= end) {
            return true;
        }

        if(s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return palindrome(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String s = sc.nextLine();

        boolean result = palindrome(s, 0, s.length() - 1);

        if(result) {
            System.out.println(s + " is a palindrome string.");
        }
        else {
            System.out.println(s + " is not a palindrome string.");
        }

        sc.close();
    }
}
