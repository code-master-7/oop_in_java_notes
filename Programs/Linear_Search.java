import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter "+i+" number :");
            arr[i]= sc.nextInt();
        }

        System.out.print("Enter Element To Search : ");
        int elm = sc.nextInt();
        int res = LinearSearch(arr,elm);
        if(res!=-1)
        {
            System.out.println("Element Is Found At Position : "+res);
        }else{
            System.out.println("Element Not Found");
        }
    }

    public static int LinearSearch(int[] arr, int elm){
        for (int i=0;i<arr.length;i++){
            if(arr[i] == elm){
                return i;
            }
        }
        return -1;
    }
}
