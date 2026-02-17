// Given a positive integer n. Find and return its square root. If n is not a perfect square, then return the floor value of sqrt(n).

package Binary_search_on_answer;

import java.util.*;

public class square_root_of_number {

    // public static void square(int n) {
    //     int i = 1;
    //     int square = 0;

    //     while (i * i <= n) {
    //         square = i;

    //         i++;
    //     }

    //     System.out.println("Square root : " +square);
    // }

    public static int sqaure(int n) {

        int low = 1;
        int high = n;
        int ans = 0;

        while (low <= high) {
            
            int mid = low + (high - low) / 2;

            if ((mid * mid) <= n) {
                ans = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int a = sc.nextInt();

        int result = sqaure(a);

        System.out.println("Square root : " +result);

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