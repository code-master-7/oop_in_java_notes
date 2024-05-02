// Write a program that demonstrates multiple inheritance using interface
interface circle {
    int r = 2;
    void area(int r);
}

interface square {
    int l = 5, m = 5;
}

public class p23 implements circle, square {
    public void area(int a, int b) {
        System.out.println(a * b);
    } // Area of square

    public void area(int a) {
        System.out.println(3.14 * a);
    } // Area of circle

    public static void main(String[] args) {
        p23 pObj = new p23();
        pObj.area(l, m);
        pObj.area(r);
    }
}