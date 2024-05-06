public class RuntimePolyMormorphism1 {
    void display(){
        System.out.println("Executing the parent class method");
    }
}

class RuntimePolyMormorphism extends RuntimePolyMormorphism1{
    void display(){
        System.out.println("Executing child class method");
    }

    public static void main(String[] args) {
        RuntimePolyMormorphism1 r1 = new RuntimePolyMormorphism();
        r1.display();
        RuntimePolyMormorphism r2 = new RuntimePolyMormorphism();
        r2.display();
    }
}
