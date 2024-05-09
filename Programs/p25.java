/*
write a program that illustrates interface inheritance interface p is extended by p1 and p2.
then interface p12 inherits from both p1 and p2 each interface declares 1 constant and 1 method.
class q implements p12 instantiate q and invoke each method. each method displays one of the constants.
*/
interface p{ int a = 10; void p(); }
interface p1 extends p{ int b = 20; void p1(); }
interface p2 extends p{ int c = 30; void p2(); }
interface p12 extends p1,p2{ int d = 40; void p3(); }
class Q implements p12{
     public void p3() { System.out.println(a); }
     public void p1() { System.out.println(b); }
     public void p2() { System.out.println(c); }
     public void p() { System.out.println(d); }
}
public class p25 {
     public static void main(String[] args) {
          Q q = new Q();
          q.p(); q.p1(); q.p2(); q.p3();
     }
}