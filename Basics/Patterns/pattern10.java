package Basics.Patterns;

public class pattern10 {
    
    public static void main(String[] args) {
        
        for(int i = 5 ; i >= 1 ; i --) {
            for(int j = 1 ; j < i ; j ++) {
                System.out.print("  ");
            }
            for(int k = 1 ; k <= 6 - i ; k ++) {
                System.out.print("* ");
            }
            for(int l = 1 ; l <= 5 - i ; l ++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1 ; i <= 4 ; i ++) {
            for(int j = 1 ; j <= i ; j ++) {
                System.out.print("  ");
            }
            for(int k = 1 ; k <= 5 - i ; k ++) {
                System.out.print("* ");
            }
            for(int l = 1 ; l <= 4 - i ; l ++) {
                System.out.print("* ");
            } 
            System.out.println();
        }
    }
}

//         * 
//       * * *
//     * * * * *
//   * * * * * * *
// * * * * * * * * *
//   * * * * * * *
//     * * * * *
//       * * *
//         *
