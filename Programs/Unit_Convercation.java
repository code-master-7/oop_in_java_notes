import java.util.Scanner;

public class Unit_Convercation {
    public static void main(String[] args) {
        double c, m, f, i, mm;
        int op = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Unit In Centimeter :");
        c = sc.nextDouble();

        System.out.print("Select Conversation Option:\n\n1.Milli Meter\n2.Meter\n3.Inch\n4.Feet\n\n");
        op = sc.nextInt();

        switch (op) {
            case 1:
                mm = c * 10;
                System.out.println("Milli merer =" + mm);
                break;
            case 2:
                m = c / 100;
                System.out.println("Meter =" + m);
                break;
            case 3:
                i = c * 0.3937007874;
                System.out.println("Inch =" + i);
                break;
            case 4:
                f = c * 0.032808399;
                System.out.println("Feet =" + f);
                break;
            default:
                System.out.println("Enter valid Choice...... ");
        }
    }
}