package Patterns;

public class plusSign {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                // I need logic here
                if(i == 2 || j == 2) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");  // we put 2 space, 1 space for star and other one for space itself
                }
            }
            System.out.println();
        }
    }
}
