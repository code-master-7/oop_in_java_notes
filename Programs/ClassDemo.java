import java.util.Scanner;

public class ClassDemo {

    public int[] arr;
    int size;
    public void addition(int[] arr){

        int sum=0;
        for (int j : arr) {
            sum = sum + j;
        }
        print(sum);
    }

    public void print(int sum){
        System.out.println("Sum Of Array Is : "+sum);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ClassDemo cd = new ClassDemo();
        System.out.print("Enter Size Of Array : ");
        cd.size = sc.nextInt();
        cd.arr = new int[cd.size];
        for (int i=0;i<cd.size;i++){
            System.out.print("Enter "+i+" Element : ");
            cd.arr[i] = sc.nextInt();
        }

        cd.addition(cd.arr);
    }
}
