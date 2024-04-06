public class ObjectAsParameter {

    int a;
    int b;

    public void display(ObjectAsParameter A,ObjectAsParameter B){

        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("A.a = "+A.a);
        System.out.println("A.b = "+A.b);
        System.out.println("B.a = "+B.a);
        System.out.println("B.c = "+B.b);
    }
    ObjectAsParameter(){

    }
    ObjectAsParameter(int x,int y){
        a= x;
        b=y;
    }


    public static void main(String[] args){
        ObjectAsParameter ob1 = new ObjectAsParameter();
        ObjectAsParameter ob2 = new ObjectAsParameter();
        ob1.a=10;
        ob1.b=20;
        ob2.a=30;
        ob2.b=40;
        ob1.display(ob1,ob2);
    }
}
