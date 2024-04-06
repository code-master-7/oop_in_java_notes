import java.util.Scanner;

public class Min_Max {
    public static int min(int[] arr){
        int min=0;
        for(int i=0;i< arr.length-1;i++){
            min = i;
            if(arr[min]>arr[i+1]){
                min = arr[i+1];
            }else {
                min = arr[i];
            }
        }
        return min;
    }
    public static int max(int[] arr){
        int max=0;
        for(int i=0;i< arr.length-1;i++){
            max = i;
            if(arr[max]<arr[i+1]){
                max = arr[i+1];
            }else {
                max = arr[i];
            }
        }
        return max;
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
        int min = min(arr);
        System.out.println("Maximum Element IS :"+min);
        int max = max(arr);
        System.out.println("Maximum Element IS :"+max);
    }
}
