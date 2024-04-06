import java.util.Scanner;

public class MatrixMultiplication {
    public static int[][] Multiplication(int[][] arr1, int[][] arr2){
        int[][] res = new int[arr1.length][arr2.length];
        for(int i=0;i< arr1.length;i++){
            for (int j = 0 ; j< arr2.length;j++){
                res[i][j] =0;
                for (int k = 0 ;k< arr1.length;k++){
                    res[i][j] = res[i][j] + (arr1[i][k] * arr2[k][j]);
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size OF Array : ");
        int size = sc.nextInt();
        int[][] arr1 = new int[size][size];
        int[][] arr2 = new int[size][size];
        System.out.println("Enter the Elements Of Array 1 : ");
        for(int i=0;i<size;i++){
            for (int j = 0 ;j<size ;j++){
                System.out.print("Enter "+i+" "+j+" Number ");
                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println("\nEnter the Elements Of Array 2 : ");
        for(int i=0;i<size;i++){
            for (int j = 0 ;j<size ;j++){
                System.out.print("Enter "+i+" "+j+" Number ");
                arr2[i][j]=sc.nextInt();
            }
        }

        int[][] res;

        res =  Multiplication(arr1,arr2);
        System.out.println("Multiplication of 2 Array Is : ");
        for(int i=0;i<size;i++){
            for (int j = 0 ;j<size ;j++){
                System.out.print(res[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
