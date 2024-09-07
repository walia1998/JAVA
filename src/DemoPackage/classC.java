package DemoPackage;
import Methods.classA; //When you want class from another package

public class classC {
   public static void main(String[] args) { // We cannot access classA without Import classA
       System.out.println(classA.sum(7,8));
    }
}
