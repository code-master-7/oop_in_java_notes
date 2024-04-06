import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter "+i+" number :");
            arr[i]= sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter "+i+" number Is :"+arr[i]);
        }
    }
}
