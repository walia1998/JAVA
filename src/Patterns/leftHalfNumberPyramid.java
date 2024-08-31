package Patterns;

public class leftHalfNumberPyramid {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            int count = 1;
            for(int j = 0; j < 4; j++) {
                if(i + j >= 3) {
                    System.out.print(count + " ");
                   count++;
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
