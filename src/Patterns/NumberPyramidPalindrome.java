package Patterns;

public class NumberPyramidPalindrome {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= 5-i; j++ ){
                System.out.print("  ");
            }
            int count = 1;
            for(int k = 1; k <= i ; k++) {
                System.out.print(count + " ");
                count++;
            }
            // Print decreasing numbers
            count = i - 1;
            for(int k = 1; k < i; k++) {
                System.out.print(count + " ");
                count--;
            }

            System.out.println();
        }
    }
}
