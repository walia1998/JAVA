package Patterns;

public class oddNumberTrianlge {
    public static void main(String[] args) {
        int count = 1;
        for(int i = 0; i <= 5; i++) {
            int newCount = count;
            for(int j = 0; j < i; j++) {
                    System.out.print(newCount + " ");
                    newCount +=2 ;
            }
            System.out.println();
        }
    }
}
