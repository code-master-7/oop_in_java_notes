import java.util.Scanner;
public class Calculator
{
	public static void main(String[] args)
	{
		int n1,n2,op=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N1 :");
		
		n1 = sc.nextInt();
		System.out.print("Enter N2 :");
		n2 = sc.nextInt();

		double res;
		while(true) {
			System.out.print("Select Calculation Option:\n\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n\n");
			op = sc.nextInt();

			switch (op) {
				case 1:
					res = n1 + n2;
					System.out.println("Addition =" + res);
					break;
				case 2:
					res = n1 - n2;
					System.out.println("Subtraction =" + res);
					break;
				case 3:
					res = n1 * n2;
					System.out.println("Multiplication =" + res);
					break;
				case 4:
					res = (double) n1 / n2;
					System.out.println("Division =" + res);
					break;
				default:
					System.out.println("Enter valid Choice...... ");
			}
		}
	}
}