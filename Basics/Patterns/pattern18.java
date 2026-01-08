package Basics.Patterns;

public class pattern18 {
    
    public static void main(String[] args) {
        
        for(int i = 1 ; i <= 4 ; i ++) {
            for(int j = 1 ; j <= 4 - i ; j ++) {
                System.out.print("  ");
            }
            char ch = 'A';
            for(int j = 1 ; j <= i ; j ++) {
                System.out.print(ch + " ");
                ch++;
            }
            ch--;;
            for(int j = 1 ; j <= i - 1 ; j ++) {
                ch --;
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
//       A 
//     A B A
//   A B C B A
// A B C D C B A
