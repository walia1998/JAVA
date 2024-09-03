package Patterns;

public class DimaondPattern {
    public static void main(String[] args) {
        int num = 5;
        int count = 1;
        for(int i = 0; i <= num; i++) {
            //Print first the empty space
            for(int j = i; j <num; j++) {
                System.out.print("  ");
            }
            //Print the number
            for(int j = 1; j<=i; j++) {
                System.out.print(  count + "  ");
                count++;
            }
            System.out.println();
        }
        //Reset the value of Count
        count = count - num;
        for(int i =num; i>=1; i--) {
            for(int j = num; j>i; j--) {
                System.out.print("  ");
            }
            //Print the numbers
            for(int j = 1; j<=i; j++) {
                System.out.print( count + "  ");
                count++;
            }
            //Reset the count value
            count =  count - 2 * i + 1;
            System.out.println();
        }
    }
}
