// Complete the function printNumber which takes an integer input from the user and prints it on the screen.
package Basics;
import java.util.*;

public class user_input_output {

    public static void printNumber(Scanner sc) {
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        System.out.println("Output : " +a);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        user_input_output.printNumber(sc);
    }
    
}
