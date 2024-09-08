package NamePatterns;

public class Sania {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 30; j++) {
                // Print S
                if (((i == 0 || i == 2 || i == 4) && (j < 5)) || (i == 1 && j == 0) || (i == 3 && j == 4)) {
                    System.out.print("* ");
                }
                // Print A
                else if ((j == 6 || j == 10) || ((i == 0 || i == 2) && (j >= 6 && j <= 10))) {
                    System.out.print("* ");
                }
                // Print N
                else if ((j == 12 || j == 16) || ((i==1 && j ==13) || (i == 2 && j==14) || (i == 3 && j ==15) && (j >= 12 && j<=16 ))) {
                    System.out.print("* ");
                }
                //print I
                else if ((j == 20) || (i == 0 || i == 4) && (j >=18 && j<= 22)) {
                    System.out.print("* ");
                }
                //Print A
                else if (((i == 0 || i == 2) && (j >=24 && j<= 28)) || (j==24 || j ==28)) {
                    System.out.print("* ");
                }
                // Print spaces for the rest
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
