public class RT {
    public static void main(String[] args) {
        double x = 1.0;
        double y = 2.0;
        double z = x-- + ++y ;
        System.out.println(z);

        int k = 0;
        System.out.println(k + ++k);
        k = 0;
        System.out.println(++k + k);
    }
}
