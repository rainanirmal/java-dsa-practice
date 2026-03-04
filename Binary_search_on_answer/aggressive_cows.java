package Binary_search_on_answer;

import java.util.*;

public class aggressive_cows {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter position of stalls : ");
        for(int i = 0 ; i < n ; i ++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number of aggressive cows : ");
        int k = sc.nextInt();

        sc.close();
    }
    
}
