// A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
// for arr = [1,2,3], the following are all the permutations of arr:
// [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1].

package Array_medium;

import java.util.*;

public class next_permutation {

    public static void permutation_reverse(int[] arr , int start , int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
 
    public static void next(int[] arr , int n) {

        int index = -1;

        for(int i = n - 2 ; i >= 0 ; i --) {
            if(arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for(int i = n - 1 ; i > index ; i --) {
                if(arr[i] > arr[index]) {
                    int temp = arr[i];
                    arr[i] = arr[index];
                    arr[index] = temp;
                    break;
                }
            }
        }

        permutation_reverse(arr, index + 1, n - 1);        
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elments of array : ");
        for(int i = 0 ; i < n ; i ++) {
            arr[i] = sc.nextInt();
        }

        next(arr, n);

        System.out.println("Next permutation : ");
        for(int i = 0 ; i < n ; i ++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    
}

// output
// Enter size of array : 
// 3
// Enter elments of array : 
// 3
// 2
// 1
// Next permutation : 
// 1 2 3 

// Enter size of array :
// 7
// Enter elments of array :
// 2
// 1
// 5
// 4
// 3
// 0
// 0
// Next permutation :
// 2 3 0 0 1 4 5