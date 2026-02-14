// Given a positive integer n. Find and return its square root. If n is not a perfect square, then return the floor value of sqrt(n).

package Binary_search_on_answer;

import java.util.*;

public class square_root_of_number {

    public static void square(int n) {
        int i = 1;
        int square = 0;

        while (i * i <= n) {
            square = i;

            i++;
        }

        System.out.println("Square root : " +square);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int a = sc.nextInt();

        square(a);

        sc.close();
    }
    
}

// output
// Enter a number : 
// 36
// Square root : 6

// Enter a number : 
// 20
// Square root : 4