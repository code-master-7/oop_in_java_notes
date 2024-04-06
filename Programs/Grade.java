import java.util.Scanner;

import static java.lang.System.exit;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pay Amount :");
        double pay = sc.nextDouble();
        System.out.println("Enter Score :");
        int score = sc.nextInt();

        if (score <= 0) {
            System.out.println("Invalid Score....");
            exit(0);
        } else {
            if(score>=90){
                pay = pay + pay*0.03;
            }else{
                pay = pay + pay*0.01;
            }
        }
        System.out.println("Pay = " + pay);
    }
}