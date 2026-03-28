// Given two sorted arrays a and b of size m and n respectively. Find the kth element of the final sorted array.

package Binary_search_on_answer;

import java.util.*;

public class kth_element_of_2_arrays {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array : ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];

        System.out.println("Enter elements of first array : ");
        for(int i = 0 ; i < n ; i ++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter size of second array : ");
        int m = sc.nextInt();

        int[] arr2 = new int[m];

        System.out.println("Enter elements of second array : ");
        for(int i = 0 ; i < m ; i ++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Enter kth position : "); 
        int k = sc.nextInt();

        sc.close();
    }
    
}
