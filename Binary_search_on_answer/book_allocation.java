// Given an array nums of n integers, where nums[i] represents the number of pages in the i-th book, and an integer m representing the number of students, allocate all the books to the students so that each student gets at least one book, each book is allocated to only one student, and the allocation is contiguous.
// Allocate the books to m students in such a way that the maximum number of pages assigned to a student is minimized. If the allocation of books is not possible, return -1.

package Binary_search_on_answer;

import java.util.*;

public class book_allocation {

    public static int max (int[] arr) {

        int max = arr[0];

        for(int i = 0 ; i < arr.length ; i ++) {
            if(arr[i] > max) {
                max = arr[i];
            } 
        }

        return max;
    }

    public static int sum(int[] arr) {

        int sum = 0;

        for(int i = 0 ; i < arr.length ; i ++) {
            sum = sum + arr[i];
        }

        return sum;
    }

    public static int pages(int[] arr , int mid , int m) {

        int count = 1;
        int last = 0;

        for(int i = 0 ; i < arr.length ; i ++) {

            if (last + arr[i] > mid) {
                last = arr[i];
                count++;
            }
            else {
                last = last + arr[i];
            }
        }

        return count;
    }

    public static int allocation(int[] arr , int n , int m) {

        int low = max(arr);
        int high = sum(arr);

        int result = high;

        if(m > n) {
            return -1;
        }
        
        while (low <= high) {
            
            int mid = low + (high - low) / 2;

            int ans = pages(arr, mid, m);

            if(ans <= m) {
                result = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return result;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter number of pages in the i-th book : ");
        for(int i = 0 ; i < n ; i ++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number of students : ");
        int m = sc.nextInt();

        int result = allocation(arr, n, m);

        if(result == -1) {
            System.out.println("Book allocation not possible");
        }
        else {
            System.out.println("Maximum number of pages  allocation : " +result);
        }

        sc.close();
    }
}

// output
// Enter size of array : 
// 4
// Enter number of pages in the i-th book : 
// 12
// 34
// 67
// 90
// Enter number of students : 
// 2
// Maximum number of pages  allocation : 113

// Enter size of array : 
// 5
// Enter number of pages in the i-th book : 
// 25
// 46
// 28
// 49
// 24
// Enter number of students : 
// 4
// Maximum number of pages  allocation : 71