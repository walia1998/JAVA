package Methods;

public class calculator {
    public int add(int a, int b) {
        return  a + b;
    }
//    public double add(int a, int b) {
//        return a+b+0.5; // return type change kar dene se method overloading nahi hogi isme complilation error aayega
//    }
    public int add(int a, double b) {
        return (int)(a+b); //casting --> double to an integer
    }
    public int add(int a, int b, int c) {
        return a+b+c;
    }

    // this is the example of method overloading
}
