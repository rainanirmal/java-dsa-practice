package Basics.Patterns;

public class pattern17 {
    
    public static void main(String[] args) {
        
        for(int i = 4 ; i >= 1 ; i --) {
            for(int j = 4 ; j >= i ; j --) {
                System.out.print(j + " ");
            }
            for(int j = 1 ; j <= i - 1 ; j ++) {
                System.out.print(i + " ");
            }
            for(int j = 1 ; j <= i - 1 ; j ++) {
                System.out.print(i + " ");
            }
            for(int j = i + 1; j <= 4 ; j ++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for(int i = 1 ; i <= 3 ; i ++) {
            for(int j = 4 ; j >= i + 1 ; j --) {
                System.out.print(j + " ");
            }
            for(int j = 1 ; j <= i ; j ++) {
                System.out.print(i + 1 + " ");
            }
            for(int j = 1 ; j <= i ; j ++) {
                System.out.print(i + 1 + " ");
            }
            for(int j = i + 2 ; j <= 4 ; j ++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
// 4 4 4 4 4 4 4 
// 4 3 3 3 3 3 4 
// 4 3 2 2 2 3 4 
// 4 3 2 1 2 3 4
// 4 3 2 2 2 3 4
// 4 3 3 3 3 3 4
// 4 4 4 4 4 4 4 