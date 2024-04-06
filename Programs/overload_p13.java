import java.util.Scanner;
public class overload_p13 { static float t;
    static void GradeScore(float external){ t += external; }
    static void GradeScore(int mid, int pra){ t += mid + pra; }
    static void GradeScore(int viva){ t += viva; }
    static void print_grade(){
        if(t >130.0f) System.out.println( t + "A");
        else if(t <=130.0f && t >100.0f) System.out.println(t +"B");
        else if(t<=100.0f && t>50.0f) System.out.println(t +"C");
        else System.out.println(t +"F");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of external, mid, practical,viva :");
        float ex = sc.nextFloat();
        int mid = sc.nextInt(),pra = sc.nextInt(),viva = sc.nextInt();
        GradeScore(ex); GradeScore(mid,pra); GradeScore(viva); print_grade();
    }
}