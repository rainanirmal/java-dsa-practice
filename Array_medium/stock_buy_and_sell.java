// Given an array arr of n integers, where arr[i] represents price of the stock on the ith day. Determine the maximum profit achievable by buying and selling the stock at most once. 

package Array_medium;

import java.util.*;

public class stock_buy_and_sell {

    public static void stock (int[] arr , int n) {

        int profit = 0;
        int max_profit = 0;

        int buy = 0;
        int sell = 0;

        for(int i = 0 ; i < n ; i ++) {
            for(int j = i + 1 ; j < n ; j ++) {
                profit = arr[j] - arr[i];
                if(profit > max_profit) {
                    max_profit = profit;

                    buy = i;
                    sell = j;
                }
            }
        }

        System.out.println("Buy on day " +(buy + 1)+ " ( price = " +arr[buy]+ " ) and sell on day " +(sell + 1)+ " ( price = " +arr[sell]+ " ) profit is " +max_profit);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of array : ");
        for(int i = 0 ; i < n ; i ++) {
            arr[i] = sc.nextInt();
        }

        stock(arr, n);

        sc.close();
    }
}

// output
// Enter size of array : 
// 6
// Enter elements of array : 
// 10
// 7
// 5
// 8
// 11
// 9
// Buy on day 3 ( price = 5 ) and sell on day 5 ( price = 11 ) profit is 6