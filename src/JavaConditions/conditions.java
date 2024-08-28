package JavaConditions;

public class conditions {
    public static void main(String[] args) {
        //boolean sheAgreed = true;

//        if(sheAgreed) {
//            System.out.println("Good");
//        }else {
//            System.out.println("Hare Krishan");
//        }
//        System.out.println("Omly Krishna");

        int a = 20;
        int b = 30;
        int c = 40;

        if(a > b && b > c ){
            System.out.println("A is greater");
        } else if (b > a && b > c) {
            System.out.println("B is greater ");
        }else {
            System.out.println("C is greater");
        }

    }
}
