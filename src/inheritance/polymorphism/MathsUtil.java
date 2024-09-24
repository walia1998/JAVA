package inheritance.polymorphism;

public class MathsUtil {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
    int add(int a, double b ) {
        return(int) (a + b );
    }
//    double add(int a, int b ) {
//        return(double) (a + b );
//    }
    //Same method but different parameter; and we can say method Overloading

    /**
     * OVERLOADING TYPES
     *  1. same name
     *  2. different parameteres
     *  3. can't do overloading just on different type return type
     *
     * @param args
     */
    public static void main(String[] args) {
        MathsUtil mathsUtil = new MathsUtil();

        mathsUtil.add(5,6);
        mathsUtil.add(5,6, 7);
       // mathsUtil.add(5,6, 8.9); // compile time polymorphism

    }
}
