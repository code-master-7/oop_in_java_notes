import java.util.Arrays;

class Min_Max {
    static int len = 5;
    static int [] arr = {9,5,1,3,7} ;
    static void print(int num){ System.out.println(num); }
    static void min(){ print(Arrays.stream(arr).min().getAsInt()); }
    static void max(){ print(Arrays.stream(arr).max().getAsInt()); }
    public static void main(String[] args){ min(); max(); }
}