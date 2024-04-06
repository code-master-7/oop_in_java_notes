import java.util.Scanner;

public class BinarySearch {
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
        int res ;

//        Using Simple Method.
        res= BS(arr,elm);

//        Using Recur cation.
        res = BS(arr,elm,0,arr.length-1);
        if(res!=-1){
            System.out.println("Element Found at position : "+res);
        }else {
            System.out.println("Element Not Found...");
        }
    }

    //Using Iterative
    public static int BS(int[] arr, int elm){

        Sort(arr);
        int lb=0,ub,mid;
        ub = arr.length-1;
        while (lb<=ub){
            mid = (lb+ub)/2;
            if(arr[mid]==elm){
                System.out.println("Element Found.");
                return mid;
            } else if (arr[mid]>elm) {
                ub = mid-1;
            }else if (arr[mid]<elm){
                lb = mid + 1;
            }
        }
        return -1;
    }
    public static int[] Sort(int[] arr){

        int min;
        for (int i=0;i<arr.length-1;i++){
            min = i;
            for (int j=i+1;j<arr.length;j++){

                if(arr[j]<arr[min]){
                    min = j;
                }

            }
            if(min!=i){
//                arr[i] = a arr[min] = b
//                a = a + b;
//                b = a - b;
//                a = a - b;
                arr[i] = arr[i] + arr[min];
                arr[min] = arr[i] - arr[min];
                arr[i] = arr[i] - arr[min];
            }
        }
        return arr;
    }

    //Using Recursion
    public static int BS(int[] arr, int elm, int lb, int ub){
        Sort(arr);
        if (lb<=ub){
            int mid;
            mid = (lb+ub)/2;
            if(arr[mid]==elm){
                return mid;
            } else if (arr[mid]>elm) {
                return BS(arr,elm,lb,mid-1) ;
            }else if (arr[mid]<elm){
                return BS(arr,elm,lb+1,ub);
            }
        }
        return -1;
    }
}
