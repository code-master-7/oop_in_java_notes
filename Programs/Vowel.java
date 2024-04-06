import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 Character : ");
        ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Character Is Vowel.");
        } else {
            System.out.println("Character Is Consonant.");
        }
    }
}
