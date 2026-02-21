// Given n roses and an array nums where nums[i] denotes that the 'ith' rose will bloom on the nums[i]th day, only adjacent bloomed roses can be picked to make a bouquet. Exactly k adjacent bloomed roses are required to make a single bouquet. Find the minimum number of days required to make at least m bouquets, each containing k roses. Return -1 if it is not possible.

package Binary_search_on_answer;

import java.util.*;

public class minimum_days_to_make_m_bouquets {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of roses : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter days of bloom : ");
        for(int i = 0 ; i < n ; i ++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number of required bloomed roses : ");
        int k = sc.nextInt();

        System.out.println("Enter number of bouquets : ");
        int m = sc.nextInt();

        sc.close();
    }    
}