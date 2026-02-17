package Binary_search_on_answer;

import java.util.*;

public class nth_root_of_number {

    public static int power(int mid , int n) {

        int ans = 1;

        for(int i = 1 ; i <= n ; i ++) {
            ans = ans * mid;
        }

        return ans;
    }

    public static int root(int n , int m) {

        int low = 1;
        int high = m;

        while (low <= high) {
            
            int mid = low + (high - low) / 2;

            int power = power(mid, n);

            if(power == m) {
                return mid;
            }

            if(power < m) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter nth root of a number : ");
        int n = sc.nextInt();

        System.out.println("Enter m number : ");
        int m = sc.nextInt();

        int result = root(n, m);
        
        if(result == -1) {
            System.out.println("The " + n + " root of " + m + " does not exists.");
        }
        else {
            System.out.println("The " + n + " root of " + m + " is " + result + "(" + result + "^" + n + " = " + m +")");
        }

        sc.close();
    }
    
}

// output
// Enter nth root of a number : 
// 4
// Enter m number : 
// 16
// The 4 root of 16 is 2(2^4 = 16)

// Enter nth root of a number : 
// 3
// Enter m number : 
// 27
// The 3 root of 27 is 3(3^3 = 27)