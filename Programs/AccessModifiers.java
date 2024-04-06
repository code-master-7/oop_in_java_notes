class newAccessModifiers{
    private static void p(){
        System.out.println("I am private");
    }
    public static void p2(){
        p();
    }
}

public class AccessModifiers extends newAccessModifiers{
    private void print(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        AccessModifiers ac = new AccessModifiers();
        ac.print();

//        newAccessModifiers nam = new newAccessModifiers();
//        nam.p2();


        ac.p2();
    }
}
