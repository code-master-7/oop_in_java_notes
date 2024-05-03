// Write a program that demonstrates multiple inheritance using interface
interface circle {
    default void print(int r){ System.out.println(3.14*r);}
}
interface square {
    default void print(int l,int m){ System.out.println(l*m); }
}
class p23 implements circle, square {
    public static void main(String[] args) {
        p23 pObj = new p23();
        pObj.print(2);
        pObj.print(5,5);
    }
}