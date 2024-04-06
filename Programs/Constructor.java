

public class Constructor {
    int a;
    public void print(){
        System.out.println("Inside The constructor.");
    }

    //Default Constructor.

    Constructor(){
        print();
    }

    //Parameter rise Constructor.
    Constructor(int x){
        a=x;
    }
    public static void main(String[] args){
        Constructor c = new Constructor(10);
        System.out.println("A = "+c.a);

        c = new Constructor();
        c.print();
        System.out.println(c);
    }
}
