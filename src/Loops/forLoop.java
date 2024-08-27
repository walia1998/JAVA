package Loops;

public class forLoop {
    public static void main(String[] args) {

        /**
         * special powers of for loop
         *continue
         *break
         */

        for(int i = 0; i < 3; i++) {
            System.out.println("Har Har Mahadev");
        }


        // print all the number even number between 1 - 10

        for (int i = 0; i <= 10; i++) {
            if( i == 5) {
                break;
            }
            if(i % 2 != 0) {
                continue; //next lines are not executed
            }
            System.out.println(i);
        }
    }
}
