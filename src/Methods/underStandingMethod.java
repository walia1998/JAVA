package Methods;

public class underStandingMethod {
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void printHello(String name) {
        System.out.println("Hello " + name );
    }
    public static void main(String[] args) {
        printHello("Ashsih Walia");
        System.out.println( "Sum of given two number is : " + add(5,6)); ;
    }
}
