import java.util.Scanner;

public class Min_Max {
    static void print(int num){
     System.out.println(num);
   }
       public static void min(int[] arr){
        int min =arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i] < min ) min = arr[i];
        }
        print(min);
    }
    public static void max(int[] arr){
        int max=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i] > max ) max = arr[i];
        }
        print(max);
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
        min(arr);
        max(arr);
    }
}
