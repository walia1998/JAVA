package JavaConditions;

public class if_else_if {
    public static void main(String[] args) {

        int marks = 87;

        /**
         *   > 90 - A
         *   80- 90 - B
         *   60-70 - C
         *   50-60 - D
         *   <50 F
         */

        if(marks >= 90) {
            System.out.println("A");
        }else if(marks >=80 && marks < 90) {
            System.out.println("B");
        }else if(marks >= 70 && marks < 80) {
            System.out.println("C");
        }else if(marks >= 60 && marks <70){
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}
