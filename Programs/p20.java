// write a program that demonstrate use of arithmetic exception, ArrayIndexOutOfBounds exception and Exception
// using multiple try{}catch{}finaly{} block
class p20 {
    public static void main(String[] args) {
        int a[] = new int[2];
        try{a[2] = 1/0;}
        catch (IndexOutOfBoundsException IE){System.out.println(IE);}
        catch (ArithmeticException ae){System.out.println(ae);}
        finally {System.out.println("Finally");}
    }
}