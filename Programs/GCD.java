import java.util.Scanner;

public class GCD {
    /*
    This is how GCD WORKS

    Let find GCD of 4 & 8

    division of 4 & 8
    4-> 1,2,[4]
    8-> 1,2,[4],8
    these men that 4%1 = 0
    same for other
    here 4 is the greatest common division that men that 4 come in both, and it's the greatest
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        GCD gcdtry = new GCD();
        System.out.println("GCD is : " + gcdtry.gcd1(a, b));
        System.out.println("Euclidean Algorithm GCD is : " + gcdtry.EuclideanAlgorithmGCD(a, b));
    }
    private int gcd1(int n1, int n2) {
        while (n1 != n2) {
            if (n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }
        return n2;
    }

    //    Suppose 128 & 96
    private int EuclideanAlgorithmGCD(int n1, int n2) {
//        n1 = 96 & n2 = 128
        int a = (n1 > n2) ? n1 : n2; // here a = 128
        int b = (n1 < n2) ? n1 : n2; // here b = 96
        int r = b;              // here r = 96

        while (a % b != 0) {     // here a%b = 32 [128 % 96 = 32]
            r = a % b; // here r = a%b = 32 [128 % 96 = 32]
            a = b;   // here a = 96
            b = r;   // here b = 32
        }

        //        in second round 96%32 == 0 so 32 will be answered
        return r;
    }
}
