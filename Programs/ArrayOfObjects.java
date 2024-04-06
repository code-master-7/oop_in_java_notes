import java.util.Scanner;

public class ArrayOfObjects {
    String name;
    int roll;
    float cgpa;

    ArrayOfObjects(){
        name = "ABC";
        roll = 123;
        cgpa = 5.0f;
    }
    ArrayOfObjects(ArrayOfObjects C){
        name = C.name;
        roll = C.roll;
        cgpa = C.cgpa;
    }
    ArrayOfObjects(String a,int b,float c){
        name = a;
        roll = b;
        cgpa = c;    }

    public void  Grade(ArrayOfObjects A,ArrayOfObjects B){
        System.out.println("Calculating Grade Of Both Students "+A.name+" And "+B.name);
        if(A.cgpa >5){
            System.out.println("Student "+A.name+" having roll no "+A.roll+" Scored The Grade A");
        }else {
            System.out.println("Student "+A.name+" having roll no "+A.roll+" Scored The Grade B");
        }
        if(B.cgpa >5){
            System.out.println("Student "+B.name+" having roll no "+B.roll+" Scored The Grade A");
        }else {
            System.out.println("Student "+B.name+" having roll no "+B.roll+" Scored The Grade B");
        }
    }

    public ArrayOfObjects maxCGPA(ArrayOfObjects A,ArrayOfObjects B){
        if(A.cgpa> B.cgpa){
            return A;
        }else
            return B;
    }

    public static void main(String[] args){
        ArrayOfObjects ob1 = new ArrayOfObjects();
        ArrayOfObjects ob2 = new ArrayOfObjects("Nimesh",1235,9.0f);
        ArrayOfObjects ob3 = new ArrayOfObjects(ob2);
        ob1.Grade(ob1,ob3);
        ArrayOfObjects max = ob1.maxCGPA(ob1,ob3);
        System.out.println("Student having Name "+max.name+" roll no " +max.roll+" Scored max CGPA "+max.cgpa);
    }
}