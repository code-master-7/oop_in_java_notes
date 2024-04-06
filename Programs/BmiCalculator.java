import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args){
     double height,weight;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height : ");
        height = sc.nextDouble();

        System.out.println("Enter Weight : ");
        weight = sc.nextDouble();

        System.out.println("Height Is : "+height+" Weight IS : " + weight);
        double bmi = weight/Math.pow((height / 3.28084),2);
        System.out.println("BMI = "+bmi);
    }
}
