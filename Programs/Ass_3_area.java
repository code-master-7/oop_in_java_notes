import java.util.Scanner;
public class Ass_3_area {
    static float area(float r) {return 3.1415f * r * r;} // circle
    static int area(int h) {return h * h;} // square
    static int area(int h, int w) {return h * w;} // rectangle
    static float area(float b, float l) {return 0.5f * b * l;} //Triangle
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("select\n1. Circle\n2. square\n3. rectangle\n4. Triangle\n");
        int c = sc.nextInt();
        float ans = 0.0f;
        switch (c) {
            case 1: ans = area(sc.nextFloat()); break;
            case 2: ans = area(sc.nextInt()); break;
            case 3: ans = area(sc.nextInt(), sc.nextInt()); break;
            case 4: ans = area(sc.nextFloat(),sc.nextFloat()); break;
            default:
                System.out.println("Enter Valid choice");
                System.exit(0);
        } System.out.println(ans);
    }
}