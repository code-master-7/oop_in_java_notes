/*
write a program that illustrates interface inheritance interface p is extended by p1 and p2.
then interface p12 inherits from both p1 and p2 each interface declares 1 constant and 1 method.
class q implements p12 instantiate q and invoke each method. each method displays one of the constants.
*/
interface p { int a = 10; void p(); }
interface p1_1 extends p { int b = 20; void p11(); }
interface p2 extends p { int c = 30; void p22(); }
interface p12 extends p1_1, p2 { int d = 40; void p33(); }
class q implements p12 {
    public void p33() { System.out.println(a); }
    public void p22() { System.out.println(c); }
    public void p11() { System.out.println(b); }
    public void p() { System.out.println(d); }
}
public class p25 {
    public static void main(String[] args) {
        q Q = new q();
        Q.p(); Q.p11(); Q.p22(); Q.p33();
    }
}