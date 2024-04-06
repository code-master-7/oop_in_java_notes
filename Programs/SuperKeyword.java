class person{
    person(){
        int a = 12;
        System.out.println("This is person class.");
    }
}
class Student extends person{
    Student(){
        super();
        System.out.println("This Is Student Class.");
    }
}
public class SuperKeyword {
    public static void main(String[] args){
        Student s1 = new Student();
    }
}
