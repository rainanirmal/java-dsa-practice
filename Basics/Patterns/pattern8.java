package Basics.Patterns;

public class pattern8 {

    public static void main(String[] args) {
        
        for(int i = 1 ; i <= 4 ; i ++) {
            for(int j = 1 ; j <= i ; j ++) {
                System.out.print(j + " ");
            }
            for(int k = 3 ; k >= i ; k--) {
                System.out.print("  ");
            }
            for(int l = 3 ; l >= i ; l--) {
                System.out.print("  ");
            }
            for(int m = i ; m >= 1 ; m--) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
