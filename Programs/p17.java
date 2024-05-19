import java.util.Arrays;
import java.util.Scanner;

public class p17 {
    int [] arr ;
    p17(int [] arr1){ arr = arr1; }
    static int getMin(p17 obj){ return Arrays.stream(obj.arr).min().getAsInt(); }
    public static void main(String[] args) {
        p17 obj1 = new p17(new int[]{1, 2, 3});
        p17 obj2 = new p17(new int[]{2, 3, 4});
        p17 obj3 = new p17(new int[]{3, 4, 5});

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: "); int i = sc.nextInt();
        System.out.println(i * getMin(obj1) + "\n" + i * getMin(obj2) + "\n" + i * getMin(obj3));
    }
}