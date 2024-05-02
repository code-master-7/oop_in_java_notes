// you are given a method 'divide' which will accept 2 numbers and divide it if the 2nd number is zero then throw ArithmeticException
// with its cause IoException write a program using chained exception
import java.util.Scanner;
public class p22 {
    static void divide(int a, int b) {
        try {
            if(b==0) throw new ArithmeticException("IO Exception");
            System.out.println(a / b);
        } catch (ArithmeticException ae) {
            throw new ArithmeticException(ae.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        divide(sc.nextInt(),sc.nextInt());
    }
}