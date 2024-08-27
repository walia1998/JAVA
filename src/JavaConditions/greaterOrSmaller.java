package JavaConditions;

public class greaterOrSmaller {
    public static void main(String[] args) {
      int a = 16;
      int b = 23;
      int c = 45;
//nested conditions
      if(a >= b) {
          if(a >= c) {
              System.out.println("A is grater");
          }else {
              System.out.println("C is greater");
          }
      }else {
          if( b >= c) {
              System.out.println("B is grater");
          }else {
              System.out.println("c is the biggest");
          }
      }
      // We do not use that much nested conditions we have need to use only 2-3 nested condition.
    }
}
