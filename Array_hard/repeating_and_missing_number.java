package Array_hard;

import java.util.*;

public class repeating_and_missing_number {

    public static void repeat_missing(int[] arr , int n) {

        for(int i = n - 1 ; i >= 0 ; i --) {
            for(int j = 0 ; j < i ; j ++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int num = 1;

        int[] temp = new int[2];

        for(int i = 0 ; i < n ; i ++) {
            if(arr[i] != num) {
                temp[1] = num;
                break;
            }
            else {
                num++;
            }
        }

        for(int i = 0 ; i < n - 1 ; i ++) {
            if (arr[i] == arr[i + 1]) {
                temp[0] = arr[i];
                break;
            }
        }

        for(int i = 0 ; i < 1 ; i ++) {
            System.out.println("Repeating and missing : [ " + temp[0] + " , " + temp[1] + " ] ");
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of array (must be between 1 to " + n + ") : ");
        for(int i = 0 ; i < n ; i ++) {
            arr[i] = sc.nextInt();
        }

        repeat_missing(arr, n);

        sc.close();
    }
}

// output
// Enter size of array : 
// 7
// Enter elements of array (must be between 1 to 7) : 
// 1
// 2
// 3
// 6
// 7
// 5
// 7
// Repeating and missing : [ 7 , 4 ] 

// Enter size of array : 
// 5
// Enter elements of array (must be between 1 to 5) : 
// 3
// 5
// 4
// 1
// 1
// Repeating and missing : [ 1 , 2 ] 