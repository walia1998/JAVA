package NamePatterns;

public class Ashish {
    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 40; j++) {
                //Printing A
                if (((j == 0 || j == 4) || (i == 0 || i == 2) && ( j <= 4))) {
                    System.out.print("* ");
                    //printing S
                } else if (((i == 0 || i == 2 || i == 4) && (j >= 6 && j <= 10)) || (i == 1 && j == 6) || (i == 3 && j == 10)) {
                    System.out.print("* ");
                }
                //Printing H
                else if ((j == 12 || j == 16) || (i == 2 && (j >= 12 && j <= 16))) {
                    System.out.print("* ");
                }
                //Printing I
                else if (((i == 0 || i == 4) && (j >= 18 && j <= 22)) || j == 20) {
                    System.out.print("* ");
                    //printing S
                } else if (((i == 0 || i == 2 || i == 4) && (j >= 24 && j <= 28)) || (i == 1 && j == 24) || (i == 3 && j == 28)) {
                    System.out.print("* ");
                }
                // Printing H
                else if ((j == 30 || j == 34) || (i == 2 && (j >= 30 && j <= 34))) {
                    System.out.print("* ");
                }
                // Printing W
//                else if ((j == 24 || j == 28) || (i ==3 && (j ==25 || j==27) || (i==2 && j ==26 ) )) { //Printing W
//                    System.out.print("* ");
//                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
