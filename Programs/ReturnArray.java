import java.util.Scanner;

public class ReturnArray {
    public static int[] arrayDemo(int[] arr){

        int count=0;
        for (int i=0;i<arr.length-1;i++){
            arr[i]=arr[i]*2;
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter "+i+" number :");
            arr[i]= sc.nextInt();
        }

        int[] res = arrayDemo(arr);
        System.out.print("Sorted Array IS : ");
        for(int i = 0 ; i <=res.length-1;i++){
            System.out.print(res[i]+"\t");
        }
    }
}
