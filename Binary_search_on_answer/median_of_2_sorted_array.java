package Binary_search_on_answer;

import java.util.*;

public class median_of_2_sorted_array {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array : ");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Enter elements of second array : ");
        for(int i = 0 ; i < n1 ; i ++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter size of second array : ");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("Enter elements of second array : ");
        for(int i = 0 ; i < n2 ; i ++) {
            arr2[i] = sc.nextInt();
        }

        sc.close();
    }
    
}
