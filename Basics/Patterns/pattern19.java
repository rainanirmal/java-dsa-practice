package Basics.Patterns;

public class pattern19 {
    
    public static void main(String[] args) {
        
        for(int i = 1 ; i <= 5 ; i ++) {
            char ch = (char)('E' - i + 1);
            for(int j = 1 ; j <= i ; j ++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
// E 
// D E
// C D E
// B C D E
// A B C D E


// 69 - 1 + 1	69	E
// 69 - 2 + 1	68	D
// 69 - 3 + 1	67	C
// 69 - 4 + 1	66	B
// 69 - 5 + 1	65	A