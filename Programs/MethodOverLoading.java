import java.util.Scanner;

public class MethodOverLoading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Numbers : ");

        System.out.print("Enter N1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter N2 : ");
        int n2 = sc.nextInt();

        System.out.println("Sum Of 2 Numbers Is : " + addition(n1, n2));

        System.out.print("Enter Size Of Array : ");
        int size = sc.nextInt();
        int arr1[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + i + " Element : ");
            arr1[i] = sc.nextInt();
        }

        System.out.println("Sum Of Array Numbers Is : " + addition(arr1));

        System.out.println("Enter Size Of Array1 : ");
        size = sc.nextInt();
        System.out.println("Enter Size Of Array2 : ");
        int size2 = sc.nextInt();

        System.out.println("Enter Element OF Array 1 :");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + i + " Element : ");
            arr1[i] = sc.nextInt();
        }


        System.out.println("Enter Element OF Array 2 :");
        int arr2[] = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.print("Enter " + i + " Element : ");
            arr2[i] = sc.nextInt();
        }
        int sum1[] = addition(arr1, arr2);
        if (sum1 != null) {
            System.out.println("Sum of 2 Array Is : ");
            for (int i = 0; i < sum1.length; i++) {
                System.out.print(sum1[i] + "\t");
            }
        }
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int addition(int[] arr) {

        int sum = 0;
        for (int j : arr)
            sum = sum + j;

        return sum;
    }

    public static int[] addition(int[] arr1, int[] arr2) {

        if (arr1.length == arr2.length) {
            int[] sum = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                sum[i] = arr1[i] + arr2[i];
            }
            return sum;
        } else {
            System.out.println("Not Same Length .");
        }
        return null;
    }
}
