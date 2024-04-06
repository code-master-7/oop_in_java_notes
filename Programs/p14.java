//Create user defined methods that takes 2 object as parameter
// the class should contain the data such as roll number, name cgpa as a member variable.
// Each object represents student data checked in the cgba of the student four which.
// We have the past object as parameter and if cgpa is less than 5 then declared the student to fail

public class p14 {
    int rn; String name; float cgpa;
    p14(int r, String n,float c){rn = r;name = n;cgpa = c; }
    public static void getResult(p14 o1,p14 o2){
        if(o1.cgpa < 5) System.out.println( o1.name + " is Fail");
        if(o2.cgpa < 5) System.out.println(o2.name + " is Fail");
    }
    public static void main(String[] args) {
        p14 obj1 = new p14(1,"nimesh",9.9f);
        p14 obj2 = new p14(2,"abc",4f);
        getResult(obj1,obj2);
    }
}