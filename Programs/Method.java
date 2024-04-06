import java.util.Scanner;

public class Method {
    public static void maxNWithNoArgument(){

        int n1,n2,n3,max;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter N1 : ");
        n1 = sc.nextInt();
        System.out.print("\nEnter N2 : ");
        n2 = sc.nextInt();
        System.out.print("\nEnter N3 : ");
        n3 = sc.nextInt();
        if(n1>n2 && n1>n3){
            max = n1;
        } else if (n2>n3 && n2>n1) {
            max = n2;
        }else{
            max = n3;
        }
        System.out.println("Max Is : "+max);
    }


    public static void maxNWithArgument(int n1,int n2,int n3){

        int max;

        if(n1>n2 && n1>n3){
            max = n1;
        } else if (n2>n3 && n2>n1) {
            max = n2;
        }else{
            max = n3;
        }
        System.out.println("Max Is : "+max);
    }


    public static int maxNWithReturnTypeNoArgument(){

        int n1,n2,n3,max;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter N1 : ");
        n1 = sc.nextInt();
        System.out.print("\nEnter N2 : ");
        n2 = sc.nextInt();
        System.out.print("\nEnter N3 : ");
        n3 = sc.nextInt();
        if(n1>n2 && n1>n3){
            max = n1;

        } else if (n2>n3 && n2>n1) {
            max = n2;
        }else{
            max = n3;
        }
        return max;

    }

    public static int maxNWithReturnTypeWithArgument(int n1,int n2,int n3){

        int max;

        if(n1>n2 && n1>n3){
            max = n1;

        } else if (n2>n3 && n2>n1) {
            max = n2;
        }else{
            max = n3;
        }
        return max;

    }


    public static void main(String[] args){

        int n1,n2,n3;
        Scanner sc = new Scanner(System.in);


        System.out.println("\n****No Return type - With No Argument****");
        maxNWithNoArgument();

        System.out.println("\n****No Return type - With Argument****");
        System.out.print("\nEnter N1 : ");
        n1 = sc.nextInt();
        System.out.print("\nEnter N2 : ");
        n2 = sc.nextInt();
        System.out.print("\nEnter N3 : ");
        n3 = sc.nextInt();maxNWithArgument(n1,n2,n3);

        System.out.println("\n****Return type - With No Argument****");
        System.out.println("Max Is : "+maxNWithReturnTypeNoArgument());

        System.out.println("\n****Return type - With Argument****");
        System.out.print("\nEnter N1 : ");
        n1 = sc.nextInt();
        System.out.print("\nEnter N2 : ");
        n2 = sc.nextInt();
        System.out.print("\nEnter N3 : ");
        n3 = sc.nextInt();
        System.out.println("Max Is : "+maxNWithReturnTypeWithArgument(n1,n2,n3));
    }
}
