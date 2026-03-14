// You are given A painters and an array C of N integers where C[i] denotes the length of the ith board. Each painter takes B units of time to paint 1 unit of board. You must assign boards to painters such that:

// Each painter paints only contiguous segments of boards.
// No board can be split between painters.
// The goal is to minimize the time to paint all boards

package Binary_search_on_answer;

import java.util.*;

public class painter_partition {

    public static void time_to_paint_all_boards(int[] arr , int n , int a , int b) {}
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of painters : ");
        int a = sc.nextInt();

        System.out.println("Enter number of boards : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter length of each board : ");
        for(int i = 0 ; i < n ; i ++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter time of painter take to paint 1 unit of board : ");
        int b = sc.nextInt();

        sc.close();
    }
}
