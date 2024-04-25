// create 2 custom exceptions to check age enter by the user for matrimonial registration
// if age < 18 then throw one exception with a message "Underage" if age > 50 then throw "Overage" message
// otherwise display message "Thanks for registration" (use custom class constructor and super keyword print message)
import java.util.Scanner;
class p21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            if (age < 18) throw new Underage("Underage");
            else if (age > 50) throw new Overage("Overage");
            else System.out.println("Thanks for registration");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
class Overage extends Exception {
    Overage(String msg) {super(msg);}
}
class Underage extends Exception {
    Underage(String msg) {super(msg);}
}