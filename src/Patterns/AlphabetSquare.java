package Patterns;

public class AlphabetSquare {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            char a = 'A' ;
            for(int j = 0; j < 5; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}
