// you are given a method 'divide' which will accept 2 numbers and divide it if the 2nd number is zero then throw ArithmeticException
// with its cause IoException write a program using chained exception

import java.io.IOException;
import java.util.Scanner;

public class p22 {
    static void divide(int a, int b) {
        try {
            if (b == 0) {
                ArithmeticException ae = new ArithmeticException();
                ae.initCause(new IOException("IO Exception."));
                throw ae;
            }
            System.out.println(a / b);
        } catch (ArithmeticException ae) {
            System.out.println(ae.getCause());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        divide(sc.nextInt(), sc.nextInt());
    }
}